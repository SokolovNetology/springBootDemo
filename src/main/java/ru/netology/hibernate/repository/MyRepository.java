package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.dto.PersonRequest;

import java.util.List;

@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public PersonRequest addPerson(PersonRequest person) {
        entityManager.persist(person);
        return person;
    }

    public List<PersonRequest> getPersonsByCity(String city) {
        return entityManager.createQuery(
                "select p from PersonRequest p where p.city_of_living = " + "'" + city + "'", PersonRequest.class
        ).getResultList();
    }

}
