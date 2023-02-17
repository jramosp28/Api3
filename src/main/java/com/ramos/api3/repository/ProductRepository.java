package com.ramos.api3.repository;

import com.ramos.api3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javierrampob
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
