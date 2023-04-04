package com.library.vo;

import java.util.List;

import com.library.dao.FileDao;

public class App {

	public static void main(String[] args) {
		
		Library lib = new Library();
		System.out.println(lib.toString());
		
		lib.insert(4, "난중일기", "이순신", false);
		
		System.out.println(" 출력 테스트 ==============");
		System.out.println(lib.toString());
		
		
		
		/*FileDao dao = new FileDao();
		
		// 파일로부터 읽는다.
		//List<Book> lsit =
			List<Book> list = dao.getlist();
		
			
			System.out.println("생성된 리스트 =====================");
			for(Book book : list) {
				
				System.out.println(book.toString());
			}*/
		
		
		//for(list)
	}
	
}
