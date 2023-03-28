package com.kh.object.parctice;

public class StaticSample {

	// 접근제한자가 private 이므로 직접 접근이 불가능 합니다.
	// setter, getter 메서드를 이용합니다.
	
	private static String value;
	
	
	
	
	public static void toUpper() {
		
		// 모두 대문자로 변경 메소드
		// 반환된 값을 받아서 value 에 저장 !!!
		value =	value.toUpperCase();
		
		System.out.println("대문자로 : "+ value);
		/* char[] ch = {};
		
		System.out.print("대문자로 :  ");
		
		for(char c : ch) {
			
			System.out.print( c);
		}*/
		
		
	}
	
	public static void setChar(int index, char c) {
		
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		// String 문자열을 char[] 로 반환한다.
		// 한글자씩 배열의 방에 저장된다.
		char[] charArr = value.toCharArray();
		// 배열이름 [방번호] = 값;
		// 값을 배열의 방번호에 입력 ->
		charArr[index] = c;

		value = String.valueOf(charArr); 

		System.out.println(getValue());
		
//		System.out.println("char[] 출력 ==================");
//		for(char charValue : charArr) {
//			
//			
//			System.out.println(charValue);
//		}
		
		
		
	}
	
	public static int valueLength() {
		
		
		
		//str.length : 문자열의 길이를 반환
		return value.length();
	}

	
	public static String valueConcat(String str) {
		
		// 문자열을 연결하여 반환 
		
		// 저장!
		// value = value.concat(str);
		
		
		return value.concat(str);
	}

	
	
	
	public static String getValue() {
		
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	
	
	
}

