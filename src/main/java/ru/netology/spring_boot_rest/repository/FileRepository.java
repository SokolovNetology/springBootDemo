package ru.netology.spring_boot_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest.entity.MyFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
@Repository
public class FileRepository <MyFile, Long> {

//    private List <MyFile> file = new ArrayList<MyFile>();
    public List<MyFile> getMyFiles(Long id) {
        return List.of();
    }


    public boolean saveMyFile(MyFile myFile) {
         return false;
    }

    public MyFile getMyFile(Long id) {
        return null;
    }


    public boolean deleteMyFile(Long id) {
         return true;
    }

    public List<MyFile> getAllFiles() {
        return List.of();
    }
}

