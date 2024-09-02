package ru.netology.jpa_repository.service;
import ru.netology.jpa_repository.controller.MyController;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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
@Transactional
public class MyService {
    @Autowired
    private MyRepository myRepository;


    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public PersonDTO createPerson(PersonDTO personDTO){
        Person person = personMapper.toEntity(personDTO);
        person = myRepository.save(person);
        return person.toDto(person);
    }
    public Person addPerson(Person person) {
        return myRepository.save(person);
    }

    public ResponseEntity<String> getPersonsByCity(String city) {
        List<Person> personsByCity = myRepository.findPersonByCityOfLiving(city);
        if (personsByCity.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
    }

    public ResponseEntity<String> getPersonsByAgeLessThan(Integer age) {
        List<Person> personsByAge = myRepository
                .findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(age);
        if (personsByAge.isEmpty()) {
            return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personsByAge.toString(), HttpStatus.OK);
    }


    public ResponseEntity<String> getPersonsByNameAndSurname(String name, String surname) {
        Optional<Person> personsByNameAndSurname = myRepository
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
    List<Person> personsByCity = myRepository.findPersonByCityOfLiving(city);
    if (personsByCity.isEmpty()) {
        return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(personsByCity.toString(), HttpStatus.OK);
}

public ResponseEntity<String> getPersonsByAgeLessThan(Integer age) {
    List<Person> personsByAge = myRepository
            .findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(age);
    if (personsByAge.isEmpty()) {
        return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(personsByAge.toString(), HttpStatus.OK);
}


public ResponseEntity<String> getPersonsByNameAndSurname(String name, String surname) {
    Optional<Person> personsByNameAndSurname = myRepository
            .findPersonByPersonDTONameAndPersonDTOSurname(
                    name, surname
            );
    if (personsByNameAndSurname.isEmpty()) {
        return new ResponseEntity<>("PERSON NOT FOUND", HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(personsByNameAndSurname.get().toString(), HttpStatus.OK);
}

}
}