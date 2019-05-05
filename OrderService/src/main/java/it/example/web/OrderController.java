package it.example.web;

import it.example.domain.RestaurantServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestaurantServiceAdapter restaurantServiceAdapter;

    /** Crea un nuovo ordine **/
    @PostMapping("/")
    public String newOrder(@RequestBody Long restaurantId) {
        boolean restaurantOk = restaurantServiceAdapter.validateRestaurant(restaurantId);
        return restaurantOk + "";
    }

}
