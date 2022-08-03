package com.theodorciobanoiuviorel.hw5springintro.Repository;


import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.ResultSet;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

    List<Customer> findAll();


}
