package ru.netology.spring_boot_rest.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.spring_boot_rest.model.Authorities;
import ru.netology.spring_boot_rest.model.UserDto;
import ru.netology.spring_boot_rest.service.AuthorizationService;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorizationController {

    private final AuthorizationService service;


    @PostMapping("/login")
    public List<Authorities> getAuthorities(@RequestBody UserDto userDto) {
        return service.getAuthorities(userDto);
    }

    //For test
//    @GetMapping("/add/user")
//    public boolean addUser(
//            @RequestParam("user") String user,
//            @RequestParam("password") String password) {
//        return service.addUser(user, password);
//    }
//
//    @GetMapping("/add/admin")
//    public boolean addAdmin(
//            @RequestParam("user") String user,
//            @RequestParam("password") String password) {
//        return service.addAdmin(user, password);
//    }
}