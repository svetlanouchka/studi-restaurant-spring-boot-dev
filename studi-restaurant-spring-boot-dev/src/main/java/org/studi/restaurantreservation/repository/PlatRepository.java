package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.studi.restaurantreservation.pojo.Plat;

import java.util.List;

@Repository
public interface PlatRepository extends JpaRepository<Plat,Long> {

    List<Plat> findAllByPrixLessThanEqual(Float prix);
}
