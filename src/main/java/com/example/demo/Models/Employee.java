package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String employeeName;
private int Age;
private long salary;
public Employee(int id, String employeeName, int age, long salary) {
	super();
	this.id = id;
	this.employeeName = employeeName;
	Age = age;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}

}
