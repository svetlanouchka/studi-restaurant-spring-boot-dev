package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.studi.restaurantreservation.pojo.TableRestaurant;

@Repository
public interface TableRestaurantRepository extends JpaRepository<TableRestaurant, Long> {

}