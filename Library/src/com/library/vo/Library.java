package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import Dao.Dao;
import Dao.DatabaseDao;
import Dao.FileDao;

public class Library {
	
	// 도서 리스트 - 메모리(프로그램 종료 시 사라짐)
	// 리스트 선언 방법 // 도서 리스트
	private List<Book> bookList = new ArrayList<>();
	
	// 라이브러리가 가지고 있는 메소드를 전부 사용할 것이기 때문에 필드로 생성
	// 데이터의 입출력
	private Dao dao = null;
	
	/**
	 * 
	 * 생성자
	 * 
	 */

	public Library(String confDao) {
		
		// 어떤 인터페이스를 사용할지 결정.
		// 사용방법은 같다.
		
		if("db".equals(confDao)) {
			
			this.dao = new DatabaseDao();
			
		} else {
			
			this.dao = new FileDao();
		}
		
		// 책의 리스트를 조회 ( 파일 또는 DB 를 이용해서 조회 )
		// 책을 생성해서 List 에 담아 준다.
		// TODO : 일련번호가 겹치지 않았으면 좋겠음. 중복검사?
		
		// 파일로 읽어서 책을 생성.
		bookList = dao.getBookList();
		System.out.println(bookList);
		System.out.println("라이브러리 생성자");
		System.out.println("도서목록");
		//info();
		
		// 데이터베이스를 이용할 경우 번호를 기본 Key 로 사용 시 
		// 중복된 번호는 입력이 안되므로 오류 발생
//		bookList.add(new Book(1, "책1", "작가1", false));
//		bookList.add(new Book(2, "책2", "작가2", false));
//		bookList.add(new Book(3, "책3", "작가3", false));
//		bookList.add(new Book(4, "책4", "작가4", false));

	}

	// 메소드 설계

	/**
	 * 신규도서 추가
	 * 
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no, String title, String author, boolean isRent) {

		// bookList.add(new Book(no, title, author, isRent);
		Book book = new Book(no, title, author, isRent);
		
//		if(bookList == null) {
//			
//			return false;
//		}
		
		
		bookList.add(book);
		dao.insertBook(bookList);
		return true;
	}

	/**
	 * 책의 일련번호를 매개변수로 받아서 책의 정보를 수정합니다.
	 * 
	 * @param index
	 */
	
	public boolean rentBook(int index) {

		
		
		for (Book bkk : bookList) {
			
			// 사용자가 입력한 일련번호가 존재하는 경우
			if (bkk.getNumber() == index) {
				//System.out.println("isRent : " + bkk.isRent());
				// d이미 대여중인 경우 대여 불가
				
				if(bkk.isRent()) {
					System.err.println("이미 대여중인 도서입니다.");
				
				}
				
				bkk.setRent(true);
				dao.updatBook(bookList);
				return true;
			}

		}
		System.err.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;

	}

	// 책 반납.
	public boolean returnBook(int index) {
		
		
		for(Book bkk : bookList) {
			
			if(bkk.getNumber() ==  index) {

				/* bkk.setRent(false);
				dao.updatBook(bkk);
				System.out.println("반납이 완료되었습니다" ); */
				
				if(!bkk.isRent()) {
					
					System.err.println("반납 가능한 도서가 아닙니다. \n 관리자에게 문의해주세요.");
					return false;
				}

				bkk.setRent(false);
				dao.updatBook(bookList);
				System.out.println("반납이 완료되었습니다" );
				bkk.info();
				
				return true;
			
			}else {
		
			System.err.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
			return false;
			}
		}
		
		
		/* Book book = bookList.get(no);
				
		book.setRent(false);
		
		bookList.set(no, book);
				
		System.out.println(book.getNumber() 
								+ " : " + book.getTitle() + "가 반납 되었습니다.");*/ 
		
		
		return false;
	}
	
	
	// 삭제
	public boolean removeBook(int index) {

		
		
		
		for(Book bkk : bookList) {

			if(index == bkk.getNumber()) {
				
				dao.deleteBook(bookList);
				return bookList.remove(bkk);
			}
		}
		
	
		
		System.err.println("일련번호를 찾을 수가 없습니다.");
		return false;
	}

	// 책의 리스트 정보를 출력합니다.

	public void info() {
		System.out.println("===============================");
		// 리스트를 돌면서 책의 정보를 출력
		
		if(bookList == null) {
			System.out.println("책목록이 비었습니다.");
			return;
		}
		for (Book book : bookList) {

			// 책의 정보를 출력.
			book.info();
		}
	}
	
	
	public static void main(String[] args) {
		
		Library lib = new Library(" ");
		
		// 도서 리스트 출력
		lib.info();
		
		
		
		// 신규 도서 등력
		lib.insertBook(5, "책5", "저자5", false);
	
		// 도서 대여
		System.out.println("도서 대여 실행 ========================");
		lib.rentBook(1);
		
		// 도서 리스트 출력
		lib.info();
		
		System.out.println("도서 삭제 실행 ========================");
		lib.removeBook(5);
		
		
		// 반납
		System.out.println("도서 반납 실행 ========================");
		lib.returnBook(1);
		
		
		lib.info();
	
	
	}

}
