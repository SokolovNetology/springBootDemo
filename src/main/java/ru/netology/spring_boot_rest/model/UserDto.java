package ru.netology.spring_boot_rest.model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.netology.spring_boot_rest.entity.User;


@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class UserDto {
    private User user;//  я добавил юзер,это же класс ДТО

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isEmpty() {
        return user == null || login == null || password == null;
    }
}