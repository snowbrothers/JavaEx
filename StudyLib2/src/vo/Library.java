package vo;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	
	public Library() {

		
		bookList.add(new Book(1, "책1", "작가1", false));
		bookList.add(new Book(2, "책2", "작가2", false));
		bookList.add(new Book(3, "책3", "작가3", false));
		bookList.add(new Book(4, "책4", "작가4", false));
		
		
	}
	
	// 책추가
	
	public boolean insertBook(int number, String title, String author, boolean isRent) {
		
		Book book = new Book(number, title, author, isRent);
		
		bookList.add(book);
		
		System.out.println("도서가 추가 되었습니다  : " + book.info());
		
		return true;
	}
	
	public boolean deleteBook(int index) {
		
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				
				
				System.out.println("도서가 삭제 되었습니다. : " + book.info());
				return bookList.remove(book);
				
			}
			
		}
		
		System.err.println("해당하는 일련번호를 찾지 못하였습니다.");
		return false;
		
	}
	
	
	public boolean rentBook(int index) {
		
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				
				if(book.isRent()) {
					
					System.err.println("이미 대여중인 도서입니다.");
				}
			
				book.setRent(true);
				
				System.out.println("도서가 대여 되었습니다 : " + book.info());
				return true;
			}
		}
		
		System.out.println("해당하는 일련번호를 찾지 못하였습니다.");
		return false;
	}
	
	
	
	public boolean returnBook(int index) {
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				if(!book.isRent()) {
					
					System.out.println("대여 되지 않은 도서 입니다.");
				}
				
				book.setRent(false);
				System.out.println("도서가 반납되었습니다 : " + book.info());
				return false;
			}
			
		}
		
		System.out.println("해당하는 일련번호를 찾지 못하였습니다.");
		return false;
	}
	
	public void info() {
		
		System.out.println("=====도서 출력======");
		
		for(Book book : bookList) {
			
			System.out.println(book.info());
			
		}
	}

}
