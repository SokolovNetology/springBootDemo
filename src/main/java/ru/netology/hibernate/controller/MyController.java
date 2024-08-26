package ru.netology.hibernate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.hibernate.dto.PersonRequest;
import ru.netology.hibernate.mapper.PersonMapper;
import ru.netology.hibernate.service.MyService;

@RestController
public class MyController {
    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @PostMapping("add/person")
    public PersonRequest addPerson(@RequestBody PersonRequest personRequest) {
        System.out.println(personRequest);
        return service.addPerson(personRequest.getPerson());
    }

    @GetMapping("persons/by-city")
    public ResponseEntity<String> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }

}
