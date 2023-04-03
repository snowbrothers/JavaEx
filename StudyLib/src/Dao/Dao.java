package Dao;

import java.util.List;

import vo.Book;

public interface Dao {

	
	// 데이터의 입출력 ! 
	
	// 책의 리스트를 조회하는 추상 메서드
	List<Book> getBookList();
	
	// 신규 도서 등록
	int inserBook(Book book);
	
	// 도서 삭제
	int deleteBook(Book book);
	
	// 도서정보 업데이트
	int updatBook(Book book);
	
}

	