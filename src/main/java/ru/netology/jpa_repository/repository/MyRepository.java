package ru.netology.jpa_repository.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonRequest;
import ru.netology.jpa_repository.mapper.PersonMapper;
import java.util.List;
import java.util.Optional;

@Repository
public interface MyRepository extends CrudRepository<PersonRequest, PersonDTO> {
    List<PersonRequest> findPersonByCityOfLiving(String cityOfLiving);
    List<PersonRequest> findPersonByPersonDTOAgeLessThanOrderByPersonDTOAge(Integer age );
    Optional<PersonRequest> findPersonByPersonDTONameAndPersonDTOSurname(String name, String surname);
}