package ru.netology.spring_boot_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.spring_boot_rest.model.Authorities;
import ru.netology.spring_boot_rest.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }


    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(
            @RequestParam("user") String user,
            @RequestParam("password") String password
    ) {
        return service.getAuthorities(user, password);
    }

    //For test
    @GetMapping("/add/user")
    public boolean addUser(
            @RequestParam("user") String user,
            @RequestParam("password") String password) {
        return service.addUser(user, password);
    }

    @GetMapping("/add/admin")
    public boolean addAdmin(
            @RequestParam("user") String user,
            @RequestParam("password") String password) {
        return service.addAdmin(user, password);
    }
}