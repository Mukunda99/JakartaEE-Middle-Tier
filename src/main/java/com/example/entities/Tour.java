package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tour 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long t_id;
	
	private String name;
	
	private int duration;
	
	private String type;

	public long getT_id() {
		return t_id;
	}

	public void setT_id(long t_id) {
		this.t_id = t_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tour [t_id=" + t_id + ", name=" + name + ", duration=" + duration + ", type=" + type + "]";
	}
	
	
	
	
	
	

}
