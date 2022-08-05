package com.theodorciobanoiuviorel.hw5springintro.controllers;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerRestController {

    private final CustomerService customerService;

    @PostMapping("save")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }
}
