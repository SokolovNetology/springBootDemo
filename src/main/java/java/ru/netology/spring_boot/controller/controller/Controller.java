package java.ru.netology.spring_boot.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.spring_boot.systemprofile.SystemProfile;

@RestController
@RequestMapping("/")
public class Controller {
    private SystemProfile profile;

    public Controller(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}