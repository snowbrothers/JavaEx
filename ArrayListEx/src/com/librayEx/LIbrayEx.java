package com.librayEx;

import java.util.ArrayList;
import java.util.List;

public class LIbrayEx {

	List<BookEx> bookList = new ArrayList<>();
	
	
	public LIbrayEx() {
		
		
	}
	
	public LIbrayEx(List<BookEx> bookList) {
		
		this.bookList = bookList;
	
	}
	
	
	public void addBook(String title, String author) {
		
		BookEx book = new BookEx(title, author);
		
		bookList.add(book);
		
	}
	
	public void removeBook(int index) {
		
		BookEx book = bookList.remove(index);
		
		System.out.println("삭제되었습니다 : " + book.toString());
		
		
		
	}
	
	
	public void upDateBook(int index) {
		
		// 책을 가져온다. get //
		// 책의 대여 여부를 수정한다 // 
		// 책을 다시 저장한다 // 
		
		BookEx book = bookList.get(index);
		
		book.setRent(true);
		
		bookList.set(index, book);
		
	}
	
	@Override
	public String toString() {

		int i = 0;
		
		for(BookEx book : bookList) {
			
			System.out.println(i +  " : " + book.toString());
			 i++;
		}
		
		
		return super.toString();
	}
	
}
