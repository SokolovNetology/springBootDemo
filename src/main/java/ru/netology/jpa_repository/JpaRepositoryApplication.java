package ru.netology.jpa_repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class JpaRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaRepositoryApplication.class, args);


        }
    }

