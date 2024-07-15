package ru.netology.spring_boot_rest.service;

import org.springframework.stereotype.Service;
import ru.netology.spring_boot_rest.exception.InvalidCredentials;
import ru.netology.spring_boot_rest.exception.UnauthorizedUser;
import ru.netology.spring_boot_rest.model.Authorities;
import ru.netology.spring_boot_rest.repository.AuthRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorizationService {
    private AuthRepository repository;

    public AuthorizationService(AuthRepository repository) {
        this.repository = repository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = repository.getAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
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
        return repository.addUser(user, password, userAuthorities);
    }

    public boolean addAdmin(String user, String password) {
        List<Authorities> userAuthorities = new ArrayList<>();
        userAuthorities.add(Authorities.READ);
        userAuthorities.add(Authorities.WRITE);
        userAuthorities.add(Authorities.DELETE);
        return repository.addUser(user, password, userAuthorities);
    }

}