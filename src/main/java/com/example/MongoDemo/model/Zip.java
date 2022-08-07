package com.example.MongoDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "zip")
public class Zip {

	@Id
	private String _id;
	private long codeid;
	private List<Double> location_lat_long;
	private String state;
	private String city;
	private Long population;
	
	public Zip() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Zip(String id, long codeid, List<Double> location_lat_long, String state, String city, Long population) {
		super();
		this._id = id;
		this.codeid = codeid;
		this.location_lat_long = location_lat_long;
		this.state = state;
		this.city = city;
		this.population = population;
	}



	public String getId() {
		return _id;
	}
	public void setId(String id) {
		this._id = id;
	}
	public List<Double> getLocation_lat_long() {
		return location_lat_long;
	}
	public void setLocation_lat_long(List<Double> location_lat_long) {
		this.location_lat_long = location_lat_long;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Zip [id=" + _id + ", location_lat_long=" + location_lat_long + ", state=" + state + ", city=" + city
				+ ", population=" + population + "]";
	}

	public long getCodeid() {
		return codeid;
	}

	public void setCodeid(long codeid) {
		this.codeid = codeid;
	}
	

	
	
}
