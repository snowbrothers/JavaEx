package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application2 {

	public static void main(String[] args) {
		
		// null >> 연결되어있는 주소가 없다.
		// . << 주소에 접근.. 
		
		/* 3명의 학생 정보를 기록 할 수 있게 객체 배열을 할당
		 * 데이터를 참고하여 3명의 학생 객체 생성 후
		 * 반복문을 통해 출력 */
		 // 배열 선언 : 같은 타입의 데이터를 여러개 보관한다.
		 // 배열 선언 : 타입[] 변수명 = new 타입[길이];
		
		Student[] sArry = new Student[3];
		
		// 객체 생성 후 배열에 넣을 수도 있음
		Student s1 = new Student("홍길동", 20, 178.2 ,70.0, 1, "정보시스템공학과");
	
		sArry[0] = s1;
		sArry[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		sArry[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
	
		for(Student s : sArry) {
			
			System.out.println(s.information());
		
		}
		
		System.out.println("==========================================");
	
//		1. 최대 10명의 사원정보를 기록할 객체 배열 생성
//		2. 문을 사용하여 키보드로 사원 정보를 입력받도록 구현
		
		// Emplotyee 타입을 담을 수 있는 
		// 10개의 방이 생성되고 참조변수의 초기값인 null 이 입력된다
		
		// 키보드로 입력받기 위해 사용하는 객체
		Employee[] empArry = new Employee[10];

		Scanner scan = new Scanner(System.in);
		
		int index = 0;
		
		while(true) {
			
			
			System.out.print("이름 : ");
			String name = scan.next();
			
			System.out.print("나이 : ");
			int age = scan.nextInt();
			
			System.out.print("신장 : ");
			double height = scan.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = scan.nextDouble();
			
			System.out.print("급여 : ");
			int salary = scan.nextInt();
			
			System.out.print("부서 : ");
			String dept = scan.next();
			
			// 매개변수 생성자를 이용하여 필드를 초기화
			Employee emp = new Employee(name, age, height, weight, salary, dept);
			//사용자로부터 입력받은 값으로 사원을 생성하고
			// 배열에 입력
			
			empArry[index] = emp;
			
	
			// 사원이 입력된 후 다음번 방을 가르킴
			index++;
		
			
			//반복문 탈출
			System.out.println("계속하시려면 y , 종료하시려면 n 을 입력해주세요");
			String next = scan.next();
			if(next.equals("n") || index == 10){
				
				break;
			} else if(next.equals("y")) {
				System.out.println("정보를 입력해주세요.");
			}
			
				
			
		}			
			
		
		for(Employee e : empArry) {
			//null 체크
			// 배열이 초기화 될때 null값을 초기화 한다
			// e. <== 주소접근자인 . 을 이용할 경우
			// null 은 주소를 가지고 있지 않으므로 오류가 발생합니다.
			
			if(e == null) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println(e.information());
		}
		
				
	
		
	
		// System.out.println(emp.information());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
