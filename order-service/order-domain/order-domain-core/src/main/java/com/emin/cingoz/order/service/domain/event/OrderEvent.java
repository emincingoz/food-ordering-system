package com.emin.cingoz.order.service.domain.event;

import java.time.ZonedDateTime;

import com.emin.cingoz.common.domain.event.DomainEvent;
import com.emin.cingoz.order.service.domain.entity.Order;

// To prevent code duplicate, abstract class for we do not want to create object of this class.
public abstract class OrderEvent implements DomainEvent<Order> {
    private final Order order;
    private final ZonedDateTime createdAt;

    public OrderEvent(Order order, ZonedDateTime createdAt) {
        this.order = order;
        this.createdAt = createdAt;
    }

    public Order getOrder() {
        return order;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
