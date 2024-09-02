package ru.netology.jpa_repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.jpa_repository.dto.PersonDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {

    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String phoneNumber;
    private String cityOfLiving;


}
