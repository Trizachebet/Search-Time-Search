package com.java.searchrestapi.controller;

import com.java.searchrestapi.entity.Product;
import com.java.searchrestapi.repository.ProductRepository;
import com.java.searchrestapi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {
    private ProductService productService;
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProduct(query));
    }
@PostMapping
    public Product createProduct(Product product){
    return productService.createProduct(product);

}

}
