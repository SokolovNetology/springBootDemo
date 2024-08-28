package ru.netology.jpa_repository.mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonRequest;

@AllArgsConstructor
@Data
public class PersonMapper  {

    public PersonRequest getPerson(PersonDTO personDTO) {
           
           return new PersonRequest();
    }
    }

