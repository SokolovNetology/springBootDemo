package ru.netology.jpa_repository.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.jpa_repository.entity.PersonRequest;
import ru.netology.jpa_repository.service.MyService;

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