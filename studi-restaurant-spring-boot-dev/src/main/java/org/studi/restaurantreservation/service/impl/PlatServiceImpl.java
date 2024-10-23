package org.studi.restaurantreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.repository.PlatRepository;
import org.studi.restaurantreservation.service.PlatService;

import java.util.List;

@Service
public class PlatServiceImpl implements PlatService {

    @Autowired
    private PlatRepository platRepository;

    @Override
    public List<Plat> getAllPlat() {
        return platRepository.findAll();
    }

    @Override
    public void updatePlatById(Long id, Plat plat) {
        //1. recuperation de l'element
        Plat oldPlat = getPlatById(id);

        if(oldPlat != null){
            //2. modification
            oldPlat.setPrix(plat.getPrix());
            oldPlat.setDescription(plat.getDescription());
            oldPlat.setLibelle(plat.getLibelle());
            platRepository.save(oldPlat);
        }
    }

    @Override
    public void deletePlatById(Long id) {
            platRepository.deleteById(id);
    }

    @Override
    public void createPlat(Plat plat) {
            platRepository.save(plat);
    }

    @Override
    public Plat getPlatById(Long id) {
        return platRepository.findById(id).orElse(null);
    }
}
