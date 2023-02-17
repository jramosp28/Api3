package com.ramos.api3.controller;

import com.ramos.api3.model.Client;
import com.ramos.api3.service.ClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javierrampob
 */
@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @GetMapping("/client")
    public List<Client> listClient(){
        return clientService.listClient();
    }
    
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Integer id) {
        try {
            Client client = clientService.getClientById(id);
            return ResponseEntity.ok(client);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/client")
    public void newProduct(@RequestBody Client client) {
        clientService.saveClient(client);
    }
    
    @PutMapping("/client/{id}")
    public ResponseEntity<?> editClient(@RequestBody Client client, @PathVariable Integer id) {
        try {
            Client clientExist = clientService.getClientById(id);
            clientExist.setName(client.getName());
            clientExist.setEmail(client.getEmail());
            clientService.saveClient(clientExist);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/client/{id}")
    public void deleteClient(@PathVariable Integer id) {
        clientService.removeClient(id);
    }
}
