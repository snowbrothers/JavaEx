package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Person;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

		Person per = new Student();
		Person per1 = new Employee();

		Student[] infoArr = new Student[3];

		infoArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		infoArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "정보시스템공학과");
		infoArr[2] = new Student("강개순", 23, 163.0, 45.0, 3, "정보시스템공학과");

		for (Student person : infoArr) {

			System.out.println(person.information());

		}

		Employee[] infoArr2 = new Employee[3];

		infoArr2[0] = new Employee("박보검", 28, 180.3, 72.0, 100000000, "영업부");
		infoArr2[1] = new Employee("강동원", 40, 182.0, 76.0, 200000000, "영업부");

		System.out.println("===========================================");

		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 1;

		boolean run = true;
		while (run) {

			System.out.println(i + " 번째index 의 값을 차례대로 입력해주세요.");
			System.out.println("이름, 나이, 키, 몸무게, 급여, 부서 | 순 입니다.");

			String name = scan.next();
			int age = scan.nextInt();
			double height = scan.nextDouble();
			double weight = scan.nextDouble();
			int salay = scan.nextInt();
			String dept = scan.next();

			infoArr2[i] = new Employee(name, age, height, weight, salay, dept);

			System.out.println("현재 입력한 횟수 " + j);
			j++;

			System.out.println("=====================================");
			System.out.println(" 계속추가하고자 하면 'y' 종료하고자 하면 'n' 를 입력해주세요");

			String str = scan.next();

			
			// 다른 값을 입력했을때 
			if (str.equals("y")) {
				System.out.println("정보를 입력해주세요");

			} else if (str.equals("n")) {
				break;
			} else {
				System.out.println(" =========================================== ");
				System.out.println("다시 입력해주세요");
			
			}

			i++;

		}

		System.out.println(" ============= 사원의 정보 출력");

		/*
		 * for(Employee em : infoArr2) {
		 * 
		 * System.out.println(em.information());
		 * 
		 * 
		 * }
		 */

		// 입력된 인덱스의 방만큼 출력
		// 기본값은 null 오류 날때는 null 값을 처리해주어여햐마...
		
		for (int k = 0; k < j; k++) {
			if(infoArr2[k] == null) {
				System.out.println("종료되었습니다.");
				break;
			}
		
			System.out.println(infoArr2[k].information());

			// 입력된 인덱스의 방만큼 출력

			/*
			 * Person person1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"); Person
			 * person2 = new Student("김말똥", 21, 187.3, 80.0, 2, "정보시스템공학과"); Person person3
			 * = new Student("강개순", 23, 163.0, 45.0, 3, "정보시스템공학과");
			 */

			/*
			 * System.out.println(person1.information());
			 * System.out.println(person2.information());
			 * System.out.println(person3.information());
			 */

		}

	}
}
