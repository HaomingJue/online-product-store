package com.sha.springbootproductstore.service;

import com.sha.springbootproductstore.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProductById(Long id);

    List<Product> findAllProduct();
}
