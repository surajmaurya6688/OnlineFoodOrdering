package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MenuItem;
import com.example.demo.entity.Order;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

    private final MenuItemRepository menuRepo;
    private final OrderRepository orderRepo;

    public OrderService(MenuItemRepository menuRepo, OrderRepository orderRepo) {
        this.menuRepo = menuRepo;
        this.orderRepo = orderRepo;
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order placeOrder(Long menuItemId, int quantity) {
        MenuItem item = menuRepo.findById(menuItemId).orElseThrow();

        Order order = new Order();
        order.setMenuItemId(menuItemId);
        order.setQuantity(quantity);
        order.setTotalPrice(item.getPrice() * quantity);

        return orderRepo.save(order);
    }
}

