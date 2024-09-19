package ru.netology.spring_boot_rest.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.spring_boot_rest.entity.MyFile;
import ru.netology.spring_boot_rest.repository.FileRepositiry;

import java.io.File;
import java.util.List;

@Service

public class FileService {
     @Autowired
     private FileRepositiry fileRepositiry;
     @Override
     @Transactional
     public List<File> getMyFile() {
          return fileRepositiry.getMyFile();
     }
     @Override
     @Transactional
     public void saveMyFile(MyFile myFile) {
          fileRepositiry.saveMyFile(myFile);
     }
     @Override
     @Transactional
     public MyFile getMyFile(Long id){
          return fileRepositiry.getMyFile(id);
     }
     @Override
     @Transactional
     public void MyFile deleteMyFile(){
          fileRepositiry.deleteMyFile(id);
     }
}
