package com.example.MongoDemo.controllers;

import com.example.MongoDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/agg")
public class AggregationPractiseController {

    @Autowired
    MongoTemplate mongoTemplate;

    @PostMapping("/aggregation1") //Only Match
    public void firstAggregation(@RequestBody User input){

        List<Map<String, Object>> Details;
        Aggregation aggregation;

        String thirdGender=input.getGender();
        Criteria criteria=new Criteria().where("gender").is(thirdGender);

        aggregation = Aggregation.newAggregation(Aggregation.match(criteria));

        Details= (List<Map<String, Object>>) mongoTemplate.aggregate(aggregation,"User",Object.class)
                  .getRawResults().get("results");

        System.out.println(Details.size());
        System.out.println((Details.get(0)));

    }

    @PostMapping("/aggregation2")  //Only Project
    public void secoendAggregation(){

        List<Map<String, Object>> Details;
        Aggregation aggregation;

        String name="organization";
        Criteria criteria=new Criteria().where("type").is(name);

        aggregation=Aggregation.newAggregation(
                Aggregation.match(criteria),
                Aggregation.project()
                        .and("type").as("type")
                        .and("cb_url").as("Url")
                        .and("name").as("name")

        );

        Details= (List<Map<String, Object>>) mongoTemplate.aggregate(aggregation,"Investors",Object.class) .getRawResults().get("results");

        System.out.println(Details.size());
        for(int i=0;i<Details.size();i++){

            System.out.println(Details.get(i));
        }


    }

    @PostMapping("/aggregation3")  //Basic lookUp and Project
    public void thirdAggregation(){

        List<Map<String, Object>> Details;
        Aggregation aggregation;

        String id="30191841";
        Criteria criteria=new Criteria().where("fav_resturant_id").is(id);

        aggregation=Aggregation.newAggregation(
                Aggregation.match(criteria),
                Aggregation.lookup("Resturant","fav_resturant_id","restaurant_id","1stLookUP"),
                Aggregation.project()
                        .and("first_name").as("first_name")
                        .and("last_name").as("last_name")
                        .and("email").as("email")
                        .and("gender").as("gender")
                        .and("married_status").as("married_status")



                        .and("1stLookUP.borough").arrayElementAt(0).as("borough")
                        .and("1stLookUP.cuisine").arrayElementAt(0).as("cuisine")
                        .and("1stLookUP.name").arrayElementAt(0).as("NameOfResturant")


        );

        Details= (List<Map<String, Object>>) mongoTemplate.aggregate(aggregation,"User",Object.class) .getRawResults().get("results");

        System.out.println(Details);
        System.out.println(Details.size());
        for(int i=0;i<Details.size();i++){

            System.out.println(Details.get(i));
        }
    }

    @PostMapping("/aggregation4")
    public void fourthAggregation(){

        List<Map<String, Object>> Details;
        Aggregation aggregation;

        String id="30191841";
        Criteria criteria=new Criteria().where("fav_resturant_id").is(id);

        aggregation=Aggregation.newAggregation(
                Aggregation.match(criteria),
                Aggregation.lookup("Resturant","fav_resturant_id","restaurant_id","1stLookUP"),
                Aggregation.project()
                        .and("first_name").as("first_name")
                        .and("last_name").as("last_name")
                        .and("email").as("email")
                        .and("gender").as("gender")
                        .and("married_status").as("married_status")



                        .and("1stLookUP.borough").arrayElementAt(0).as("borough")
                        .and("1stLookUP.cuisine").arrayElementAt(0).as("cuisine")
                        .and("1stLookUP.name").arrayElementAt(0).as("NameOfResturant")


        );

        Details= (List<Map<String, Object>>) mongoTemplate.aggregate(aggregation,"User",Object.class) .getRawResults().get("results");

        System.out.println(Details);
        System.out.println(Details.size());
        for(int i=0;i<Details.size();i++){

            System.out.println(Details.get(i));
        }
    }

}
