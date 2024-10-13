package ru.netology.spring_boot_rest.confiruration;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import ru.netology.spring_boot_rest.service.FileService;


@Configuration
@RequiredArgsConstructor
public class MyConfiguration {

    private FileService fileService;

    public MyConfiguration(FileService fileService) {
        this.fileService = fileService;
    }
}
