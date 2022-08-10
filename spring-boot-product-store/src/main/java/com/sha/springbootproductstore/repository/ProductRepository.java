package com.sha.springbootproductstore.repository;

import com.sha.springbootproductstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
