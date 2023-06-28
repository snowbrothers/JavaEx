package com.library.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.library.dao.BookDao;
import com.library.vo.Book;
import com.library.vo.Criteria;
import com.library.vo.PageDto;

public class BookService {
	BookDao dao = new BookDao();
	
	/**
	 * 책 리스트를 조회 합니다.
	 * @param criteria 
	 * @return
	 */
	public Map<String, Object> getList(Criteria criteria){
		
		Map<String, Object> map = new HashMap<>();
		
		// 리스트 조회
		List<Book> list = dao.newGetList(criteria);
		
		// 총 건수 조회
		int totalCnt = dao.getTotalCnt(criteria);
		// 페이지 DTO
		PageDto pageDto = new PageDto(totalCnt, criteria);
		
		System.out.println(totalCnt);
		
		map.put("list", list);
		map.put("totalCnt", totalCnt);
		map.put("pageDto", pageDto);
		
		return map;
	}
	
	public Book selectOne(String no) {
		
		
		return dao.selectOne(no);
	}

	/**
	 * 도서 정보 입력
	 * @param sfile 
	 * @param ofile 
	 */
	public int insert(String no, String title, String author,String rentYN, String ofile, String sfile) {
		
		Book book = new Book(no, title, author, rentYN, ofile, sfile);
		int res = dao.insert(book);
		if(res > 0) {
			System.out.println(res + "건 입력 되었습니다.");
		} else {
			System.err.println("입력중 오류가 발생 하였습니다.");
			System.err.println("관리자에게 문의 해주세요");
		}
		
		return res;
	}

	public int delete(String noStr) {
		int res = dao.delete(noStr);
		if(res>0) {
			System.out.println(res+"건 삭제되었습니다.");
		} else {
			System.out.println("BookService : 삭제중 오류가 발생 하였습니다.");
			System.out.println("관리자에게 문의 해주세요");
		}
		
		return res;
	}

	public int rentBook(Book book) {
		int res = dao.rentBook(book);
		return res;
	}

	public int returnBook(Book book) {
		// 반납가능한 도서인지 확인
		
		int res = dao.returnBook(book);
		
		return res;
	}


	
}













