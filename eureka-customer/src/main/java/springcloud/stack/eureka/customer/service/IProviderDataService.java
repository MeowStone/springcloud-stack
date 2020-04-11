package springcloud.stack.eureka.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import springcloud.stack.eureka.customer.config.FeignFallbackFactory;

@FeignClient(name="eureka-provider", fallbackFactory = FeignFallbackFactory.class)
public interface IProviderDataService {

    @GetMapping(value = "/provider/getProviderData", consumes = "application/json")
    String getProviderData() throws Exception;
}
