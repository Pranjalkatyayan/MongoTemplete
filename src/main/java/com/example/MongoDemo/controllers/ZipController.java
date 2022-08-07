package com.example.MongoDemo.controllers;

import com.example.MongoDemo.model.Zip;
import com.example.MongoDemo.model.ZipCode;
import com.example.MongoDemo.repository.ZipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ZipController {
	
	@Autowired
	public ZipRepository zipRepository;
	
	@Autowired
    private MongoTemplate mongoTemplate;

	/*
	 * Native query for the following method is -
	 * db.zip.insert({_id : "015566", codeid : 658,city : "ranchi", location_lat_long : [ 66.41, 79.421], population : 645654, state : "Jh"})
	 */
	@PostMapping(value = "/create")
	public Zip insertZip(@RequestBody Zip zip) {

		return mongoTemplate.insert(zip, "zip");
		
		
	}

	
	//return all zips by city
	/*
	 * Native query for the following method is:
	 * db.zip.find({city : "DELHI"})
	 * */
	@GetMapping(value = "/getZips")
	public List<Zip> getZips(@RequestParam String city){
		Query query = new Query();
		query.addCriteria(Criteria.where("city").is(city));
		return (List<Zip>) mongoTemplate.find(query, Zip.class);
	}
	
	
	//return population by city
	/*
	 * Native query for the following method is:
	 * db.zip.aggregate([{$match : {city : "DELHI"}},{$project : {_id : 0, population : 1}}])
	 * */
	@GetMapping(value = "/getPopulation")
	public Object getZipCity(@RequestParam String city){
		Object res = new Object();
		Criteria criteria = Criteria.where("city").is(city);
		Aggregation aggregation = Aggregation.newAggregation(Aggregation.match(criteria),Aggregation.project("population").andExclude("_id"));
		res =  mongoTemplate.aggregate(aggregation, "zip", Object.class).getMappedResults();
		return (Object) res;
	}
	
	
	
	//returns zip by state using unwind operation
	/*
	 * Native query for the following method is:
	 * db.zip.aggregate([{$match : {state : "DE"}},{$unwind : "$location_lat_long"},{$project : {_id : 0}}])
	 * */
	@GetMapping(value = "/getZipByState")
	public Object getZipState(@RequestParam String state){
		Object res = new Object();
		Criteria criteria = Criteria.where("state").is(state);
		Aggregation aggregation = Aggregation.newAggregation(Aggregation.match(criteria), Aggregation.unwind("location_lat_long"), Aggregation.project(Zip.class).andExclude("_id"));
		res =  mongoTemplate.aggregate(aggregation, "zip", Object.class).getMappedResults();
		return (Object) res;
	}
	
	//returns population count grouped by state
	/*
	 * native query for the following method is:
	 * db.zip.aggregate([{$group : {_id : "$state", statepop : {$sum : "$population" },mincode : {$min : "$codeid"}}},{$sort : {statepop : -1}},{$project : {"STATEPOPULATION" : "$statepop","MINCODE" : "$mincode"}}])
	 * */
	@GetMapping(value = "/groupStatePopulation")
	public Object getStateAndPopulation() {
		//Criteria criteria = Criteria.where("state").is("CA");
		Aggregation aggregation = Aggregation.newAggregation(Aggregation.group("state").sum("population").as("statepop").min("codeid").as("mincode"),
				Aggregation.sort(Sort.Direction.DESC, "statepop"),Aggregation.project().and("_id").as("STATE").and("statepop").as("STATEPOPULATION").and("mincode").as("MINCODE").andExclude("_id"));
		return (Object) mongoTemplate.aggregate(aggregation, "zip", Object.class).getMappedResults();
	}
	
	//returns zipcode by city
	/*
	 * Native query for the following method:
	 * db.zip.aggregate([{$match : {city : "MUMBAI"}},{$lookup : {from : "zipcode", localField : "codeid", foreignField : "_id", as : "zip_code"}},{$project : {"CITY" : "$city", "CODE" : {$arrayElemAt : ["$zip_code.code",0]}}}])
	 * */
	@GetMapping(value = "/getCityZipCode")
	public Object getCityZipCode(@RequestParam String city) {
		Criteria criteria = Criteria.where("city").is(city);
		Aggregation aggregation = Aggregation.newAggregation(Aggregation.match(criteria), Aggregation.lookup("zipcode", "codeid", "_id", "zip_code"), Aggregation.project().and("city").as("CITY").and("zip_code.code").arrayElementAt(0).as("CODE"));
		return (Object) mongoTemplate.aggregate(aggregation, "zip", Object.class).getMappedResults();
	}
	
	//creates zipcode
	/*
	 * Native query for the following method is:
	 * db.zipcode.insert({id : "18", code : "code18"})
	 * */
	@PostMapping(value = "/createZipCode")
	public ZipCode insertZipCode(@RequestBody ZipCode zipCode){		
		return mongoTemplate.insert(zipCode, "zipcode");
		
	}

}
