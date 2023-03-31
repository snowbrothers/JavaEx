package com.libray1;

public class LibMain {

	public static void main(String[] args) {
		
		Libary lib = new Libary();

		lib.addBook("운수 좋은 날", "현진건");
		lib.addBook("반지의 제왕", "톨킨");
		lib.addBook("난중일기", "이순신");
		
		//출력
		lib.toString();
		
		System.out.println("");
		System.out.println("몇번째 인덱스의 책을 제거하시겠습니까?");
		lib.remove(0);
		lib.toString();
		
		
		System.out.println("==========================");
		
		// 업데이트 
		lib.upDate(1);
		
		lib.toString();
		
		
	}
	
	
	
}
