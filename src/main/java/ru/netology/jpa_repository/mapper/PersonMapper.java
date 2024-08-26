package ru.netology.jpa_repository.mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.jpa_repository.dto.PersonRequest;

@AllArgsConstructor
@Data
public class PersonMapper<Person> {

    public PersonRequest getPerson() {

        return new PersonRequest();
    }

}

