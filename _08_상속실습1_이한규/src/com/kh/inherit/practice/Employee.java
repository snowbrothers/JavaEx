package com.kh.inherit.practice;

//import java.util.Scanner;

public class Employee extends Person {

	private int salary; // 급여
	private String dept; // 부서
	
	
	public Employee() {
		
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		
		super(age, height, weight);
		
		//접근제한자가 protected 이기때문에 this 또한 사용이 가능합니다.
		//this.name = name;
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public String information() {

		// 부모메서드 호출 결과 반환된 
		return super.information() 
					+ " " + getSalary() + " " + getDept();
			
		//getName() +" "+getAge()+" "+getHeight()+" "+getWeight()+" "+getSalary()+" "+getDept();
		
		
		
		
	}

	
	// get, set // 
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
}
