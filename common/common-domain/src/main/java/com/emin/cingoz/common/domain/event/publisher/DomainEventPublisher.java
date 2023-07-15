package com.emin.cingoz.common.domain.event.publisher;

import com.emin.cingoz.common.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
