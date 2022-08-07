package com.example.MongoDemo.ServiceLayer;

import com.example.MongoDemo.model.TeacherName;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface TeacherDataService {
   ResponseEntity<Response> saveNewTeacherData(TeacherName teacherName);

   ResponseEntity<Response> findteacher(String id);

   ResponseEntity<Response> changeSalary(String id);
}
