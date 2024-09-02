package ru.netology.jpa_repository.mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component

public class PersonMapper {

    public PersonID toEntity(PersonID personID,PersonDTO personDTO) {
        if (personDTO == null) {
            return null;
        }
        PersonID personID = new PersonID();
        personID.setName(personDTO.getName());
        personID.setSurname(personDTO.getSurname());
        personID.setAge(personDTO.getAge());
         return personID;}
}