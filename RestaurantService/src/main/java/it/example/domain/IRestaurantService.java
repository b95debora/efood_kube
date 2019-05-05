package it.example.domain;

import java.util.List;

public interface IRestaurantService {
    List<Restaurant> findAll();
    void deleteById(Long id);
    Restaurant findById(Long id);
    Restaurant create (String name, String address);

}
