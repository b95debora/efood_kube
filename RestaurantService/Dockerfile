FROM openjdk:8
ADD ./build/libs/RestaurantService.jar restaurantService.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "restaurantService.jar"]