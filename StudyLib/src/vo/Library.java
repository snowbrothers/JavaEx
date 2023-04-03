package vo;

import java.util.ArrayList;
import java.util.List;

import Dao.Dao;
import Dao.DatabaseDao;
import Dao.FileDao;

public class Library {

	
	
	private List<Book> bookList = new ArrayList<>();

	// 라이브러리가 가지고 있는 메소드를 전부 사용 할 것이기 때문에 필드로 생성
	// 데이터의 입출력
	private Dao dao = null;
	
	public Library(String confDao) {
		
		if("db".equals(confDao)) {
			
			this.dao = new DatabaseDao();
		} else {
			
			this.dao = new FileDao();
		}
		
		// 책의 리스트를 조회 ( 파일 또는 DB 를 이용해서 조회 ) 
		// 책을 생성해서 List 에 담아 준다.
		
		// 데이터베이스를 이용할 경우 번호를 기본 Ket 로 사용 시
		// 중복된 번호는 입력이 안되므로 오류 발생한다.
		
		bookList.add(new Book(1, "책1", "작가1", false));
		bookList.add(new Book(2, "책2", "작가2", false));
		bookList.add(new Book(3, "책3", "작가3", false));
		bookList.add(new Book(4, "책4", "작가4", false));
		
		
	}

	
	
	
	
	/**
	 * 관리자 : 신규 도서 추가 메소드
	 * 
	 * @param number
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int number, String title, String author, boolean isRent) {
		
		Book book = new Book(number, title, author, isRent);
		
		bookList.add(book);
		dao.inserBook(book);
		
		
		
		
		return true;
		
		
	}
	
	
	/**
	 * 관리자 : 도서 삭제 메소드
	 * 
	 * @param index
	 * @return
	 */
	public boolean deleteBook(int index) {
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				System.out.println("도서가 삭제되었습니다 : " + book.info());
			
				dao.deleteBook(book);
				return	bookList.remove(book);
				
			}
			
		}
		
		System.err.println("일련번호를 찾을 수 없습니다.");
		return false;
	}
	
	
	public boolean rentBook(int index) {
		
		for(Book book : bookList) {
			
			
			if(book.getNumber() == index) {
				
				
				if(book.isRent()) {
					System.out.println("이미 대여중인 도서 입니다.");
				}
				
				book.setRent(true);
				dao.updatBook(book);
				System.out.println("도서가 대여되었습니다 : " + book.info());
				return true;
				
			}
		}
		
		// for 문 바깥에 존재, 유효한 인덱스를 입력하지 않을 시 반복문이 중지되어 에러발생
		System.err.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
		
	}
	
	
	/**
	 * 
	 * 
	 * @param index
	 * @return
	 */
	public boolean returnBook(int index) {
		
		for(Book book : bookList) {
			
			if(book.getNumber() == index) {
				
				book.setRent(false);
				dao.updatBook(book);
				System.out.println("도서가 반납되었습니다 : " + book.info());
				
				return true;
			}
		} 
		
		System.out.println("입력하신 일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	
	
	/**
	 * 도서 정보 출력 메소드
	 * 
	 */
	public void info() {

		System.out.println("====== 도서정보 출력 ======");
		
		for(Book book : bookList) {
			
			System.out.println(book.info());
			
		}
		
		
	}
	
	
	
	
}
