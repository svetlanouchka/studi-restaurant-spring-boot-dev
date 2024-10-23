package org.studi.restaurantreservation;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.studi.restaurantreservation.ws.ApiRegistration;
import org.springframework.http.MediaType;
import org.studi.restaurantreservation.ws.PlatWs;
import org.studi.restaurantreservation.service.PlatService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PlatWs.class)

public class PlatWsTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private PlatService platService;

        //test si on peux créer un plat

        @Test
        public void testCreatePlat() throws Exception {
            mockMvc.perform(post("/" + ApiRegistration.REST_API + ApiRegistration.REST_PLAT)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{" + 
                    "\"libelle\": \"tartiflette\"," +
                    "\"description\": \"tartiflette montagnarde\", " +
                    "\"prix\": 5" +
                    "}"))
                    .andExpect(status().isOk());
            }
        }
                    
        

