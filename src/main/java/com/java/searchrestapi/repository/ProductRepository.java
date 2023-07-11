package com.java.searchrestapi.repository;

import com.java.searchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //using JPQL
@Query("SELECT P FROM Product P WHERE "+
"P.name LIKE CONCAT ('%', query, '%')"+
"Or P.description LIKE CONCAT('%', :query,'%')")
    List<Product> searchProducts(String query);


//Using sql query
   @Query(value ="SELECT * FROM products p WHERE "+
          "p.name LIKE CONCAT('%', :query, '%')"+
           "Or p.description LIKE CONCAT ('%', :query, '%')", nativeQuery = true)
   List<Product> searchProductsSQL(String query);
}
