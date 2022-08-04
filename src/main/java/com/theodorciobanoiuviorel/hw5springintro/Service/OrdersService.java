package com.theodorciobanoiuviorel.hw5springintro.Service;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Model.Orders;
import com.theodorciobanoiuviorel.hw5springintro.Repository.OrderRepository;
import com.theodorciobanoiuviorel.hw5springintro.dto.OrdersDTO;
import com.theodorciobanoiuviorel.hw5springintro.mapper.OrdersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private final OrdersMapper ordersMapper;
    private final OrderRepository orderRepository;

    public List<Orders> getAllOrders(){
        List<Orders> aux = new ArrayList<>();
        orderRepository.findAll()
                .iterator()
                .forEachRemaining(aux::add);
        return aux;
    }

    public List<OrdersDTO> getAllOrdersDTO(){
        return orderRepository.findAll().stream()
                .map(ordersMapper::toOrdersDTO)
                .collect(Collectors.toList());
    }

    public Orders getById(Integer id){
        return orderRepository.findById(id).get();
    }
    public OrdersDTO getByIdDTO(Integer id){
        return ordersMapper.toOrdersDTO(orderRepository.findById(id).get());
    }

    public Orders save(Orders order){
        return orderRepository.save(order);
    }
    public void deleteById(Integer id){
        orderRepository.deleteById(id);
    }

}
