package com.theodorciobanoiuviorel.hw5springintro.Service;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;


    public List<Customer> getAllCustomers() {
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll()
                .iterator()
                .forEachRemaining(aux::add);
        return aux;
    }

    public Customer getById(Integer id){
        return customerRepository.findById(id).get();
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
    public void deleteById(Integer id){
        customerRepository.deleteById(id);
    }



}


