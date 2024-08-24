package ru.netology.hibernate.mapper;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.hibernate.dto.PersonRequest;
import ru.netology.hibernate.entity.PersonRequisites;

@AllArgsConstructor
@Data
public class PersonMapper<Person> {
    private String name;
    private String surname;
    private Integer age;
    private String phoneNumber;
    private String cityOfLiving;


    public PersonRequest getPerson() {
        new PersonRequest(
                new PersonRequisites(name, surname, age),
                phoneNumber, cityOfLiving);
        return new PersonRequest();
    }

}

