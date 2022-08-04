package com.theodorciobanoiuviorel.hw5springintro.mapper;

import com.theodorciobanoiuviorel.hw5springintro.Model.Product;
import com.theodorciobanoiuviorel.hw5springintro.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);
}
