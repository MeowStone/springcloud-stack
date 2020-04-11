package springcloud.stack.eureka.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ThreadPoolConfig {


    @Bean()
    public Executor taskExecutor() {
        int coreNum = Runtime.getRuntime().availableProcessors();

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(coreNum*2);
        taskExecutor.setMaxPoolSize(coreNum*3);
        taskExecutor.setQueueCapacity(5);
        taskExecutor.setThreadNamePrefix("taskExecutor-");
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        taskExecutor.initialize();
        return taskExecutor;
    }
}
