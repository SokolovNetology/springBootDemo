package ru.netology.spring_boot_rest.entity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.netology.spring_boot_rest.model.Authorities;

import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class User {

    private String login;
    private String password;
    private List<Authorities> authorities;
}