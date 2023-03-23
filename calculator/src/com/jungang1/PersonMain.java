package com.jungang1;

public class PersonMain {

	public static void main(String[] args) {
		
		
		// F3 으로 어떤 생성자가 실행 되는지 판단 가능
		// 생성자는 매개변수의 개수와 타입을 참조함.
		// 알맞게 입력하는 것이 중요
		
		Person person = new Person();
		Person kang = new Person("강동주", 32, 184.2, 76);
	
		
		// 내가 생성한 메서드 person.information() <
		System.out.println(person.information());
		System.out.println(kang.information());
		
		System.out.println("================== 배열구분 ===================");
		
		Person[] personArr = new Person[5];
		personArr[0] = new Person("일한규", 21, 170, 70); 
		personArr[1] = new Person("이한규", 22, 163, 63);
		personArr[2] = new Person("삼한규", 23, 173, 89);
		personArr[3] = new Person("사한규", 24, 130, 30);
		personArr[4] = new Person("오한규", 25, 190, 90);
	
			
		
		// 타입 변수명 : 배열 -> 배열에 들어있는 타입이 온다.
		// 배열을 처음부터 끝까지 순회하시오.
		for(Person per : personArr) {
			System.out.println(per.information());
			System.out.println("======================");

		
		}
		
	}

}
