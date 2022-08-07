package com.example.MongoDemo.repository;

import com.example.MongoDemo.model.Zip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipRepository extends MongoRepository< Zip,Long>{

}
