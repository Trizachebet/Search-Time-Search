package com.java.searchrestapi.service;

import com.java.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
