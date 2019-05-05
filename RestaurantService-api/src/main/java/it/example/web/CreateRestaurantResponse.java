package it.example.web;

public class CreateRestaurantResponse {

    private Long restaurantId;

    public CreateRestaurantResponse(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public CreateRestaurantResponse() {
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
