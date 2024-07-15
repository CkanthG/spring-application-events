package com.sree.events.listeners;

import com.sree.events.event.ProductReturnEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ReturnAmountListener {

    @Async
    @EventListener
    public void returnAmount(ProductReturnEvent event) {
        log.info("Initiated Return Amount for Product ID: {}", event.getProductId());
    }

}
