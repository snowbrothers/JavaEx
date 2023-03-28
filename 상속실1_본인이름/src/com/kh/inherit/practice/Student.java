package com.kh.inherit.practice;

public class Student extends Person {

	private int grade;  // 학년
	private String major;  // 전공
	
	
	public Student() {
		
	}


	public Student(String name, int age, double height, double weight , int grade, String major) {
		
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		
		return getName() 
				+ " " + getAge() 
				+ " " + getHeight() 
				+ " " +getWeight()
				+ " " + getGrade()
				+ " " + getMajor();
	}

	
	

	public int getGrade() {
		return grade;
	}


	public String getMajor() {
		return major;
	}
	
	
	
	
	
}
