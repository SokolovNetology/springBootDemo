package ru.netology.jpa_repository.mapper;

import lombok.Data;
import org.springframework.stereotype.Component;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.Person;


@Data
@Component
public class PersonMapper {

    public Person toEntity(PersonDTO personDTO) {
        if (personDTO == null) {
            return null;
        }
        Person person = new Person();
        person.setName(personDTO.getName());
        person.setSurname(personDTO.getSurname());
        person.setAge(personDTO.getAge());
        return person;
    }
}