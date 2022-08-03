package com.theodorciobanoiuviorel.hw5springintro.Service;

import com.theodorciobanoiuviorel.hw5springintro.Model.Customer;
import com.theodorciobanoiuviorel.hw5springintro.Model.Product;
import com.theodorciobanoiuviorel.hw5springintro.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProduct() {
        List<Product> aux = new ArrayList<>();
        productRepository.findAll()
                .iterator()
                .forEachRemaining(aux::add);
        return aux;
    }

    public Product getById(Integer id){
        return productRepository.findById(id).get();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}
