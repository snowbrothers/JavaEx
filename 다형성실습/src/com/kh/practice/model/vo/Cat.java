package com.kh.practice.model.vo;

public class Cat extends Animal{

	private String location; 
	private String color;
	
	@Override
	public void speak() {

		String str = super.toString();
		
		System.out.println(str + location + "에 서식하며, 색상은 " 
													+ color + "입니다. "); 
		
	}

	public Cat() {
		
	}

	// 부모의 생성자를 호출하여 필드값을 초기화
	public Cat(String name,String kinds, String location, String color) {
		
		super(name,kinds);
		//this.location = location;
		//this.color = color;
	
		// 필드초기화
		setLocation(location);
		setColor(color);
		
	}

	// get, set // 
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
