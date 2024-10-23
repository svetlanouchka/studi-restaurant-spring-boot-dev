package org.studi.restaurantreservation.service;

import org.springframework.stereotype.Service;
import org.studi.restaurantreservation.pojo.Client;

import java.util.List;


public interface ClientService {

    List<Client> getAllClient();

    void updateClientById(Long id, Client client);

    void deleteClientById(Long id);

    void createClient(Client client);

    Client getClientById(Long id);


}
