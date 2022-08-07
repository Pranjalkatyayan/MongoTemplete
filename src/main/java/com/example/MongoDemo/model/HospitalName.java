package com.example.MongoDemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalName {

	private int hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	
}
