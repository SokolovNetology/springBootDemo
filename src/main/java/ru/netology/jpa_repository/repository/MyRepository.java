package ru.netology.jpa_repository.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonID;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyRepository extends CrudRepository<PersonID ,PersonDTO> {
    List<PersonID> findPersonByCityOfLiving(String cityOfLiving);
    List<PersonID> findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(Integer age );
    Optional<PersonID> findPersonByPersonDTONameAndPersonDTOSurname(String name, String surname);
}