package com.theodorciobanoiuviorel.hw5springintro.controllers;

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
    public String getById(Model model, @PathVariable Integer id){
        model.addAttribute("customer", customerService.getById(id));
        return"GetCustomerById";
    }

    @GetMapping("filter/{filter}/{filterValue}")
    public String getCustomerFilter(Model model, @PathVariable String filter, @PathVariable String filterValue){
        model.addAttribute("customers", customerService.getAllCustomers());
        model.addAttribute("filterValue", filterValue);
        model.addAttribute("filter", filter);
        return "ViewCustomerFiltered";

    }

}
