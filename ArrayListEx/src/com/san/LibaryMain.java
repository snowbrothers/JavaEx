package com.san;

import java.util.Scanner;

public class LibaryMain {

	public static void main(String[] args) {
		
		// 도서관 사서가 책을 추가, 삭제, 대여 하는 프로그램 작성.
		// 사용자에게 정보를 입력받아야하므로 scanner 사용;

	
		// Scanner scan = new Scanner(System.in);
	
		Library lib = new Library();
		
		lib.addBook("고양이", "베르나르 베르베르");
		lib.addBook("용의자X의 헌신", "히가시노 게이고");
		lib.addBook("답답하면 늬들이 차던가", "기성용");
		lib.addBook("신과 함께", "주호민");
		lib.addBook("나무", "베르나르 베르베르");
	
		lib.toString();
		
		System.out.println("===============================");
		System.out.println("= = = = 책의 정보를 출력합니다 = = = =");
		System.out.println("===============================");
	
		lib.removeBook(2);
	
		System.out.println("===============================");
		System.out.println("= = = = 책의 정보를 출력합니다 = = = =");
		System.out.println("===============================");
	
		lib.toString();
	
	
		lib.upDate(2);
		
		System.out.println("===============================");
		System.out.println("= = = = 책의 정보를 출력합니다 = = = =");
		System.out.println("===============================");
	
		lib.toString();
	
	
	
	
	
	
	
	
	}
	
		
	
	
	
	
}
