package it.example.domain;

import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository <Restaurant, Long> {
}
