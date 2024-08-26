package ru.netology.hibernate.mapper;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.hibernate.dto.PersonRequest;
import ru.netology.hibernate.entity.PersonRequisites;

@AllArgsConstructor
@Data
public class PersonMapper<Person> {

    public PersonRequest getPerson() {

        return new PersonRequest();
    }

}

