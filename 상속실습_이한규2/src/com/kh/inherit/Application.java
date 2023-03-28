package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Person;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

		Person[] stu = new Student[3];

		stu[0] = new Student("김춘삼", 18, 170, 75, 2, "항공고등학교");
		stu[1] = new Student("심수연", 30, 167, 47, 1, "연극영화과");
		stu[2] = new Student("김삿갓", 57, 175, 65, 2, "삿갓제작과");

		for (Person st : stu) {
			System.out.println(st.information());
		}

		System.out.println("===============================");

		// 10명 배열 생성 회사원 정보 입력

		int index = 0;

		Person[] empArr = new Employee[10];

		Scanner scan = new Scanner(System.in);

		while (true) {
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

			Person em = new Employee(name, age, height, weight, salary, dept);

			empArr[index] = em;

			index++;

			// 종료
			System.out.println("종료 : n , 계속 : Y , y ");
			String str = scan.next();

			if (str.equals("n") || index == 10) {

				System.out.println("종료 후 배열을 출력합니다.");
				break;

			} else if (str.equals("y") || str.equals("Y")) {

			}

		}

	
		for (Person err : empArr) {
			if (err == null) {
				break;
			}
			System.out.println(err.information());

		}

	}
}
