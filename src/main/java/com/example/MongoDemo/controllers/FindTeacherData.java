package com.example.MongoDemo.controllers;

import com.example.MongoDemo.ServiceLayer.TeacherDataService;
import com.example.MongoDemo.model.TeacherName;
import org.apache.coyote.Response;
import org.apache.coyote.http2.Constants;
import org.apache.tomcat.util.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.apache.coyote.http2.Constants.*;

@RestController
public class FindTeacherData {

    @Autowired
    TeacherDataService teacherDataService;

    @PostMapping("/saveNewTeacher")
    public ResponseEntity<Response> saveNewTeacher(@RequestBody  TeacherName teacherName){
         try{
           return teacherDataService.saveNewTeacherData(teacherName);
        }catch (Exception e){

            return new ResponseEntity(new Response(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/findATecher/{id}")
    public ResponseEntity<Response> findATeacher(@PathVariable String id){
        try{
            return teacherDataService.findteacher(id);
        }catch (Exception e){
            return new ResponseEntity(new Response(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/changeSalary/{id}")
    public ResponseEntity<Response> changeSalary(@PathVariable String id){
        try {
            return teacherDataService.changeSalary(id);
        }catch (Exception e){
            return new ResponseEntity(new Response(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
