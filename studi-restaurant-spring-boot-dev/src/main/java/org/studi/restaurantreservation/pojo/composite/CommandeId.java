package org.studi.restaurantreservation.pojo.composite;

import jakarta.persistence.*;
import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.pojo.TableRestaurant;

import java.io.Serializable;

@Embeddable
public class CommandeId implements Serializable {
 
    @ManyToOne
    @JoinColumn(name="table_id")
    private TableRestaurant tableId;

    @ManyToOne
    @JoinColumn(name="plat_id")
    private Plat platId;
}
