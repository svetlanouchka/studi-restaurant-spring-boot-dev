package org.studi.restaurantreservation.ws;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.service.ClientService;
import org.studi.restaurantreservation.service.PlatService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


import java.util.List;

@RestController
@Tag(name="Plat", description="Gestion des plats")
@RequestMapping(ApiRegistration.REST_API + ApiRegistration.REST_PLAT)
public class PlatWs {

    @Autowired
    private PlatService platService;

    @Operation(
            summary = "Obtenir tous les plats",
            description = "Les plats sont retournés sous forme de liste",
            tags = {"Plat", "get"}
    )

    @GetMapping
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Plat.class))),
    })

    public List<Plat> getAllPlat(){
        return platService.getAllPlat();
    }

    @Operation(
        summary = "Obtenir un plat par son id",
        description = "Le plat est retourné"
    )
    @GetMapping("/{id}")
    public Plat getPlatById( 
        @Parameter(description = "Identifiant du plat", required = true)
    @PathVariable("id") Long id){
        return platService.getPlatById(id);
    }

    @ApiResponses({
        @ApiResponse(responseCode = "200"),
    })

    @Operation(
        summary = "Supprimer un plat par son id",
        description = "Suppression de la donnée de la base de données, irréversible"
    )

    @DeleteMapping("/{id}")
    public void deletePlatById(@PathVariable("id") Long id){
        platService.deletePlatById(id);
    }

    // création
    @PostMapping
    public void createPlat(@RequestBody Plat plat){
        platService.createPlat(plat);
    }
    //mise à jour
    @ApiResponses({
        @ApiResponse(responseCode = "200"),
    })

    @Operation(
        summary = "Mise à jour d'un plat par son id",
        description = "Mise à jour de la donnée de la base de données"
    )

    @PutMapping("/{id}")
    public void updatePlatById(@RequestBody Plat plat,
                            @PathVariable("id") Long id){
        platService.updatePlatById(id,plat);
    }





}
