package com.jongang;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		
	// Calculator 객체를 생성 후 주소값을 반환한다.
		// new 연산자를 통해 메모리를 올린다 . Heap 영역
	// 타입 변수이름 = new 생성자
	Calculator calc	= new Calculator();
	
	System.out.println(" ===================== ");
		
	// 반환타입 패키지 . 클래스 . 메서드(매개변수)
	// int com.jongang.Calculator.add(int num1, int num2)
	// . : 주소접근연산자
	
/*	System.out.println(calc.name);
	calc.name = "실수 계산기";
	
	// 필드에 접근해서 값을 바꿀 수있다.
	System.out.println("calc.name:  " + calc.name); */
	
	int addRes = calc.add(5, 7);
	// 재사용할때 변수에 담아준다.
	
	System.out.println(addRes);
	
	//  생성자 만들기 !
	
	
	}

}
