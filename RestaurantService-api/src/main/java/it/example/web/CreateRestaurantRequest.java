package it.example.web;

public class CreateRestaurantRequest {
    private String address;
    private String name;

    public CreateRestaurantRequest() {
    }

    public CreateRestaurantRequest(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
