package ru.netology.hibernate.dto;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.hibernate.entity.PersonRequisites;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Persons")
public class PersonRequest {
    @EmbeddedId
    private PersonRequisites personRequisites;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String cityOfLiving;


    public PersonRequest getPerson() {
        return new PersonRequest(personRequisites,phoneNumber,cityOfLiving);
    }
}
