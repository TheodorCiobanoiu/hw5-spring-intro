package com.theodorciobanoiuviorel.hw5springintro.controllers;

import com.theodorciobanoiuviorel.hw5springintro.Model.Orders;
import com.theodorciobanoiuviorel.hw5springintro.Service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping("all")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @GetMapping("{id}")
    public Orders getById(@PathVariable Integer id){
        return ordersService.getById(id);
    }

    @PostMapping
    public Orders save(@RequestBody Orders order){
        return ordersService.save(order);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id){
        ordersService.deleteById(id);
    }
}
