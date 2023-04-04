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
	
	
	
	// 책 추가
	public boolean insertBook(int number, String title, String author, boolean isRent) {
		
		Book book = new Book(number, title, author, isRent);
		
		bookList.add(book);
		
		System.out.println("도서가 추가되었습니다 : " + book.toString());
		
		return false;
	}
	
	// 책 삭제
	public boolean deleteBook(int number) {
		
		for(Book book : bookList) {
			
			if(book.getNumber() == number) {
				
				
				
				
				bookList.remove(book);
				System.out.println("책이 삭제되었습니다 : " + book.toString());
				return true;
				
			}
		
		}
		
		System.out.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	// 책 대여
	public boolean rentBook(int index) {
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				if(book.isRent()) {
					
					System.out.println("이미 대여중인 도서 입니다.");
				}
				
				book.setRent(true);
				System.out.println("책이 대여 되었습니다 : " + book.toString());
				return true;
				
			}
		}
		
		System.out.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	// 책 반납
	public boolean returnBook(int index) {
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				if(!book.isRent()) {
					
					System.out.println("반납 할 수 없는 도서 입니다.");
					
				}
				
				
				book.setRent(false);
				System.out.println("책이 반납되었습니다 : " + book.toString());
				return false;
			}
		}
		
		System.out.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	
	// 출력
	@Override
	public String toString() {

		System.out.println("======= 책 출력 =======");
		for(Book book : bookList) {
			
			System.out.println(book.toString());
		
		}
		
		
		return super.toString();
	}
	
	

}
