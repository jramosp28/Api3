/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Client {
    @Id @GeneratedValue 
    private Integer id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "fruits")
    private String fruits;
}
