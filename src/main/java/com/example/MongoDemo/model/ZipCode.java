package com.example.MongoDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "zipcode")
public class ZipCode {
	@Id
	private String _id;
	private String code;
	
	public String getId() {
		return _id;
	}
	public void setId(String id) {
		this._id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ZipCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ZipCode(String id, String code) {
		super();
		this._id = id;
		this.code = code;
	}
	
}
