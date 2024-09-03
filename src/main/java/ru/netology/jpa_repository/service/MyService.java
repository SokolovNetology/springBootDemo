package ru.netology.jpa_repository.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.Person;
import ru.netology.jpa_repository.mapper.PersonMapper;
import ru.netology.jpa_repository.repository.MyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MyService {

    private final MyRepository myRepository;

    private final PersonMapper personMapper;


    public MyService(MyRepository myRepository, PersonMapper personMapper) {
        this.myRepository = myRepository;
        this.personMapper = personMapper;

    }

    public Optional<Person> createPerson(PersonDTO personDTO) {
        Person person = personMapper.toEntity(personDTO);
        return Optional.of(myRepository.save(person));
    }

    public List<Person> getPersonsByCity(String city) {
        return myRepository.findPersonByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThan(Integer age) {
        return myRepository
                .findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(age);
    }

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return myRepository
                .findPersonByPersonDTONameAndPersonDTOSurname(
                        name, surname
                );
    }

}











