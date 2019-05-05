package it.example.adapter.restaurantService.web;

import it.example.domain.RestaurantServiceAdapter;
import it.example.web.GetRestaurantResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import reactor.core.publisher.Mono;


@Service
public class RestaurantServiceWebClientAdapter implements RestaurantServiceAdapter {

    @Value("${efood.restaurantservice.uri}")
    private String restaurantServiceUri;

    private WebClient webClient;

    public RestaurantServiceWebClientAdapter(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl(restaurantServiceUri).build();
    }

    @Override
    public boolean validateRestaurant(Long restaurantId) {
        String restaurantUrl = restaurantServiceUri + "/restaurants/{restaurantId}";
        GetRestaurantResponse restaurant = null;
        Mono<GetRestaurantResponse> response = webClient
                .get()
                .uri(restaurantUrl, restaurantId)
                .retrieve()
                .bodyToMono(GetRestaurantResponse.class);
        try {
            restaurant = response.block();
        } catch (WebClientException e) {
            //logging
        }
        return restaurant!=null;
    }
}
