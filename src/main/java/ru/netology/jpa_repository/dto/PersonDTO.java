package ru.netology.jpa_repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private String name;
    private String surname;
    private Integer age;
    private String phoneNumber;
    private String cityOfLiving;
}
