package dao;

import java.util.List;

import vo.Book;

public class DbDao implements Dao {

	@Override
	public List<Book> getList() {
		System.out.println("DB - 리스트 조회");
		return null;
	}

	@Override
	public void insertBook(Book book) {
		System.out.println("DB - 신규 도서 추가");		
	}

	@Override
	public void deleteBook(Book book) {
		System.out.println("DB - 기존 도서 삭제");		
	}

	@Override
	public void updateBook(Book book) {
		System.out.println("DB - 도서 정보 업데이트");
		
	}

}
