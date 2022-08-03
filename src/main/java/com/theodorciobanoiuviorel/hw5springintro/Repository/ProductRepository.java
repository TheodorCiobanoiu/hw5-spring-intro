package com.theodorciobanoiuviorel.hw5springintro.Repository;

import com.theodorciobanoiuviorel.hw5springintro.Model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
}
