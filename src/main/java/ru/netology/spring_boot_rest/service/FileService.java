package ru.netology.spring_boot_rest.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.netology.spring_boot_rest.entity.MyFile;
import ru.netology.spring_boot_rest.repository.FileRepository;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileService {

    private final FileRepository fileRepository;
    public boolean saveFile(MultipartFile file) throws IOException {
        MyFile fileEntity = new MyFile();
        fileEntity.setFileName(file.getOriginalFilename());
        fileEntity.setFileType(file.getContentType());
        fileEntity.setData(file.getBytes());

        return fileRepository.saveMyFile(fileEntity);
    }
    public MyFile saveFile(MultipartFile file)throws IOException {

    }
    @Transactional
    public List<MyFile> getAllFiles() {
        return fileRepository.getAllFiles();
    }

    @Transactional
    public void saveMyFile(MyFile myFile) {
        fileRepository.saveMyFile(myFile);
    }

    @Transactional
    public MyFile getMyFile(Long id) {
        return (MyFile) fileRepository.getMyFile(id);
    }

    @Transactional
    public boolean deleteMyFile(Long id) {

        return fileRepository.deleteMyFile(id);

    }

    public FileWriter getFile(Long id) throws IOException {
        String record = "   ";
        FileWriter myFile = new FileWriter("myFile.txt");
        for (int i = 0; i < record.length(); i++) {
            myFile.write(record.charAt(i));
            return myFile;
            //return new File(myFile.write("myFile.txt"));


        }

         return myFile;
    }
}
