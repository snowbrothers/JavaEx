package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DbDao;
import com.library.dao.FileDao;

public class Library {

	// 필드 == 전역변수
	private List<Book> list;
	// FileDao 또는 DatabaseDao 로 생성 할 수 있도록
	// 인터페이스를 타입으로 선언
	
	private Dao dao = new FileDao();
	
	public Library() {
		
		// 파일을 읽어서 리스트를 초기화 합니다.
		list = dao.getlist();
		
		
	}
	
	public boolean insert(int no, String title, 
							String author, boolean isRent) {
	
		// 외부로 부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가한다.
		Book book = new Book(no, title, author, isRent);
		
		// 리스트를 파일에 저장
		
		list.add(book);
		boolean res = dao.fileSave(list);
		
		if(res) { 
			//파일에 성공적으로 저장되면 리스트에 추가 
			return true;
			
		} else {
			list.remove(book);
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		String listStr = " ";
		for(Book book : list) {
			
			listStr += book.toString() +"\n";
			
		
		}
		
		
		return listStr;
	}
	public Library(String type) {
		
		if("DB".equalsIgnoreCase(type)) {
			
			// dao = (Dao) new DbDao();
			
		}
	}
	
	
}


