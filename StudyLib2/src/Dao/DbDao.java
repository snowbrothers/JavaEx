package Dao;

import java.util.List;

import vo.Book;

public class DbDao implements Dao {

	@Override
	public List<Book> getBookList() {
		System.out.println("DB - 리스트 조회");
		
		return null;
	}

	@Override
	public int insertBook(Book book) {
		System.out.println("DB - 신규 도서 추가");

		return 0;
	}

	@Override
	public int deleteBook(Book book) {
		System.out.println("DB - 기존 도서 삭제");		
		return 0;
	}

	@Override
	public int updatBook(Book book) {
		System.out.println("DB - 도서 정보 업데이트");
		return 0;
	}

}
