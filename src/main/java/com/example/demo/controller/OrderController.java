package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.MenuItem;
import com.example.demo.entity.Order;
import com.example.demo.entity.Restaurant;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.repository.RestaurentRepository;
import com.example.demo.service.OrderService;


import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final RestaurentRepository restaurantRepo;
    private final MenuItemRepository menuRepo;
    private final OrderService orderService;

    public OrderController(RestaurentRepository restaurantRepo,
                           MenuItemRepository menuRepo,
                           OrderService orderService) {
        this.restaurantRepo = restaurantRepo;
        this.menuRepo = menuRepo;
        this.orderService = orderService;
    }

    // Add restaurant
    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    // Get all restaurants
    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurantRepo.findAll();
    }

    // Add menu item
    @PostMapping("/menu")
    public MenuItem addMenu(@RequestBody MenuItem menu) {
        return menuRepo.save(menu);
    }

    // Get all menu items
    @GetMapping("/menu")
    public List<MenuItem> getMenu() {
        return menuRepo.findAll();
    }

    // Place order
    @PostMapping("/order")
    public Order placeOrder(@RequestParam Long menuItemId, @RequestParam int quantity) {
        return orderService.placeOrder(menuItemId, quantity);
    }

    // Get all orders
    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}

