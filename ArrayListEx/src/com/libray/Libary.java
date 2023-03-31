package com.libray;

import java.util.ArrayList;
import java.util.List;

public class Libary {

	// 인터페이스 <<  객체 생성 할 수 없기 때문에 구현체인 ArrayList << 
	List<Book> bookList = new ArrayList<>();

	
	// 기본생성자
	public Libary() {
		
	}
	
	// 생성자
	public Libary(List<Book> bookList) {

		this.bookList = bookList;
	}
	
	// 생성과 사용을 구분할 것
	/**
	 * 
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
		
	}
	
	@Override
	public String toString() {
		
		
		for(Book book : bookList) {
			
		  System.out.println(book.getTitle() + "/" 
					+ book.getAuthor() + "/" + book.isRent());
			
		}
		
		return  super.toString();
	}
	
	
	
}
