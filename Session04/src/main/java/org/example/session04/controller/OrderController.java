package org.example.session04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {
    @GetMapping("/bai3/orders/{id}")
    @ResponseBody
    public String getOrderDetail(@PathVariable("id") Long id) {
        return "Chi tiet don hang so " + id;
    }
}