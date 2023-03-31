package com.libray1;

import java.util.ArrayList;
import java.util.List;

public class Libary {

	List<Book> bookList = new ArrayList<>();
	
	
	
	public Libary() {
		
	}
	
	
	// 출력!
	public void addBook(String title, String author) {
		
		Book book = new Book(title , author);
		
		bookList.add(book);
		
		
	}
	
	
	public void remove(int index) {
		
		bookList.remove(index);
		
	}
	
	public void upDate(int index) {
		
		Book book = bookList.get(index);
	
		book.setRent(true);
		
		bookList.set(index, book);
	}
	
	
	@Override
	public String toString() {

		int index = 0;
	
		
		for(Book b : bookList) {
		
			
			
			System.out.println(index + " " + b.toString());
			index++;
		}
		
		
		
		
		
		return super.toString();
	}
	
}
