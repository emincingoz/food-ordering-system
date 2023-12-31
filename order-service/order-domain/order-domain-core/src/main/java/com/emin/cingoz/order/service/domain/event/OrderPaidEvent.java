package com.emin.cingoz.order.service.domain.event;

import java.time.ZonedDateTime;

import com.emin.cingoz.order.service.domain.entity.Order;

public class OrderPaidEvent extends OrderEvent {
    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
