package com.ict.milestone.uploadmultiplefiles;

import com.ict.milestone.uploadmultiplefiles.service.FilesStorageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;

@SpringBootApplication
public class UploadmultiplefilesApplication implements CommandLineRunner{
    @Resource
    FilesStorageService storageService;
    public static void main(String[] args) {
        SpringApplication.run(UploadmultiplefilesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        storageService.deleteAll();
        storageService.init();
    }
}
