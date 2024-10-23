package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studi.restaurantreservation.pojo.Commande;
import org.studi.restaurantreservation.pojo.composite.CommandeId;

public interface CommandeRepository extends JpaRepository<Commande, CommandeId> {
}