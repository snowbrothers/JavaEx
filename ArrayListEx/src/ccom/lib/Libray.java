package ccom.lib;

import java.util.ArrayList;
import java.util.List;

import com.libray.Book;

public class Libray {

	// 도서관.

	// 책장을 만들어야함. 책을 추가, 삭제, 대여여부를 수정 할 수있 도록 작성

	// 필드는 리스트 를 통해 Book 타입의 정보를 담도록 하자.

	// import 필요합니다.
	List<Book> bookList = new ArrayList<>();

	// 기본생성자

	public Libray() {

	}

	// List 타입의 bookList 를 매개변수로 받는 생성자

	public Libray(List<Book> bookList) {

		this.bookList = bookList;

	}

	// 책을 추가 하는 기능!
	// 책을 추가 하기 위해서는 book 의 정보를 가져와야 한다
	// 객체를 생성해야함 new 연산자를 통해서!

	public void addBook(String title, String author) {

		// 책을 추가 할 것이기 때문에 책의 정보를 담을 수 있는 생성자를 호출한다.
		Book book = new Book(title, author);

		// 책을 책장에 담아줘야 한다. List 컬렌션에는 추가, 삭제 ,수정 등등의 메소드를 제공하고 있다.

		// 매개변수로 입력받은 책의 정보를 변수 book에 담아 bookList(책장) 에 저장한다.

		bookList.add(book);

		
		
	}
	
	
	// 책을 삭제하는 메서드 생성
	public void removeBook(int index) {
		
		
		// 책장에서 책을 빼야한다. 
	
		
		Book book = bookList.remove(index);
		
		System.out.println("삭제 되었습니다 : " + book.toString());
		
	}
	
	

	// toString 메소드를 오버라이드해 정보를 출력할 수 있도록 하자
	@Override
	public String toString() {

		int i = 0;
		// 책의 목록을 출력한다.
		// 출력 bookList <<
		for (Book book : bookList) {

			System.out.println(i + " : " + book.toString());
			i++;
		}

		return super.toString();
	}


}
