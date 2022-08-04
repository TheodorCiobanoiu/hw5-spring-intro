package com.theodorciobanoiuviorel.hw5springintro.controllers;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("customers/view")
public class CustomerViewController {

    private final CustomerService customerService;

    @GetMapping("all")
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "GetCustomers";
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id){
        return customerService.getById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }


    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

}
