package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

/**
 * 비즈니스로직 사용자요청 검증 DB CRUD 요청 사용자 요구에 맞게 반환
 * 
 * Dao 호출
 * 
 * @author user
 *
 */
public class BookService {

	// 책에대한 정보를 출력
	// 데이터의 입출력을 위해 Dao 에 접근
	BookDao bookDao = new BookDao();

	// 비즈니스 로직 : 요청에 응답하기 위한 처리
	public void getList() {

		List<BookVo> list = bookDao.getList();

		for (BookVo book : list) {

			System.out.println(book.toString());
		}

		// 책 삭제

		// 책 대여

		// 책 반납

	}

	/**
	 * 도서 등록
	 * 
	 * @param bookVo
	 * @return
	 */
	public int insertBook(BookVo bookVo) {

		int res = bookDao.insertBook(bookVo);

		if (res > 0) {
			System.out.println("입력 되었습니다.");
		} else {
			System.out.println("입력중 오류가 발생 했습니다.");

		}

		return 1;
	}

	/**
	 * 책 삭제
	 * 
	 * @param bookNo
	 * @return
	 */
	public int deleteBook(int bookNo) {

		// 데이터베이스 작업을 서비스에서 호출
		int res = bookDao.deleteBook(bookNo);

		if (res > 0) {
			System.out.println("삭제 되었습니다.");

			// 정보 출력
			getList();
		} else {
			System.err.println("입력중 오류가 발생 했습니다.");

		}

		return 1;
	}

	/**
	 * 책이 렌트 가능한 상태인지 확인 사용자에게 도서의 일련번호를 입력받아 도서대여를 실시합니다. 불가능하면 메세지 처리
	 * 
	 * @param bookNo
	 */
	public void rentBook(int bookNo) {

		// 대여 가능 여부를 판단한다.
		boolean flg = selStatus(bookNo, "N");

		if (flg) {

			int res = bookDao.updateBook(bookNo, "Y");

			if (res > 0) {
				System.out.println("대여 되었습니다.");

				getList();
			} else {
				System.err.println("대여중 문제가 발생 하였습니다.");

			}

		} else {
			System.err.println("대여가 불가능한 상태 입니다.");
		}

	}

	/**
	 * 대여/반납 가능한 책인지 조회
	 * 
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {

		boolean res = bookDao.selStatus(no, rentYN);
		return res;

	}

	public void returnBook(int bookNo) {
		
		boolean flg = selStatus(bookNo, "Y");

		if (flg) {

			int res = bookDao.updateBook(bookNo, "N");

			if (res > 0) {
				System.out.println("반납 되었습니다.");

				getList();
			} else {
				System.err.println("반납중 문제가 발생 하였습니다.");

			}

		} else {
			System.err.println("밥납이 불가능한 상태 입니다.");
		}
	}

}
