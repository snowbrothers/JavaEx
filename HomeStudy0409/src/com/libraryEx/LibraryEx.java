package com.libraryEx;

import java.util.List;

import com.libraryEx.dao.DBDao;
import com.libraryEx.vo.Book;

public class LibraryEx {

	DBDao dao = new DBDao();
	
	public void bookListPrint() {
		
		List<com.libraryEx.vo.Book> list = dao.getList();
		
		if(list == null) {
			
			System.out.println("등록된 책이 없습니다.");
			return;
			
		}
		
		
		System.out.println("책 목록 =========================");
		for(Book book : list) {
			System.out.println(book.toString());
			
		}
		
		
	}
	
	
	
	
	public boolean addBook(int no, String title, String author) {
		
		Book book = new Book(no, title, author, "N");
		
		int res = dao.insert(book);
		
		return res>0 ? true:false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
