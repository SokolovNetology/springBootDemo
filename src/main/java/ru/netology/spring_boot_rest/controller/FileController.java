package ru.netology.spring_boot_rest.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.spring_boot_rest.entity.MyFile;
import ru.netology.spring_boot_rest.service.FileService;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping("/all-files")
    public List<MyFile> showALLFiles(){

        return fileService.getAllFiles();
    }

    @PostMapping("/save")
    public void saveFile(@RequestBody MyFile file){

        fileService.saveMyFile(file);
    }
    @PostMapping("/delete")
    public void deleteFile(@RequestParam("id")Long id){

        fileService.deleteMyFile(id);
    }

}
