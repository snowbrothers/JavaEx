package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Person;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

		
		// 인덱스 3의 배열
		
	
	Person[] stu = new Student[3];
	stu[0] = new Student("강백호", 17, 192, 90, 1, "북산고교");
	stu[1] = new Student("서태웅", 17, 190, 88, 1, "북산고교");	
	stu[2] = new Student("채치수", 17, 196, 100, 3, "북산고교");
		
	for(Person st : stu) {
		
		System.out.println(st.information());
	}
	
	System.out.println("========================================");
	

	// 배열 10 , 반복문, 사용자에게 입력 객체 저장 후 출력
	
	Scanner scan = new Scanner(System.in);
	int index = 0;
	
	
	Employee[] empArr = new Employee[10];


	while(true) {
		
		System.out.println("학생정보를 입력해주세요");
		
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		System.out.println("신장 : ");
		double height = scan.nextDouble();
		
		System.out.println("몸무게 : ");
		double weight = scan.nextDouble();
		
		System.out.println("급여 : ");
		int salray = scan.nextInt();
		
		System.out.println("부서 : ");
		String dept = scan.next();
		
		Employee em= new Employee(name, age, height, weight, salray, dept);
		
		
		empArr[index] = em;
		
		index++;
		
		//종료
		System.out.println("계속입력 : y,Y | 종료 : n");
		String str = scan.next();
		
		if(str.equals("n")) {
			
			break;
			
		} else if(str.equals("y") || str.equals("Y")) {
			
		
		} 
		
	}
	
		for(Employee emp : empArr) {
		
		if(emp == null) {
			break;
		} else 
		
			System.out.println(emp.information());
	}

		scan.close();
		
	}
	
	
}
