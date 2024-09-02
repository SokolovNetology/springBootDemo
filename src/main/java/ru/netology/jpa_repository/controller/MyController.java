package ru.netology.jpa_repository.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.mapper.PersonMapper;

@RestController
public class MyController {

    private final PersonMapper personMapper;


    public MyController(MyService service, PersonMapper personMapper) {
        this.service = service;
        this.personMapper = personMapper;
    }

    @PostMapping("add/person")
    public PersonDTO creatPerson(@RequestBody PersonDTO personDTO) {

        return service.creatPerson(personDTO);
    }

    @GetMapping("persons/by-city")
    public ResponseEntity<String> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("persons/by-age")
    public ResponseEntity<String> getPersonsByAge(@RequestParam Integer age) {
        return service.getPersonsByAgeLessThan(age);
    }

    @GetMapping("persons/by-name-and-surname")
    public ResponseEntity<String> getPersonsByNameAndSurname(
            @RequestParam String name,
            @RequestParam String surname
    ) {
        return service.getPersonsByNameAndSurname(name,surname);
    }

}