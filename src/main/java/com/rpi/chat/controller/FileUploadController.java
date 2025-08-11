package com.rpi.chat.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    private static final String UPLOAD_DIR = "uploads/";  // Directory for uploads

    // Handle file upload
    @PostMapping
    public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            File uploadDir = new File(UPLOAD_DIR);

            String filePath = uploadDir.getAbsolutePath() + File.separator + file.getOriginalFilename();
            file.transferTo(new File(filePath));  // Save file to the server

            return ResponseEntity.ok(new FileUploadResponse("/uploads/" + file.getOriginalFilename()));

        } catch (IOException e) {
            return ResponseEntity.status(500).body("File upload failed");
        }
    }

    // Class to wrap the file URL in a response
    public static class FileUploadResponse {
        private String fileUrl;

        public FileUploadResponse(String fileUrl) {
            this.fileUrl = fileUrl;
        }

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }
    }
}
