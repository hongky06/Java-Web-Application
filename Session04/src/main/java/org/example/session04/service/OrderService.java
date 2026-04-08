package org.example.session04.service;

import org.example.session04.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository; // Spring tự inject
    }
    public String getAllOrders() {
        return orderRepository.getAllOrders();
    }
    public String getOrderById(Long id) {
        return orderRepository.getOrderById(id);
    }
}