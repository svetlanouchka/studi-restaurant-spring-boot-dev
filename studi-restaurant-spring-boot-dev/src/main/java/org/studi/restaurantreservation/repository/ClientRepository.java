package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.studi.restaurantreservation.pojo.Client;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    List<Client> findClientByNom(String nom);
}
