package com.sree.events.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Setter
@Getter
public class ProductReturnEvent extends ApplicationEvent {
    private String productId;
    private String productName;

    public ProductReturnEvent(Object source, String productId, String productName) {
        super(source);
        this.productId = productId;
        this.productName = productName;
    }
}
