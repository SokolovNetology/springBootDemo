package ru.netology.jpa_repository.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Entity
public class PersonID {
    @Id
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private Integer age;
    @Column
    private String phoneNumber;
    @Column(nullable = false)
    private String cityOfLiving;


}
