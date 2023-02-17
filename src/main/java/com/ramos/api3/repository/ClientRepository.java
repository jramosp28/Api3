package com.ramos.api3.repository;

import com.ramos.api3.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javierrampob
 */
public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}