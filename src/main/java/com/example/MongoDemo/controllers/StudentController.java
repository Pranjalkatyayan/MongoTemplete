package com.example.MongoDemo.controllers;

import com.example.MongoDemo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/my")
public class StudentController {

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping("/findByClass/{classNo}")
	public void findClassByGrade(@PathVariable int classNo) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("class").is(classNo));

		long students=mongoTemplate.count(query,User.class,"User");

		System.out.println("The no of student is "+ students);
		System.out.println("The no of student is "+ students);

	}

	@GetMapping("/findUserByName/{firstName}/{lastName}") //done
	public void findUserByName(@PathVariable String firstName,@PathVariable String lastName){


		Criteria criteria=new Criteria().andOperator(Criteria.where("first_name").is(firstName),Criteria.where("last_name").is(lastName));
		Query query=new Query();
		query.addCriteria(criteria);

		User user=mongoTemplate.findOne(query,User.class,"User");
		System.out.println(user.getGender());
		System.out.println(user.isMarried_status());
		System.out.println(user.getCard().getCard_number());
		System.out.println(user.getAddress().getCountry_code());

	}

	@PostMapping("/changeTheDetailsInUser") //done
	public void changeTheUserName(@RequestBody DetailsToUpdate detailsToUpdate){

		String firstName= detailsToUpdate.getFirstName();
		String lastName= detailsToUpdate.getLastName();
		Card card=detailsToUpdate.getCard();



		Criteria criteria=new Criteria().andOperator(Criteria.where("first_name").is(firstName),Criteria.where("last_name").is(lastName));
		Query query=new Query();
		query.addCriteria(criteria);

		User user=mongoTemplate.findOne(query,User.class,"User");

		Update update=new Update();
		update.set("first_name","Ram");
		update.set("last_name","Singh");
		update.set("card", card);
		mongoTemplate.updateFirst(query,update,User.class);

	}

	@DeleteMapping("/deleteTheUser") //not working
	public void deleteTheUser(@RequestBody DetailsToUpdate detailsToUpdate){

		String firstName= detailsToUpdate.getFirstName();
		String lastName= detailsToUpdate.getLastName();

		Criteria criteria=new Criteria().andOperator(Criteria.where("first_name").is(firstName),Criteria.where("last_name").is(lastName));
		Query query=new Query();
		query.addCriteria(criteria);

		User user=mongoTemplate.findOne(query,User.class,"User");
		mongoTemplate.remove(user,"User");

	}

	@PostMapping("/insertOneData") //done -save and insert
	public void insertOneData(@RequestBody User user){

		User userObjTobeinsertedInDB=new User();
		//userObjTobeinsertedInDB.set_id(user.get_id());
		userObjTobeinsertedInDB.setFirst_name(user.getFirst_name());
		userObjTobeinsertedInDB.setLast_name(user.getLast_name());
		userObjTobeinsertedInDB.setEmail(user.getEmail());
		userObjTobeinsertedInDB.setGender(user.getGender());
		userObjTobeinsertedInDB.setMarried_status(user.isMarried_status());
		userObjTobeinsertedInDB.setAddress(user.getAddress());
		userObjTobeinsertedInDB.setCard(user.getCard());

		//mongoTemplate.save(user,"User");
		mongoTemplate.insert(user,"User");

	}
	
	@PostMapping("/insertManyData")  //insertAll
	public void insertManyData(@RequestBody List<User> user){

		List<User> userList=new ArrayList<>();

		for (int i=0;i<user.size();i++){

			User input=user.get(i);
			User userObjTobeinsertedInDB=new User();
			userObjTobeinsertedInDB.set_id(input.get_id());
			userObjTobeinsertedInDB.setFirst_name(input.getFirst_name());
			userObjTobeinsertedInDB.setLast_name(input.getLast_name());
			userObjTobeinsertedInDB.setEmail(input.getEmail());
			userObjTobeinsertedInDB.setGender(input.getGender());
			userObjTobeinsertedInDB.setMarried_status(input.isMarried_status());
			userObjTobeinsertedInDB.setAddress(input.getAddress());
			userObjTobeinsertedInDB.setCard(input.getCard());
			userList.add(userObjTobeinsertedInDB);

		}

		List<User> users= (List<User>) mongoTemplate.insertAll(userList);

	}
	
	@GetMapping ("/isOneCollectionExists")//done
	public void isCollectionAvailable(){

		boolean ans=mongoTemplate.collectionExists("Students Details");
		System.out.println(ans);

	}

	@PostMapping("/updateFirst") //done
	public void updateFirst(@RequestBody User input){


		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);
		Update update = new Update();
		update.set("first_name", "Mohan");
		update.set("last_name", "Sohan");
		mongoTemplate.updateFirst(query, update, User.class);

	}

	@PostMapping("/updateMany") //done
	public void updateMany(@RequestBody  User  input){


		String gender=input.getGender();
		Criteria criteria=new Criteria().where("gender").is(gender);
		Query query = new Query();
		query.addCriteria(criteria);
		Update update = new Update();
		update.set("gender", "Female");
		mongoTemplate.updateMulti(query, update, User.class);


	}

	@PostMapping("/upsert") //done
	public  void upsert(@RequestBody User input){

        String thirdGender=input.getGender();
		Criteria criteria=new Criteria().where("gender").is(thirdGender);
		Query query = new Query();
		query.addCriteria(criteria);
		Update update = new Update();
		update.set("gender", "Female");
		mongoTemplate.upsert(query, update, User.class);



	}

	@GetMapping("/count/{gender}")  //done
	public void useCountMethod(@PathVariable String  gender){

		String Gender=gender;
		Criteria criteria=new Criteria().where("gender").is(gender);
		Query query = new Query();
		query.addCriteria(criteria);

		long count=mongoTemplate.count(query,User.class,"User");
		System.out.println(count);

	}

	@GetMapping("/remove") //done
	public void useRemove(@RequestBody User input){

		User user=input;
		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);
		mongoTemplate.remove(query,"User");

	}

	@GetMapping("/exists") //done
	public  void doExists(@RequestBody User input){

		User user=input;
		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);
		Boolean answer=mongoTemplate.exists(query,"User");
		System.out.println(answer);


	}

	@GetMapping("/findOne") //done
	public  void findOne(@RequestBody User input){


		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);
		User output=mongoTemplate.findOne(query,User.class,"User");
		System.out.println("The user name is " + output.getFirst_name());
		System.out.println("The Last name is " + output.getLast_name());

		List<User> myOut=mongoTemplate.findAll(User.class,"User");
		System.out.println(myOut.size());

		//mongoTemplate.remove(query,"User");
	}

	@GetMapping("/findAll") //done
	public  void findAll(@RequestBody User input){


		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);
		List<User> myOut=mongoTemplate.findAll(User.class,"User");

		System.out.println(myOut.size());
		System.out.println(myOut.get(0));
		User in=myOut.get(0);
		System.out.println(in.get_id());
		System.out.println(in.getFirst_name());
		System.out.println(in.getLast_name());
		System.out.println(in.getAddress());
		System.out.println(in.getCard());

	}

	@GetMapping("/findAllRemove") //done
	public  void findAllAndRemove(@RequestBody User input){

		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);

		List<User> myOut=mongoTemplate.findAllAndRemove(query,User.class,"User");
		System.out.println(myOut.size());
		System.out.println(myOut.get(0));
		User in=myOut.get(0);
		System.out.println(in.get_id());
		System.out.println(in.getFirst_name());
		System.out.println(in.getLast_name());
		System.out.println(in.getAddress());
		System.out.println(in.getCard());

	}

	@GetMapping("/find") //done
	public  void find(@RequestBody User input){

		Object id=input.get_id();
		Criteria criteria=new Criteria().where("_id").is(id);
		Query query = new Query();
		query.addCriteria(criteria);

		List<User> myOut=mongoTemplate.find(query,User.class,"User");
		System.out.println(myOut.size());
		System.out.println(myOut.get(0));
		User in=myOut.get(0);
		System.out.println(in.get_id());
		System.out.println(in.getFirst_name());
		System.out.println(in.getLast_name());
		System.out.println(in.getAddress());
		System.out.println(in.getCard());

	}

	/*
      1.insert-done
      2.insertAll-done
      3.save-done
      4.saveAll-Not in mongoDb
      5.CollectionExists-To check id a collection is available in a dataBase - done
      6.UpdateFirst-Done
      7.updateMulti-Done
      8.Upsert-Works on Only one Object-Done
      9.exists-Done
      10.find-Done
      11.findOne-Done
      11.findAll-Done
      12.findAllAndRemove
      13.remove-done
      14.count-done
	 */

}

