package ru.netology.jpa_repository.mapper;

import ru.netology.jpa_repository.entity.PersonRequest;

public class PersonMapper {
    public PersonRequest getPerson() {

        return new PersonRequest(personDTO,phoneNumber,cityOfLiving);
    }
}
