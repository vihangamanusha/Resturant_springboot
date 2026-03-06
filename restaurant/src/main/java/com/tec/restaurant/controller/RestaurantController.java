package com.tec.restaurant.controller;


import com.tec.restaurant.model.Restaurant;
import com.tec.restaurant.sevice.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String ViewHomePage(Model model) {
        model.addAttribute("restaurants", restaurantService.getAllRestaurants());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable("id") int id, Model model) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        model.addAttribute("restaurant", restaurant);
        return "edit";
    }


}
