package com.example.cliente_evaluacion_final.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

    @GetMapping("/public")
    public String publicApi(){
        return "Bienvenido a la API pública. Aquí puedes acceder sin restricciones";
    }
    @GetMapping("/private")
    public String privateApi(){
        return "Bienvenido a la  API PRIVADA";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminApi() {
        return "Bienvendios Administradores";
    }
}