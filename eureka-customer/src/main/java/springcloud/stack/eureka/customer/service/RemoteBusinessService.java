package springcloud.stack.eureka.customer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RemoteBusinessService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final IProviderDataService providerDataService;

    public RemoteBusinessService(IProviderDataService providerDataService) {
        this.providerDataService = providerDataService;
    }

    @Async()
    public void asyncBusiness() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        logger.info("here is {}!", threadName);
        Thread.sleep(1000);
        String result = null;
        try {
            result = providerDataService.getProviderData();
        } catch (Exception e) {
            logger.error(e.getCause().toString());
        }
        logger.info("i got data from provider! content: {}", result);
    }
}
