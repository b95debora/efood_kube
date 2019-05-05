package it.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RestaurantService implements IRestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> findAll() {
        return (List<Restaurant>)restaurantRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.restaurantRepository.deleteById(id);
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    @Override
    public Restaurant create(String name, String address) {
        Restaurant restaurant = Restaurant.create(name, address);
        restaurant = restaurantRepository.save(restaurant);
        return restaurant;
    }

}
