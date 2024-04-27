package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentkodnest")
public class Studentkodnest 
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="name")

	String name;
	@Column(name="marks")

	int marks;
	@Column(name="password")

	String password;
	
	
	public Studentkodnest(String name, int marks, String password) {
		super();
		this.name = name;
		this.marks = marks;
		this.password = password;
	}


	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Studentkodnest [id=" + id + ", name=" + name + ", marks=" + marks + ", password=" + password + "]";
	}
	
	
	
	
}
