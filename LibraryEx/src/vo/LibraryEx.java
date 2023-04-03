package vo;

import java.util.ArrayList;
import java.util.List;

public class LibraryEx {

	
	List<BookEx> bookList = new ArrayList<>();

	
	public LibraryEx() {

	
	}
	
	public LibraryEx(List<BookEx> bookList) {
		
		this.bookList = bookList;
		
	}

	
	// 책추가
	// 메소드
	public boolean insertBook(int number, String title, String author, boolean isRent) {
		
		BookEx book = new BookEx(number, title, author, isRent);
		
		bookList.add(book);
		
		
		
		return false;
	}
	
	
	
	// 책 삭제
	public boolean removeBook(int index) {
		
		for(BookEx book : bookList) {
			
			if(index == book.getNumber()) {
				
				// 왜 book?
				return bookList.remove(book);
				
			}
		} 
		
		System.out.println("입력하신 일련번호를 찾을 수 없습니다.");
		return false;
		
		
	}
	
	
	// 책 대여 
	
	public boolean rentBook(int index) {
		
		
		for(BookEx book : bookList) {
			
			if(index == book.getNumber()) {
			
			if(book.getIsRent()) {
				System.out.println("이미 대여중인 도서 입니다.");
			}
				
			book.setIsRent(true);
			return true;
			
			}
		}
		
		
		return false;
	}
	
	
	public void info() {
		
		System.out.println("=======================");
		for(BookEx book : bookList) {
			
					System.out.println(book.info());
			
		}
		
	}
	

}
