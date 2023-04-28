package com.library.service;

import com.library.dao.RentDao;

public class RentService {

	
	RentDao dao = new RentDao();
	
	public String  getRentYN(int no){
		
		
		
		String rentYN = dao.getRentYN(no);
		
		return rentYN;
		
		
	}
	
	
	public void rentBook(int no, String id) {
		
		// 대여 가능 여부 체크
		String rentYN = dao.getRentYN(no);
		
		if("Y".equals(rentYN)) {
			System.out.println("이미 대여 중인 도서 입니다.");
			return;
		}
	
		int res = dao.insert(id, no);
	
		if(res > 0 ) {
			
			System.out.println(res + "건 대여되었습니다.");
		} else {
			
			System.out.println("대여 도중 오류가 발생하였습니다.");
		}
		
	}
	
	
	/**
	 * 대여가능 여부 체크
	 * 
	 */
	public void returnBook(int no) {
	
		String rentYN = dao.getRentYN(no);
		
		if("N".equals(rentYN)) {
			
			System.out.println("반납 가능한 도서가 아닙니다.");
			return;
		}
	
		int res = dao.update(no);
	
		if(res > 0 ) {
			
			System.out.println(res + "건 반납되었습니다.");
		} else {
			
			System.err.println("반납 도중 오류가 발생하였습니다.");
		
		
	}
	
	
}
}
