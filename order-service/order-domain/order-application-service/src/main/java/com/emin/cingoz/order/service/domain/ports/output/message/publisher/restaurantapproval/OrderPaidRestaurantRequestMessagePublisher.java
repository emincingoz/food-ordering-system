package com.emin.cingoz.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.emin.cingoz.common.domain.event.publisher.DomainEventPublisher;
import com.emin.cingoz.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
