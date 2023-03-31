package com.librayEx;

public class LibMainEx {

	
	public static void main(String[] args) {
		
		// 책 추가
		
		LIbrayEx lib  = new LIbrayEx();
	
	
		lib.addBook("책이름 1 ", "지은이 1");
		lib.addBook("책이름 2 ", "지은이 2");
		lib.addBook("책이름 3 ", "지은이 3");
		lib.addBook("책이름 4 ", "지은이 4");
		lib.addBook("책이름 5 ", "지은이 5");
		
		System.out.println("===========================");
		System.out.println("=====  책 정보를 출력합니다  =====");
		System.out.println("===========================");
		lib.toString();
		
		// 책 삭제 
		lib.removeBook(4);
		
		System.out.println("===========================");
		System.out.println("=====  책 정보를 출력합니다  =====");
		System.out.println("===========================");
		
		lib.toString();
		
		
		// 수정
		lib.upDateBook(3);
		
		System.out.println("===========================");
		System.out.println("=====  책 정보를 출력합니다  =====");
		System.out.println("===========================");
		

		lib.toString();
		
		
		
		
	}
}
