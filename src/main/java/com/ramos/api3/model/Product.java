package com.ramos.api3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author javierrampob
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @GeneratedValue 
    private Integer id;
    private String fruits;
    private String category;
    
}

//SELECT customers.name, fruits.fruits
//FROM customers
//JOIN fruits ON customers.fruit_id = fruits.id;
