package org.studi.restaurantreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studi.restaurantreservation.pojo.Client;
import org.studi.restaurantreservation.repository.ClientRepository;
import org.studi.restaurantreservation.service.ClientService;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public void updateClientById(Long id, Client client) {

        //1. recuperation
        Client oldClient = getClientById(id);

        if(oldClient != null){
            //2. modification
            oldClient.setNom(client.getNom());
            oldClient.setPrenom(client.getPrenom());
            oldClient.setTableRestaurant(client.getTableRestaurant());

            //3. insertion en BDD ( le remettre)
            clientRepository.save(oldClient);
        }
    }

    @Override
    public void deleteClientById(Long id) {
        this.clientRepository.deleteById(id);
    }

    @Override
    public void createClient(Client client) {
        this.clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return this.clientRepository.findById(id).orElse(null);
    }
}
