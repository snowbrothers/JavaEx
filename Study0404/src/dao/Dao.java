package dao;

import java.util.List;

import vo.Book;

public interface Dao {

	
	
	List<Book> getList();

	
	void insertBook(Book book);

	void deleteBook(Book book);

	void updateBook(Book book);
}
