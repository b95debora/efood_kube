package it.example.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantUnitTests {

    private Restaurant restaurant;

    @Before
    public void setup() {
        restaurant = new Restaurant("r2", "a1");
    }

    @Test
    public void testGetName() {
        assertThat(restaurant.getName()).isEqualTo("r1");
    }

    @Test
    public void testGetAddress() {
        assertThat(restaurant.getAddress()).isEqualTo("a1");
    }
}
