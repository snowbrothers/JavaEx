package com.library.vo;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;

// 리스트를 생성
public class Library {

	// 책의 목록을 필드로 가짐
	List<Book> list = null;
	
	// 인터페이스를 타입으로 선언
	// DbDao 까지 활용 할 경우 .
	
	Dao dao = new FileDao();
	

	public Library() {
		
		
		list = dao.getList();
		
		System.out.println(toString());
		
		
	}
	
	/**
	 * 
	 * 책을 생성한후 리스트에 저장, 리스트를 파일로 출력한다.
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	// 책 등록
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		// 1. 책을 생성한다
		
		Book book = new Book(no, title, author, isRent);
		
		// 2. 리스트에 등록한다
		
		list.add(book);
		
		boolean res = dao.listToFile(list);
		
		// 3. 리스트를 파일로 출력한다
		
		if(res) {
			
			System.out.println("책이 등록 되었습니다.");
			return true;
		}else {
			
			list.remove(book);
			System.out.println("책이 등록되지 않았습니다. \n 관리자에게 문의 해주세요.");
		}
		
	 
		
		return res;
	}
	
	
	// 책삭제
	public boolean deleteBook(int no) {
		
		// 리스트를 순회한다.
		for(Book book : list) {
			
			
			if(book.getNumber() == no) {
				
				list.remove(book);
			
			boolean res = dao.listToFile(list);
				
			if(res == false) {
				
				list.add(book);
				System.out.println("파일 출력도중 오류가 발생 하였습니다. \n Library.deletBook");
				return false;
			
			}
			
			System.out.println("정상적으로 삭제 되었습니다.");
			System.out.println(toString());
			
			return true;
			
			}
		
			
		}
		
		System.out.println("입력하신 일련번호에 해당하는 도서를 찾을 수 없습니다.");
		return false;
	}
	
	// 책 대여
	
	public boolean rentBook(int no) {
		
		
		// 리스트를 순회하며 입력한 일련번호와 일치하는 책의 정보를 업데이트 하고 리스트에 담아 
		// 파일로 출력하도록 작성한다.
		try {
			
			for(Book book : list) {
				
				if(book.getNumber() == no) {
				
					
					// true 라면
					if(book.isRent()) {
						
						book.setRent(true);
					
						dao.listToFile(list);
						boolean res = dao.listToFile(list);
						
						if(!res) {
							book.setRent(false);
							System.out.println("파일로 출력 하는데 실패 했습니다.");
					
						}
					}
					
					
					System.out.println("도서가 대여처리 되었습니다.");
					System.out.println(toString());
					return true;
				}
			}
			
			return false;
		
		} catch (Exception e) {
			System.out.println("대여 도중 오류가 발생 하였습니다. \n");
			System.out.println(e.getMessage());
		}
		
		System.out.println("일련번호를 찾을 수 없습니다.");
		return false;
		
	}
	
	// 책 반납



	@Override
	public String toString() {
		
		System.out.println("책 목록 출력 ============== ");
		
		String info = " ";
		
		for(Book book : list) {
			
			info += book.info() + "\n";
		
		}
		
		
		return info;
	}
	
	
	// 실험
	public static void main(String[] args) {
		
		
		Book book = new Book();
		
		System.out.println(book.isRent());
	}

}
