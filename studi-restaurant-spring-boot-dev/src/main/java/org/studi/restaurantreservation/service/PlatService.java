package org.studi.restaurantreservation.service;

import org.springframework.stereotype.Service;
import org.studi.restaurantreservation.pojo.Plat;

import java.util.List;


public interface PlatService {

    List<Plat> getAllPlat();

    void updatePlatById(Long id, Plat plat);

    void deletePlatById(Long id);

    void createPlat(Plat plat);

    Plat getPlatById(Long id);
}
