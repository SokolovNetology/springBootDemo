package ru.netology.jpa_repository.service;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.netology.jpa_repository.entity.PersonRequest;
import ru.netology.jpa_repository.repository.MyRepository;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public PersonRequest addPerson(PersonRequest person) {
        return myRepository.save(person);
    }

    public ResponseEntity<String> getPersonsByCity(String city) {
        List<PersonRequest> personsByCity = myRepository.findPersonByCityOfLiving(city);
        if (personsByCity.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
    }

    public ResponseEntity<String> getPersonsByAgeLessThan(Integer age) {
        List<PersonRequest> personsByAge = myRepository
                .findPersonByPersonRequisitesAgeLessThanOrderByPersonRequisitesAge(age);
        if (personsByAge.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByAge.toString(), HttpStatus.OK);
    }


    public ResponseEntity<String> getPersonsByNameAndSurname(String name, String surname) {
        Optional<PersonRequest> personsByNameAndSurname = myRepository
                .findPersonByPersonRequisitesNameAndPersonRequisitesSurname(
                        name, surname
                );
        if (personsByNameAndSurname.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByNameAndSurname.get().toString(), HttpStatus.OK);
    }

}