package com.kh.practice2.model.vo;

public abstract class Animal {
	
	// 추상클래스 Animal
	
	private String name;
	private	String kinds;
	
	protected Animal() {
		
	}

	public Animal(String name, String kinds) {

		this.name = name;
		this.kinds = kinds;
	}

	public String toString() {
		
		return "저의 이름은" 
					+ name + "이고, 종류는 "
							+ kinds + "입니다.";
	}
	
	//추상메소드
	public abstract void speak();

	
	// get, set // 
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	
	
}
