package Dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	// 데이터의 입출력

	//명세서

	// 책 리스트를 조회하는 추상메서드 
	 List<Book> getBookList(); 
	 
	 // 신규 도서 등록
	 int insertBook(Book book);

	 // 도서 삭제
	 int deleteBook(Book book);

	 // 도서정보 업데이트
	 int updatBook(Book book);

}
