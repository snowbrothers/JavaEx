package com.library.service;

import java.util.List;
import java.util.Scanner;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {

	
	Book book = new Book();
	
	BookDao dao = new BookDao();
	
	
	/**
	 *  책 리스트를 조회합니다.
	 * @return
	 */
	public List<Book> getList(){
		
		List<Book> list = dao.getList();

		
		for(Book book : list) {
			
			System.out.println(book);
		}
		
		return list;
	}
	
	public void insertBook(String title, String author) {
		
	
		
		
		Book book = new Book(title, author);
		
		
		
		int res = dao.insert(book);
		
		if(res > 0) {
			System.out.println(res + "건 입력 되었습니다.");
		} else {
			System.err.println("입력중 오류가 발생 하였습니다.");
			System.err.println("관리자에게 문의 해주세요.");
		}
		
	
		
	}
	
	public void deleteBook(int no) {
		
		
		int res = dao.delete(no);
		
		if(res > 0) {
			System.out.println(res + "건 삭제 되었습니다.");
		} else {
			System.err.println("입력중 오류가 발생 하였습니다.");
			System.err.println("관리자에게 문의 해주세요.");
		}
		
		
	}

	
	public void rentBook(int no) {
		
		
	// 대여가능한 도서인지 확인
		
		String rentYN = dao.getRentYN(no);
		
		if("Y".equals(rentYN)) {
			
			System.err.println("이미 대여중인 도서 입니다.");
		} else {
			
			System.out.println("없는 도서 번호 입니다.");
		}
		
	// 대여처리
		int res = dao.update(no, "Y");
		
		if(res > 0) {
			
			System.out.println(res + "건 의 도서정보가 업데이트 되었습니다.");
		
		} else {
		
			System.err.println("도서정보 업데이트 도중 오류가 발생 하였습니다.");
		}
		
	}
	
	
	public void returnBook(int no) {
	
		String rentYN = dao.getRentYN(no);
		
	// 반납가능한 도서인지 확인
		if("N".equals(rentYN)) {
			
			System.err.println("반납 가능한 상태가 아닙니다..");
		} else {
			
			System.out.println("없는 도서 번호 입니다.");
		}
		
	// 대여처리
		int res = dao.update(no, "N");
		
		if(res > 0) {
			
			System.out.println(res + "건 의 도서정보가 업데이트 되었습니다.");
		
		} else {
		
			System.err.println("도서정보 업데이트 도중 오류가 발생 하였습니다.");
		}
		
	}
		
		
		
		
	// 반납처리
		
	
	
	public boolean rentStatus() {
		
		
		if(book.getRentYN().equals("Y")) {
			
			System.err.println("이미 대여중인 도서 입니다.");
			
			return true;
		
		} else {
			
			System.out.println("대여 가능한 도서 입니다.");
		}
		
		
		
		
		return false;
	}
	
	
	public void updateBook(int no, String rentYN) {

		int res = dao.update(no, rentYN);
		
		
		
		if(res > 0) {
			
			System.out.println(res + "건의 도서정보가 업데이트 되었습니다.");
		} else {
			System.err.println("도서정보 업데이트 도중 오류가 발생하였습니다.");
		}
		
		
		
		
	}
	
	
	
	


}
