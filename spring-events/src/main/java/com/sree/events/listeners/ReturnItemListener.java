package com.sree.events.listeners;

import com.sree.events.event.ProductReturnEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ReturnItemListener {

    @Async
    @EventListener
    public void returnItem(ProductReturnEvent event) {
      log.info("Item: {} Returned to the List", event.getProductName());
    }
}
