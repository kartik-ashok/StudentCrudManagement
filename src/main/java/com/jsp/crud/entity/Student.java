package com.jsp.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student 
{
	@Id
	private int id;
	private String name;
	private long phno;
	private double percentage;
	public Iterable<Student> gettAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
