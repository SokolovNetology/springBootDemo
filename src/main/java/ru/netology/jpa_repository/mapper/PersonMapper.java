package ru.netology.jpa_repository.mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.Person;
import ru.netology.jpa_repository.service.*;
@AllArgsConstructor
@NoArgsConstructor
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
         return person;}
}