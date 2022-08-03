package com.theodorciobanoiuviorel.hw5springintro.Repository;

import com.theodorciobanoiuviorel.hw5springintro.Model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders,Integer> {
    public List<Orders> findAll();
}
