package com.tec.restaurant.sevice;

import com.tec.restaurant.model.Restaurant;
import com.tec.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();

    }

    public Restaurant getRestaurantById(int id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public void  deleteRestaurantById(int id) {
       restaurantRepository.deleteById(id);
    }
    public void saveRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }



}
