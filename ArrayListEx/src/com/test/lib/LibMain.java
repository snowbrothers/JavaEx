package com.test.lib;

public class LibMain {

	public static void main(String[] args) {
		
		
		Library lib = new Library();
		
		// 추가
		
		
		lib.addBook("그리스 나쁜로마 신화", "티그리스");
		lib.addBook("생명과 탄생", "이명섭");
		lib.addBook("난중일기", "이순신");
		lib.addBook("나홀로 지지베베", "홍섭규");
		lib.addBook("싱싱청과물", "청년");

		System.out.println("==================================");
		System.out.println("책의 정보를 출력합니다.");
		System.out.println("==================================");
		
		lib.toString();
		
		// 삭제
		
		lib.removeBook(4);
	
		System.out.println("==================================");
		System.out.println("책의 정보를 출력합니다.");
		System.out.println("==================================");
		
		lib.toString();
		
		// 대여
		
		lib.upDate(1);
		
		
		System.out.println("==================================");
		System.out.println("책의 정보를 출력합니다.");
		System.out.println("==================================");
		
		lib.toString();
		
	}
}
