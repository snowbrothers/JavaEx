package com.libray;

public class LibMain {
	public static void main(String[] args) {
		
	
	
		Libary1 lib = new Libary1();
	
		lib.addBook("용의자X의 살인", "히가시노 게이고");
		lib.addBook("가면산장 살인사건", "히가시노 게이고");
		lib.addBook("라플라스의 마녀", "히가시노 게이고");
	
		// 책 정보 출력
		lib.toString();
		
		System.out.println("삭제할 책 번호를 선택 해주세요.");
		
		// 책 삭제
		lib.removeBook(0);
	
		
		// 책 정보출력
		lib.toString();
	
		
		// 책대여 : book.isRent = true;
		System.out.println("대여할 책 번호를 선택 해주세요.");
		int i = 0;
		lib.updateBook(i);
		
		lib.toString();
		
		// 검증 : 책 목록의 사이즈 보다 큰 값이 입력되었을때 다시 입력 받을 수 있도록.
		
		
		
		
	
	
	}
	
}
