package ru.netology.jpa_repository.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.Person;
import ru.netology.jpa_repository.service.MyService;

import java.util.List;
import java.util.Optional;


@RestController
public class MyController {

    private final MyService service;

    public MyController(MyService service) {
        this.service = service;

    }

    @PostMapping("add/person")
    public Optional<Person> creatPerson(@RequestBody PersonDTO personDTO) {
        return service.createPerson(personDTO);
    }

    @GetMapping("persons/by-city")
    public ResponseEntity<String> getPersonsByCity(@RequestParam String city) {
        List<Person> personsByCity = service.getPersonsByCity(city);
        if (personsByCity.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
    }

    @GetMapping("persons/by-age")
    public ResponseEntity<String> getPersonsByAge(@RequestParam Integer age) {
        List<Person> personsByAge = service.getPersonsByAgeLessThan(age);
        if (personsByAge.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByAge.toString(), HttpStatus.OK);
    }

    @GetMapping("persons/by-name-and-surname")
    public ResponseEntity<String> getPersonsByNameAndSurname(
            @RequestParam String name,
            @RequestParam String surname
    ) {
        Optional<Person> personsByNameAndSurname = service.getPersonsByNameAndSurname(name, surname);
        if (personsByNameAndSurname.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByNameAndSurname.get().toString(), HttpStatus.OK);
    }

}