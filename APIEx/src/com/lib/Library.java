package com.lib;

public class Library {

	private Book[] bookArry = new Book[5];

	public void addBook() {
		
		bookArry[0] = new Book("혼공자", "신용권");
		bookArry[1] = new Book("자바의 정석", "조정석");
		bookArry[2] = new Book("불편한 편의점", "신정수");
		bookArry[3] = new Book("슬램덩크", "정수삼");
		bookArry[4] = new Book("나루토", "이한규");

	}


	
	@Override
	public String toString() {

		String str = "";
	
		for(Book b : bookArry) {
			
		str += b.getTitle() +" " + b.getAuthor() + "\n";
			
		}
		
		
		
		return str;
	}
	

}
