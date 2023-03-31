package com.san;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	
	public Library() {
		
	}


	public Library(List<Book> bookList) {

		this.bookList = bookList;
	}
	
	
	
	// 추가
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		
		// 책의 정보 저장
		bookList.add(book);
		
	}
	
	public void removeBook(int index) {
		
		Book book = bookList.remove(index);
		
		System.out.println("삭제 되었습니다 : " + book.toString());
		
	}
	
	public void upDate(int index) {
		
		Book book = bookList.get(index);
				
		book.setRent(true);
		
		bookList.set(index, book);
		
		System.out.println("대여 되었습니다. " + book.toString());
		
		
		
	}
	
	
	@Override
	public String toString() {

		int i = 0;
		
		for(Book bkk : bookList) {
			
			// bkk 가 Book 타입이기 때문에 toString Book 클래스의 toString 호출이 가능하다.
			System.out.println(i + " : " + bkk.toString());
		
			i++;
		}
		
		return super.toString();
	}
	
}
