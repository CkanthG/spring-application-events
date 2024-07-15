package com.sree.events.service;

import com.sree.events.event.ProductReturnEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReturnProductService {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    public void returnProduct(String productId, String productName) {
      log.info("Returning of Product Started");
      eventPublisher.publishEvent(new ProductReturnEvent(this, productId, productName));
      log.info("Returning of Product Ended");
    }
}
