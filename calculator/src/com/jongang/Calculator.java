package com.jongang;

public class Calculator {

	// 필드 (전역변수) 
	// 접근제한자를 붙이지 않으면 default 
	// 패키지 내에서 사용할 수 있는 필드가 됨.
	// 외부로부터 내부 클래스를 보호하는 기능 << 캡슐화 !!!
	private String name;
	
	
	// 생성자의 특징 2가지
		// 1. 클래스의 이름과 동일한 이름을 가지고 있다
		// 생성자 : new 연산자를 만나서 객체 생성될 때 실행됩니다.
	// 2. 반환 타입이 없다 !
		public Calculator() {
			name = "정수계산기";
			// 객체를 초기화 한다.
			System.out.println(name);
			System.out.println("Calculator() 생성자를 실행합니다.");
		}
	
	// 정수의 합계를 구하는 메서드 >> 두 수를 입력받아 두 수의 합을 반환한다.
	
// 접근제한자  반환타입 메서드명(매개변수타입 변수명){}
	
	// java doc 생성 
	/**	
	 * 두개의 정수를 입력받아 두수의 합을 반환 합니다.
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	
	public int add(int num1, int num2) {
			return num1 + num2;
		}
		
	}


