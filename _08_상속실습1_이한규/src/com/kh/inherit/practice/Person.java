package com.kh.inherit.practice;

public class Person {

	
	// 데이터 ..
	// 부모클래스 필드
	protected String name; // 상속받은 자식객체가 접근 가능한 접근제한자. 
	
	private int age;  // 내 안에서만 접근이 가능하다. // 다른 곳에서 접근 할 수 있도록 get, set 메서드 작성 필요. // 우회로 제공
	private double height;  
	private double weight;
	
	
	public Person() {

	
	}

	
	public Person(int age, double height, double weight) {
		
		this.age = age;
		this.height = height;
		this.weight = weight;
	
	}
	
	
	public String information() {
		
		return	getName()
				+ " " + getAge() 
				+ " " + getHeight() 
				+ " " + getWeight();
	}

	
	
	// get.set // 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	

	
}
