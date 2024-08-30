package ru.netology.jpa_repository.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.jpa_repository.dto.PersonDTO;
import ru.netology.jpa_repository.mapper.PersonMapper;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Persons",schema = "datafortest")
public class PersonRequest extends PersonMapper {
    @EmbeddedId
    private PersonDTO personDTO;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String cityOfLiving;

    }





