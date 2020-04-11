package springcloud.stack.eureka.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.stack.eureka.customer.service.RemoteBusinessService;

@RestController
@RequestMapping("customer")

public class CustomerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final RemoteBusinessService service;


    public CustomerController(RemoteBusinessService service) {
        this.service = service;
    }

    @GetMapping("performBusiness")
    public String performBusiness() {
        try {
            service.asyncBusiness();
        } catch (Exception e) {
            logger.error(e.getCause().toString());
        }
        return "业务执行完毕";
    }
}
