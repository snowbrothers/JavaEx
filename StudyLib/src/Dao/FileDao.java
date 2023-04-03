package Dao;

import java.util.List;

import vo.Book;

public class FileDao implements Dao{

	
	@Override
	public List<Book> getBookList() {
		System.out.println("책의 리스트를 조회");
		return null;
	}

	@Override
	public int inserBook(Book book) {
		System.out.println("신규 도서 등록");
		return 0;
	}

	@Override
	public int deleteBook(Book book) {
		System.out.println("도서 삭제");
		return 0;
	}

	@Override
	public int updatBook(Book book) {
		System.out.println("도서정보 업데이트");
		return 0;
	}

	
}
