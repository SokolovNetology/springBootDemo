package java.ru.netology.spring_boot.controller.systemprofile;

public class DevProfile implements SystemProfile{

    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}