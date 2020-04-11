package springcloud.stack.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.stack.eureka.client.model.DataMsg;

@RestController
@RequestMapping("provider")
public class EurekaProviderController {

    @GetMapping("getProviderData")
    public DataMsg getProviderData() {
        return new DataMsg("provider-data", "this data came from one of eureka provider server");
    }
}
