package com.library.vo;


/**
 * 실행!
 * @author user
 *
 */
public class App {

	
	public static void main(String[] args) {
		
		
		// 책의 생성자를 호출함과 동시에 책 목록 출력.
		Library lib = new Library();
		
		lib.insertBook(1, "난중일기", "이순신", false);
		lib.insertBook(2, "삼국지", "나관중", false);
		lib.insertBook(3, "괴물", "봉준호", false);
		
		lib.toString();
		
		//lib.deleteBook(3);
		
	
		
	}
}
