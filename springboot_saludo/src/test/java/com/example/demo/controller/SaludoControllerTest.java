package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SaludoControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void obtenerSaludo_deberiaRetornarMensajeEsperado() {
        ResponseEntity<String> response = restTemplate.getForEntity("/api/saludo", String.class);
        System.out.println("Respuesta recibida: " + response.getBody());
        assertThat(response.getBody()).isEqualTo("¡Hola, API RESTful!");
    }
}
