package ru.netology.spring_boot_rest.entity;
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

    public User(List<Authorities> authorities, String login, String password) {
        this.authorities = authorities;
        this.login = login;
        this.password = password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }

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
}