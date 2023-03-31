package com.objectEx;

public class ObjectEx {
	
	
	/**
	 * 1. API (Application Programming Interface)
	 *    
	 *    - API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든
	 *    	인터페이스를 뜻한다
	 *    
	 *    - 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
	 *     *라이브러리 라고 부르기도 한다.
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
			
			String str = "룰루랄라";
			print(str);
			System.out.println("=========================");
			
			
			int num = 0; // => Integet => Object
			// int 타입은 기본타입 이므로 Object 타입으로 변환 되지 못합니다.
			// int 타입을 객체형태로 변환 해야 합니다. 
			// = > Wrapper 클래스인  Integer타입으로 자동 형변환 되어져서 돌아간다.
			
			// int = > Integer (자동형변환)
			// double => Double (
			// 기본타입 : 값 자체를 저장
			// 참조타입 : 주소를 저장한다.
			
			print(num);
			System.out.println("=========================");
			ObjectEx objEx = new ObjectEx();
			print(objEx);
	
			str.toString();
			Integer.toString(num);
	
			
	
	}

	// 참조타입의 최상위 계층
	public static void print(Object obj) {
		
		// Object클래스에 toString 이 정의 되어 있지만
		// 메서드의 오버라이딩에 의해서
		// String 클래스,  Integer 클래스에 정의되어 있는 메서드가 호출된다.

		// 클래스이름@16진수 주소값이 반환된다.
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값이 같은지 비교한다.
		// 주소가 같으면 true, 다르면 false;
		obj.equals(new Object());
	
	}
	
}
