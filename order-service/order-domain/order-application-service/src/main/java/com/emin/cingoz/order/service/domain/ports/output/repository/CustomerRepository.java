package com.emin.cingoz.order.service.domain.ports.output.repository;

import java.util.Optional;
import java.util.UUID;

import com.emin.cingoz.order.service.domain.entity.Customer;

public interface CustomerRepository {
    Optional<Customer> findCustomer(UUID customerId);
}
