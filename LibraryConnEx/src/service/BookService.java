package service;

import java.util.List;

import dao.BookDao;
import vo.BookVo;

public class BookService {

	BookDao bookDao = new BookDao();

	/**
	 * 도서 정보를 출력합니다.
	 */
	public void getList() {

		// BookService list 에 BookDao 에서
		// 정의한 getList 의 반환 값을 넣어준다.

		List<BookVo> list = bookDao.getList();

		// 출력문 작성. : 요청에 응답
		for (BookVo book : list) {

			System.out.println(book.toString());
		}

	}

	/**
	 * 사용자에게 등록할 책의 정보를 입력받아 책을 등록합니다.
	 * 
	 * @param no
	 * @param title
	 * @param author
	 * @return
	 */
	public int inserBook(BookVo bookVo) {

		int res = bookDao.insertBook(bookVo);

		if (res > 0) {
			System.out.println("입력 되었습니다.");
		} else {
			System.err.println("입력 중 오류가 발생 하였습니다.");
		}

		return 0;
	}

	/**
	 * 사용자에게 도서의 일련번호를 입력받고 삭제한다.
	 * 
	 * @param no
	 */
	public int deleteBook(int bookNo) {

		int res = bookDao.deleteBook(bookNo);
		
		if(res > 0) {
			System.out.println("삭제 되었습니다.");
			
		}else {
			System.err.println("삭제 도중 오류가 발생하였습니다.");
			
		}
		
		return 0;
	}

	/**
	 * 사용자에게 도서의 일련번호를 입력받아 책 대여가능여부를 판단 후 대여를 실행 합니다. 대여가 불가능 할 경우 메세지를 출력합니다.
	 * 
	 * @param no
	 */
	public void returnBook(int bookNo) {

		  boolean flg = selStatus(bookNo, "Y");
		
		 if(flg) {
			 
			 int res = bookDao.updateBook(bookNo, "N");

			 if(res > 0) {
				 
				 System.out.println("도서가 반납되었습니다.");
		 }
		  
			
		}else {
			System.err.println("반납 도중 에러가 발생 하였습니다.");
		}
		
	}

	public boolean selStatus(int bookNo, String rentYN) {
		
		boolean res = bookDao.selStatus(bookNo, rentYN);
		return res;
		
	}
	
	public int rentBook(int bookNo) {
		
		boolean flg = selStatus(bookNo, "N");
		
		 if(flg) {
			 
			 int res = bookDao.updateBook(bookNo, "Y");

			 if(res > 0) {
				 
				 System.out.println("도서가 대여되었습니다.");
		 }
		  
			
		}else {
			System.err.println("대여 도중 에러가 발생 하였습니다.");
		}
		return 0;
	}

}
