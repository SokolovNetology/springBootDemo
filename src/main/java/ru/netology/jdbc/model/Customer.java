package ru.netology.jdbc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private final String name;
    private final String surname;
    private final int age;
    private final String phone_number;

    public Customer(String name, String surname, int age, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}