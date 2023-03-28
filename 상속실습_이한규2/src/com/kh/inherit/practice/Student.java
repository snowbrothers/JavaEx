package com.kh.inherit.practice;

public class Student extends Person{

	
	private int grade; // 학년
	private String major; // 전공
	
	
	public Student() {
		
	}


	public Student(String name, int age, double height, double weight, int grade, String major) {
		
		super(name, age,height,weight);
		
		this.grade = grade;
		this.major = major;
	}
	
	
	public String information() {
		
		return getName() 
				+ " " + getAge()
				+ " " + getHeight()
				+ " " + getWeight()
				+ " " + getGrade()
				+ " " + getMajor();
	}

	
	// get, set // 
	
	
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}

	
	
	
	
}
