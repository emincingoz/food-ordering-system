package com.emin.cingoz.order.service.domain.ports.output.message.publisher.payment;

import com.emin.cingoz.common.domain.event.publisher.DomainEventPublisher;
import com.emin.cingoz.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
