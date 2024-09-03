package ru.netology.jpa_repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String surname;
    @Column(unique = true)
    private Integer age;
    @Column(unique = true)
    private String phoneNumber;
    @Column(unique = true)
    private String cityOfLiving;

}

