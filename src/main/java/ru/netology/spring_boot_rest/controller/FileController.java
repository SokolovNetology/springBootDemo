package ru.netology.spring_boot_rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.spring_boot_rest.entity.MyFile;
import ru.netology.spring_boot_rest.service.FileService;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping
public class FileController {
    private FileService fileService;

    @GetMapping("/files")
    public List<MyFile> showALLFiles(){
           return List<File> allMyFiles = fileService.getMyFile();
    }

}
