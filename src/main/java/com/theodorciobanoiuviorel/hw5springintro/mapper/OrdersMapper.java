package com.theodorciobanoiuviorel.hw5springintro.mapper;

import com.theodorciobanoiuviorel.hw5springintro.Model.Orders;
import com.theodorciobanoiuviorel.hw5springintro.dto.OrdersDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersMapper {
    OrdersDTO toOrdersDTO(Orders order);

}
