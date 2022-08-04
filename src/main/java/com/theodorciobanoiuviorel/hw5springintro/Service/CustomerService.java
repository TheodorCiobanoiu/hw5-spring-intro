package com.theodorciobanoiuviorel.hw5springintro.Service;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Repository.CustomerRepository;
import com.theodorciobanoiuviorel.hw5springintro.dto.CustomerDTO;
import com.theodorciobanoiuviorel.hw5springintro.mapper.CustomerMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class CustomerService {

    private final CustomerMapper customerMapper;

    private final CustomerRepository customerRepository;


    public List<Customer> getAllCustomers() {
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll()
                .iterator()
                .forEachRemaining(aux::add);
        return aux;
    }
    public List<CustomerDTO> getAllCustomersDTO() {
        return customerRepository.findAll().stream()
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public Customer getById(Integer id){
        return customerRepository.findById(id).get();
    }
    public CustomerDTO getByIdDTO(Integer id){
        return customerMapper.toCustomerDTO(customerRepository.findById(id).get());
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
    public void deleteById(Integer id){
        customerRepository.deleteById(id);
    }



}


