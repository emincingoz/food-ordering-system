package com.emin.cingoz.order.service.domain.dto.message;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import com.emin.cingoz.common.domain.valueobject.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * PaymentResponse will hold the response that return from the payment service to the order service.
 */
@Getter
@Builder
@AllArgsConstructor
public class PaymentResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String paymentId;
    private String customerId;
    private BigDecimal price;
    private Instant createdAt;
    private PaymentStatus paymentStatus;
    private List<String> failureMessages;
}
