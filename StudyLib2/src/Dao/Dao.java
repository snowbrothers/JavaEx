package Dao;

import java.util.ArrayList;
import java.util.List;

import vo.Book;

public interface Dao {

	
	List<Book> getBookList();

	
	int insertBook(Book book);

	int deleteBook(Book book);
	
	int updatBook(Book book);
}
