package ru.netology.spring_boot_rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest.entity.MyFile;
import ru.netology.spring_boot_rest.model.LogoPass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Repository
public class FileRepositiry implements GetSaveDeleteRepository  {
    private List <MyFile> file = new ArrayList<MyFile>();

    @Override
    public List<MyFile> getMyFiles(Long id) {
        return List.of();
    }

    @Override
    public void saveMyFile(MyFile myFile) {

    }

    @Override
    public MyFile getMyFile(Long id) {
        return null;
    }

    @Override
    public void deleteMyFile(Long id) {

    }



