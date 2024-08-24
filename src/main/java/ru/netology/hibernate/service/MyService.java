package ru.netology.hibernate.service;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.dto.PersonRequest;
import ru.netology.hibernate.repository.MyRepository;

import java.util.List;

@Service
@Transactional
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public PersonRequest addPerson(PersonRequest person) {
        return myRepository.addPerson(person);
    }

    public ResponseEntity<String> getPersonsByCity(String city) {
        List<PersonRequest> personsByCity = myRepository.getPersonsByCity(city);
        if (personsByCity.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
    }

}