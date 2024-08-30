package ru.netology.jpa_repository.mapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonRequest;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class PersonMapper  {
    private PersonRequest personRequest;
    private String name;
    private String surname;
    private Integer age;
    private String phone_number;
    private String city_of_living;

    public PersonRequest getPerson() {
        return new PersonRequest(
                new PersonDTO(name, surname, age),
                phone_number,
                city_of_living);
    }
}
