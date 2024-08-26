package ru.netology.jpa_repository.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.jpa_repository.entity.PersonRequisites;
import ru.netology.jpa_repository.dto.PersonRequest;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyRepository extends CrudRepository<PersonRequest, PersonRequisites> {
    List<PersonRequest> findPersonByCityOfLiving(String cityOfLiving);
    List<PersonRequest> findPersonByPersonRequisitesAgeLessThanOrderByPersonRequisitesAge(Integer age );
    Optional<PersonRequest> findPersonByPersonRequisitesNameAndPersonRequisitesSurname(String name, String surname);
}