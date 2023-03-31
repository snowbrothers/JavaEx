package com.kh.practice.model.vo;

// 추상클래스
public	abstract class Animal {
	
	private String name; 
	private	String kinds;
	
	
	// protected  접근제한자, 나의 자식 클래스이면 사용가능.
	protected Animal() {
		
	}


	public Animal(String name, String kinds) {
		// 초기화
		
		this.name = name;
		this.kinds = kinds;
	}

	public String toString() {
		
	
	// 리턴은 출력한다는 이야기는 아님. 문자열을 반환 한다. 출력문 안에 포함시켜주어야함	
	
		return "저의 이름은" 
						+ name + "이고, 종류는 " 
							+ kinds +"입니다.";
	}
	
	
	// 추상메서드
	public	abstract void speak();


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


