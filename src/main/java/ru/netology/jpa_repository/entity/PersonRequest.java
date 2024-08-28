package ru.netology.jpa_repository.entity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.jpa_repository.dto.PersonDTO;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Persons")
public class PersonRequest {
    @EmbeddedId
    private PersonDTO personRequisites;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String cityOfLiving;


    public PersonRequest getPerson() {
        return new PersonRequest(personRequisites,phoneNumber,cityOfLiving);
    }
}



