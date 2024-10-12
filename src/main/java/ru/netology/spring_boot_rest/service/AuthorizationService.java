package ru.netology.spring_boot_rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.spring_boot_rest.entity.User;
import ru.netology.spring_boot_rest.exception.InvalidCredentials;
import ru.netology.spring_boot_rest.exception.UnauthorizedUser;
import ru.netology.spring_boot_rest.model.Authorities;
import ru.netology.spring_boot_rest.model.UserDto;
import ru.netology.spring_boot_rest.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AuthorizationService {

    private final UserRepository repository;

    public List<Authorities> getAuthorities(UserDto userDto) {
//        if (isEmpty(user) || isEmpty(password)) {
//            throw new InvalidCredentials("User name or password is empty");
//        }
//        List<Authorities> userAuthorities = repository.getAuthorities(user);
//        if (isEmpty(userAuthorities)) {
//            throw new UnauthorizedUser("Unknown user " + user);
//        }
//        return userAuthorities;
    //}

//    private boolean isEmpty(String str) {
//        return str == null || str.isEmpty();
//    }
//
//    private boolean isEmpty(List<?> str) {
//        return str == null || str.isEmpty();
//    }
//
//    //For test
//    public boolean addUser(String user, String password) {
//        List<Authorities> userAuthorities = new ArrayList<>();
//        userAuthorities.add(Authorities.READ);
//        userAuthorities.add(Authorities.WRITE);
//        return repository.addUser(user, password, userAuthorities);
//    }
//
//    public boolean addAdmin(String user, String password) {
//        List<Authorities> userAuthorities = new ArrayList<>();
//        userAuthorities.add(Authorities.READ);
//        userAuthorities.add(Authorities.WRITE);
//        userAuthorities.add(Authorities.DELETE);
//        return repository.addUser(user, password, userAuthorities);
        return null;
   }

}