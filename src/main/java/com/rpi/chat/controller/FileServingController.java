package com.rpi.chat.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class FileServingController {

    private static final String UPLOAD_DIR = "uploads/";

    @GetMapping("/uploads/{filename}")
    public ResponseEntity<FileSystemResource> serveFile(@PathVariable String filename) {
        File file = new File(UPLOAD_DIR + filename);

        if (file.exists()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
                    .body(new FileSystemResource(file));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
