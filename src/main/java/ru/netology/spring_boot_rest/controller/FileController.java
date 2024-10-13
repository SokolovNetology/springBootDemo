package ru.netology.spring_boot_rest.controller;
import ru.netology.spring_boot_rest.service.FileService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.spring_boot_rest.entity.MyFile;


import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FileController {

     //сервис для доступа,загрузки и удаления файлов
    private final FileService fileService;
    //
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
