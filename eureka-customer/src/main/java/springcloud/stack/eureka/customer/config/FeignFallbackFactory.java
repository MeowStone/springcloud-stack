package springcloud.stack.eureka.customer.config;

import com.netflix.client.ClientException;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import springcloud.stack.eureka.customer.service.IProviderDataService;

@Component
public class FeignFallbackFactory implements FallbackFactory<IProviderDataService> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public IProviderDataService create(Throwable cause) {
        logger.error("remote request cause:{}", cause.getMessage());
        if(cause instanceof ClientException) {
            ClientException exception = (ClientException) cause;
        }

        return null;
    }
}
