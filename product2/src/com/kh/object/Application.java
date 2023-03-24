package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		
		
//		기본 생성자, 매개변수 생성자 	를 이용하여 2개의 객체 생성 후 출력
//		setter 메소드를 첫번째 객체 값 수정 후 출력
//		getter 메소드를 이용하여 할인 율을 적용한 책 가격 출력
	
		Book book = new Book();
		
		Book book1	= new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		book.info();
		book1.info();
		
		System.out.println("==========================");
		
		book.setTitle("C언어");
		book.setPrice(30000);;
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		book.info();
		
		System.out.println("==========================");
		
		System.out.println("할인된 가격 = " + book.disc()+ "원\n");
		System.out.println("할인된 가격 = " + book1.disc()+ "원");
		
	
	}

	
}
