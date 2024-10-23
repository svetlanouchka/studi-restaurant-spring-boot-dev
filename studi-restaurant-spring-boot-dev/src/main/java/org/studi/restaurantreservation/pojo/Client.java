package org.studi.restaurantreservation.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String nom;
    private String prenom;

    @ManyToOne
    private TableRestaurant tableRestaurant;

}
