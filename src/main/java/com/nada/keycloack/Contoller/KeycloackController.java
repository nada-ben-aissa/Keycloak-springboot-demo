package com.nada.keycloack.Contoller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kc")
public class KeycloackController {
    @GetMapping("/say-hello")
    public String sayHello(){
        return"HELLO FROM SPRINGBOOT AND KEYCLOACK";
    }
    @PreAuthorize("hasRole('client_admin')")
    @GetMapping("/say-hello2")
    public String sayHelloWenAuthorized(){
        return"HELLO FROM SPRINGBOOT AND KEYCLOACK -ADMIN";
    }

}
