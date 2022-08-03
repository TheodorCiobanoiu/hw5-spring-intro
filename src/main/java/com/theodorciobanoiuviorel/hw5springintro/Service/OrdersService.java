package com.theodorciobanoiuviorel.hw5springintro.Service;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Model.Orders;
import com.theodorciobanoiuviorel.hw5springintro.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private final OrderRepository orderRepository;

    public List<Orders> getAllOrders(){
        List<Orders> aux = new ArrayList<>();
        orderRepository.findAll()
                .iterator()
                .forEachRemaining(aux::add);
        return aux;
    }
    public Orders getById(Integer id){
        return orderRepository.findById(id).get();
    }

    public Orders save(Orders order){
        return orderRepository.save(order);
    }
    public void deleteById(Integer id){
        orderRepository.deleteById(id);
    }

}
