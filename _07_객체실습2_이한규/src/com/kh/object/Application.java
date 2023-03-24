package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		
		
		// 기본 생성자, 매개변수 생성자 를 이용하여 2개의 객체 생성	후 출력
		
		Book book = new Book();
		Book book1 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book.information());
		System.out.println(book1.information());
		
		System.out.println("=============================");
		
		// setter 메소드를 첫번째 객체 값 수정 후 출력
		
		book.setTitle("C언어");
		book.setPrice(20000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book.information());

		System.out.println("=============================");
		
		book.info();
		book1.info();
		
		// getter 메소드를 이용하여 할인율을 적용한 책 가격 출력
	
	}

}
