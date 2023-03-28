package com.kh.object;

import com.kh.object.parctice.StaticSample;

public class Application {

	public static void main(String[] args) {
		
		
		
		// 정적멤버 static 을 사용한 출력 
		
		
		// 클래스의 value 필드 값을 초기화
		
		// StaticSample sample= new StaticSample();
		
		
		
		StaticSample.setValue("Ymk");
		//직접 접근이 안되므로 get메서드를 활용하여 필드값을 추출한다.
		System.out.println(StaticSample.getValue());
		// toUpper 메소드 실행 후 출력
		// 메서드 호출
		StaticSample.toUpper();
		
		System.out.println("========================");
		
		
		// 2번째 인덱스의 값을 j 로 변경!
		StaticSample.setChar(2, 'j');
		// 인덱스는 0부터 시작 ,, 3번째 값 변환
		System.out.println("3번째 값을 j로 변경 : "
									+ StaticSample.getValue());
		
		System.out.println("===========================");
		System.out.println("길이 : " + StaticSample.valueLength());
		
		System.out.println("===========================");
		System.out.println("문자열 연결 : " 	
									+ StaticSample.valueConcat(" 짜잔"));
		
		
	}

}
