package com.library.dao;


import java.util.List;

import com.library.vo.Book;

public interface Dao {

	
	// 파일로부터 데이터를 읽어서 리스트에 담아 반환합니다.

	
	// 메소드 정의!
	List<Book> getlist();

	// 추상 메소드를 만들었음.

	boolean fileSave(List<Book> list);
}
