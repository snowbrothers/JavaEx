package com.library.dao;

import java.util.List;

import vo.Book;

public interface Dao {

	
	
	// 파일로 부터 데이터를 읽어서 리스트에 담아 반환합니다.
	
	// 메소드 정의.
	
	List<Book> getList();

	// 추상메소드
	
	boolean fileSave(List<Book> list);
}
