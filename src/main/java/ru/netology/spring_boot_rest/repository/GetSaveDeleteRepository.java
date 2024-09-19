package ru.netology.spring_boot_rest.repository;

import ru.netology.spring_boot_rest.entity.MyFile;

import java.util.List;

public interface GetSaveDeleteRepository {



    List<MyFile> getMyFiles(Long id);
    void saveMyFile(MyFile myFile);
    MyFile getMyFile(Long id);
    void deleteMyFile(Long id);
}
