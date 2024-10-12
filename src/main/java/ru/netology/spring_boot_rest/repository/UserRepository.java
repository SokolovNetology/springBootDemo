package ru.netology.spring_boot_rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest.entity.User;
import ru.netology.spring_boot_rest.exception.InvalidCredentials;
import ru.netology.spring_boot_rest.exception.UnauthorizedUser;
import ru.netology.spring_boot_rest.model.Authorities;
import ru.netology.spring_boot_rest.model.UserDto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository  {
    /**
     * поменять интерфейс UserRepository на класс.
     * создать конструктор ,задать в нем по умолчанию нескольких пользователей с правами.
     * добвить метод getAuthorities()в который будет приходить обьъект класса юзер
     * методы берем из AuthorizationService целиком.
     */
      private List<User> authoritiesUser;

    public UserRepository(List<User>authoritiesUser) {
        this.authoritiesUser = authoritiesUser;
    }

    public List<Authorities> getAuthorities(UserDto userDto) {
        if (userDto.isEmpty(login) || userDto.isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userDto.getAuthorities();
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + userDto);
        }
        return userAuthorities;
        }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }

    //For test
    public boolean addUser(String user, String password) {
        List<Authorities> userAuthorities = new ArrayList<>();
        userAuthorities.add(Authorities.READ);
        userAuthorities.add(Authorities.WRITE);
        return user.lines(user, password, userAuthorities).isParallel();
    }
//
    public boolean addAdmin(String user, String password) {
        List<Authorities> userAuthorities = new ArrayList<>();
        userAuthorities.add(Authorities.READ);
        userAuthorities.add(Authorities.WRITE);
        userAuthorities.add(Authorities.DELETE);
        return repository.addUser(user, password, userAuthorities);
        return null;
    }
}
