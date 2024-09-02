package ru.netology.jpa_repository.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonID;
import ru.netology.jpa_repository.mapper.PersonMapper;
import ru.netology.jpa_repository.repository.MyRepository;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MyService {
    @Autowired
    private MyRepository myRepository;
    @Autowired
    private PersonMapper personMapper;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
    public PersonDTO createPersonID(PersonDTO personDTO){
        PersonID personID = personMapper.toEntity(personDTO);
        personID = myRepository.save(personID);
        return personMapper.toEntity(personID);
    }
    public PersonID addPerson(PersonID personID) {
        return myRepository.save(personID);
    }

    public ResponseEntity<String> getPersonsByCity(String city) {
        List<PersonID> personsByCity = myRepository.findPersonByCityOfLiving(city);
        if (personsByCity.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
    }

    public ResponseEntity<String> getPersonsByAgeLessThan(Integer age) {
        List<PersonID> personsByAge = myRepository
                .findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(age);
        if (personsByAge.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByAge.toString(), HttpStatus.OK);
    }


    public ResponseEntity<String> getPersonsByNameAndSurname(String name, String surname) {
        Optional<PersonID> personsByNameAndSurname = myRepository
                .findPersonByPersonDTONameAndPersonDTOSurname(
                        name, surname
                );
        if (personsByNameAndSurname.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByNameAndSurname.get().toString(), HttpStatus.OK);
    }

}

    public ResponseEntity<String> getPersonsByCity(String city) {
        List<PersonID> personsByCity = myRepository.findPersonByCityOfLiving(city);
        if (personsByCity.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
    }

    public ResponseEntity<String> getPersonsByAgeLessThan(Integer age) {
        List<PersonID> personsByAge = myRepository
                .findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(age);
        if (personsByAge.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByAge.toString(), HttpStatus.OK);
    }


    public ResponseEntity<String> getPersonsByNameAndSurname(String name, String surname) {
        Optional<PersonID> personsByNameAndSurname = myRepository
                .findPersonByPersonDTONameAndPersonDTOSurname(
                        name, surname
                );
        if (personsByNameAndSurname.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByNameAndSurname.get().toString(), HttpStatus.OK);
    }

}