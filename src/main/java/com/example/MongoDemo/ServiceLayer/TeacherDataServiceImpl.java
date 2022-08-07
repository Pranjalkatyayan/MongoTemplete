package com.example.MongoDemo.ServiceLayer;

import com.example.MongoDemo.model.TeacherName;
import com.example.MongoDemo.repository.TecherDataRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherDataServiceImpl implements TeacherDataService{

    @Autowired
    TecherDataRepo techerDataRepo;


    @Override
    public ResponseEntity<Response> saveNewTeacherData(TeacherName teacherName) {
        return  techerDataRepo.saveTeacherDataInRepo(teacherName);
    }

    @Override
    public ResponseEntity<Response> findteacher(String id) {
        return techerDataRepo.findTeacherData(id);
    }

    @Override
    public ResponseEntity<Response> changeSalary(String id) {

        return techerDataRepo.changeSalary(id);

    }
}
