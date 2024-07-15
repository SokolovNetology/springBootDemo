package ru.netology.spring_boot_rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest.model.Authorities;
//import ru.netology.authorization; service.model.Authorities;

import java.util.List;


public interface AuthRepository {
    List<Authorities> getAuthorities(String user, String password);

    //For test
    boolean addUser(String user, String password, List<Authorities> list);

    boolean addAdmin(String user, String password, List<Authorities> list);

}