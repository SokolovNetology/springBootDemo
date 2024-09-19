package ru.netology.spring_boot_rest.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "myFile")

public class MyFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "name")
    private String name ;

    @Column(name = "content")
    private String content ;

    @Column(name = "isDeleted")
    public boolean isDeleted = false;

    public MyFile(String content, Long id, boolean isDeleted, String name) {
        this.content = content;
        this.id = id;
        this.isDeleted = isDeleted;
        this.name = name;
    }

    public MyFile() {

    }
}
