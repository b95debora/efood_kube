package it.example.web;

import java.util.List;

public class GetRestaurantsResponse {
    private List<GetRestaurantResponse> restaurants;

    public GetRestaurantsResponse(List<GetRestaurantResponse> restaurants) {
        this.restaurants = restaurants;
    }

    public GetRestaurantsResponse() {
    }

    public List<GetRestaurantResponse> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<GetRestaurantResponse> restaurants) {
        this.restaurants = restaurants;
    }
}
