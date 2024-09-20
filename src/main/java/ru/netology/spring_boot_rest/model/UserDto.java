package ru.netology.spring_boot_rest.model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class UserDto {
    private String login;
    private String password;
}