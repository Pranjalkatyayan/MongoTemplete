package com.example.MongoDemo.repository;

import com.example.MongoDemo.model.TeacherName;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TecherDataRepo {
    @Autowired
    MongoTemplate mongoTemplate;

    public ResponseEntity<Response> saveTeacherDataInRepo(TeacherName teacherName) {

        mongoTemplate.save(teacherName,"TeacherName");
        return new ResponseEntity<>(new Response(), HttpStatus.OK);
    }


    public ResponseEntity<Response> findTeacherData(String id) {
        Criteria criteria=new Criteria().where("teacherId").is(id);
        Query query = new Query();
        query.addCriteria(criteria);
        List<TeacherName> teacherName = mongoTemplate.find(query, TeacherName.class, "TeacherName");
        if(teacherName.size()!=0){
            return new ResponseEntity<>(new Response(),HttpStatus.OK);
        }
        return new ResponseEntity<>(new Response(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Response> changeSalary(String id) {

        Criteria criteria=new Criteria().where("teacherId").is(id);
        Query query = new Query();
        query.addCriteria(criteria);

        Update salary=new Update();
        salary.set("salaty" ,"5000");

        mongoTemplate.updateFirst(query,salary,"Teacher");

        return new ResponseEntity<>(new Response(),HttpStatus.OK);

    }
}
