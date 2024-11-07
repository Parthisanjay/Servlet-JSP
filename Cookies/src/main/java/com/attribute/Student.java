package com.attribute;

public class Student {
	private int id;
	private String name;
	private int age;
	private double markd;
	
	public Student(int id, String name, int age, double markd) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.markd = markd;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", markd=" + markd + "]";
	}
	
	
}
