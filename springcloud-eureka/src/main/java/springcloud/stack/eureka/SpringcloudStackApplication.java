package springcloud.stack.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动作为注册中心节点
public class SpringcloudStackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStackApplication.class, args);
    }

}
