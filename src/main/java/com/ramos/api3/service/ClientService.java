package com.ramos.api3.service;

import com.ramos.api3.model.Client;
import com.ramos.api3.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javierrampob
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    
    public List<Client>listClient(){
        
        return clientRepository.findAll();
    }
    
    public void saveClient(Client client){
        clientRepository.save(client);
    }
    
    public Client getClientById(Integer id){
        return clientRepository.findById(id).get();
    }
    
    public void editClient(Client client, Integer id){
       clientRepository.existsById(id);
   }
    
    public void removeClient (Integer id){
        clientRepository.deleteById(id);
    }
}