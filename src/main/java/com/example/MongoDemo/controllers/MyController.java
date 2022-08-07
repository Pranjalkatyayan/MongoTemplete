package com.example.MongoDemo.controllers;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/fetchAStudent/{studentId}")
    public ResponseEntity<String> getStudentName(@PathVariable String studentId) {

        try {
            String name = "Pranjal";
            String student = studentId;
            if (student.equals("twelve")) {
                return new ResponseEntity<>(name,HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }
}
