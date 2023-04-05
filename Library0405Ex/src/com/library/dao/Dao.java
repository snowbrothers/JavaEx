package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {

	// bookList 로부터 데이터를 읽고 리스트를 반환합니다.
	
	// 책에 대한 정보를 담은 List.. 
	List<Book> getList();
	
	
	// 리스트를 읽고 파일로 출력한다.
	boolean listToFile(List<Book> list);
}
