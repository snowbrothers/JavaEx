package com.kh.practice.model.vo;

public class Dog extends Animal {

	public static final String PLACE = "애견카페";
	private int weight;
	
	@Override
	public void speak() {
		
		// 변수에 담거나 , 출력문 안에 직접 작성
		String str = super.toString(); 
		
		System.out.println(str + " 몸무게는 " 
										+ weight + "kg 입니다.");
	}
	
	
	public Dog() {
		
	}

	public Dog(String name, String kinds, int weight) {
	
		// 부모의 클래스에 접근! 
		super(name, kinds);
		//this.weight = weight;
		setWeight(weight);
	}

		
	
	// get , set // 
	
	
				
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	
	
	
	
}
