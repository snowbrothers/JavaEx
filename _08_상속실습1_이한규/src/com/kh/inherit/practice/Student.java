package com.kh.inherit.practice;

public class Student extends Person{

	private int grade; // 학년
	private String major; // 전공
	
	
	public Student() {
		
	}

	 // 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height, double weight, int grade, String major) {
		// 부모의 생성자를 호출 합니다.
		
		super(age, height, weight);
		// super.age; // private 접근제한자라 접근 불가
		// protected : 패키지가 달라도 부모자식 관계면 가능
		
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		// super.information 반환타입  String
		return super.information()
					+ " " + getGrade() 
					+ " " + getMajor();
				
	//getName() +" "+ getAge() +" "+ getHeight() +" "+ getWeight() +" "+ getGrade() +" "+ getGrade() +" "+getMajor();
	
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
