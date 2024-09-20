package ru.netology.spring_boot_rest.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.spring_boot_rest.entity.MyFile;
import ru.netology.spring_boot_rest.repository.FileRepository;

import java.io.File;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileService {

     private final FileRepository fileRepository;

     @Transactional
     public List<MyFile> getAllFiles() {
          return fileRepository.getAllFiles();
     }
     @Transactional
     public void saveMyFile(MyFile myFile) {
          fileRepository.saveMyFile(myFile);
     }
     @Transactional
     public MyFile getMyFile(Long id){
          return fileRepository.getMyFile(id);
     }
     @Transactional
     public  boolean deleteMyFile(Long id) {

          return fileRepository.deleteMyFile(id);

     }
}
