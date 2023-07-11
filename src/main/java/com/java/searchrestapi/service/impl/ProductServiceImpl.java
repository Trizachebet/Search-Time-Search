package com.java.searchrestapi.service.impl;

import com.java.searchrestapi.entity.Product;
import com.java.searchrestapi.repository.ProductRepository;
import com.java.searchrestapi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public List<Product> searchProduct(String query) {
        List<Product> products= productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
