package com.theodorciobanoiuviorel.hw5springintro.Service;

import com.theodorciobanoiuviorel.hw5springintro.Model.Product;
import com.theodorciobanoiuviorel.hw5springintro.Repository.ProductRepository;
import com.theodorciobanoiuviorel.hw5springintro.dto.ProductDTO;
import com.theodorciobanoiuviorel.hw5springintro.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public List<ProductDTO> getAllProductDTO() {

        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public Product getById(Integer id){
        return productRepository.findById(id).get();
    }
    public ProductDTO getByIdDTO(Integer id){
        return productMapper.toProductDTO(productRepository.findById(id).get());
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}
