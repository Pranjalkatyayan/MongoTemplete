package com.example.MongoDemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Student Details")
public class Student {

	@Id
	private Object _id;
	private String first_name;
	private String last_name;
	private int ClassNo;
	private String gender;
	private String dob;
	private String school_joining_date;
	private Boolean loveMaths;
	private List<Friends> friends;
	private String City[]=new String[5];
	
	
}
