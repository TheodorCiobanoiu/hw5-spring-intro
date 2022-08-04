package com.theodorciobanoiuviorel.hw5springintro.mapper;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);
}
