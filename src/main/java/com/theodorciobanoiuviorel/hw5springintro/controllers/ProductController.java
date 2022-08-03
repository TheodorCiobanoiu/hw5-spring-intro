package com.theodorciobanoiuviorel.hw5springintro.controllers;

import com.theodorciobanoiuviorel.hw5springintro.Model.Product;
import com.theodorciobanoiuviorel.hw5springintro.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("all")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public Product save(Product product){
        return productService.save(product);
    }

    @DeleteMapping
    public void deleteById(Integer id){
        productService.deleteById(id);
    }
}
