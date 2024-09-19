package ru.netology.spring_boot_rest.confiruration;

import org.springframework.beans.factory.annotation.Autowired;
import ru.netology.spring_boot_rest.service.FileService;

public class MyConfiguration {

    @Autowired
    private FileService fileService;
}
