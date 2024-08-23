package ru.netology.hibernate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonRequisites;

@AllArgsConstructor
@Data
public class PersonMapper {
    private String name;
    private String surname;
    private Integer age;
    private String phoneNumber;
    private String cityOfLiving;

    public Person getPerson() {
        return new Person(
                new PersonRequisites(name, surname, age),
                phoneNumber,
                cityOfLiving);
    }
}
