package com.test.lib;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	public Library() {

	}

	public Library(List<Book> bookList) {

		this.bookList = bookList;
	}

	
	public void addBook(String title, String author) {
		
		Book book = new Book(title, author);
		
		bookList.add(book);
		

	}
	
	
	public void removeBook(int index) {
		
		Book book = bookList.remove(index);
	
		System.out.println("삭제 되었습니다 : " + book.toString());
		
	
	}
	
	// 대여여부 수정
	
	public void upDate(int index) {
		
		// 책 가져오기
		Book book = bookList.get(index);
		
		 // 대여 여부 수정하기 set;
		
		book.setRent(true);
		
//		다시 저장

	
		bookList.set(index, book);	
		
		
	}
	
	
	
	@Override
	public String toString() {

		int i=0;
		
		for(Book bk : bookList) {
			
			System.out.println(i +  " : " + bk.toString());
			i++;
		}
		
		
		return super.toString();
	}

	
}
