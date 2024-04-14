package demo.example.awsdemo.FileStore;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileStore {
    private final AmazonS3 s3;
    @Autowired
    public  FileStore (AmazonS3 s3){
        this.s3=s3;
    }
}
