package ru.netology.jpa_repository.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyRepository extends CrudRepository<Person ,PersonDTO> {
    List<Person> findPersonByCityOfLiving(String cityOfLiving);
    List<Person> findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(Integer age );
    Optional<Person> findPersonByPersonDTONameAndPersonDTOSurname(String name, String surname);
}