package org.studi.restaurantreservation.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

@Configuration

public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Restaurant Reservation")
                        .version("1.0.0")
                        .description("This is a simple API for restaurant reservation"));
    }

    @Bean
    GroupedOpenApi GroupedOpenApi(){
        return GroupedOpenApi.builder()
                .group("restaurant-resevration")
                .pathsToMatch("/**")
                .build();
    }
}
