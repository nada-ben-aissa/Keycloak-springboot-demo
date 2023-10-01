package com.nada.keycloack.Contoller;

import com.nada.keycloack.domain.details;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kc")
@CrossOrigin
public class KeycloackController {
    @GetMapping("/say-hello")
    public String sayHello(){
        return"HELLO FROM SPRINGBOOT AND KEYCLOACK";
    }
    @PreAuthorize("hasRole('client_admin')")
    @GetMapping("/say-hello2")
    public details sayHelloWenAuthorized(){
        details d = new details(1269L,"HELLO FROM SPRINGBOOT");
        return d;
    }

}
