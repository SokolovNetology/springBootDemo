package ru.netology.jpa_repository.mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.entity.PersonRequest;
@Data
@AllArgsConstructor

public class PersonMapper {
    public PersonRequest getPerson(String cityOfLiving,String phoneNumber) {

        return new PersonRequest(new PersonDTO(),phoneNumber,cityOfLiving);
    }
}
