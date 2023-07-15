package com.emin.cingoz.order.service.domain.ports.output.repository;

import java.util.Optional;

import com.emin.cingoz.order.service.domain.entity.Restaurant;

public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);

}
