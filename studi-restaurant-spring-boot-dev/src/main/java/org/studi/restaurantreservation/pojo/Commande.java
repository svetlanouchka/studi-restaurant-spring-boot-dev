package org.studi.restaurantreservation.pojo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.studi.restaurantreservation.pojo.composite.CommandeId;

@Entity
@Getter
@Setter
public class Commande {

    @EmbeddedId
    private CommandeId commandeId;

    private Integer quantite;
}
