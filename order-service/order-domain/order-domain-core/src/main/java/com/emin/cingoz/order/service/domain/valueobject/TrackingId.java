package com.emin.cingoz.order.service.domain.valueobject;

import com.emin.cingoz.common.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
