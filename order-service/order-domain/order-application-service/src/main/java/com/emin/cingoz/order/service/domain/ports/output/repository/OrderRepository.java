package com.emin.cingoz.order.service.domain.ports.output.repository;

import java.util.Optional;

import com.emin.cingoz.order.service.domain.entity.Order;
import com.emin.cingoz.order.service.domain.valueobject.TrackingId;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findByTrackingId(TrackingId trackingId);
}
