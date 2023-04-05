package vo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import dao.Dao;
import dao.FileDao;

public class Library {

	// 책 목록을 전역변수로 가지고 있음
	// 전역변수(필드) 로 선언 시 클래스 내부에서 자유롭게 이용이 가능하다
	List<Book> list = null;

	// 인터페이스를 타입으로 선언 = > 인터페이스의 구현체를 이용해 생성한다.
	Dao dao = new FileDao();

	// 생성자 : 클래스명과 같은 이름, 반환타입이 없다.
	public Library() {

		// 반환타입 확인하고 변수에 담을것, getList 의 반환 타입은 list
		list = dao.getList();
		// 리스트를 초기화 // 필드를 초기화

		System.out.println(toString());

	}

	// 책의 정보를 받아서
	// 리스트에 등록 후 파일로 출력합니다.
	public boolean insertBook(int no, String title, String author, boolean isRent) {

		// 1 책을 생성

		// 2 리스트에 등록

		// 3 리스트를 파일로 출력

		
		// 0. 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNumber() == no) {
				System.err.println("일련번호가 중복되었습니다. \n 다시 입력해주세요.");
			
				return false;
				
			}
				
		}


		Book book = new Book(no, title, author, false);

		list.add(book);

		boolean res = dao.listToFile(list);

		if (res) {

			System.out.println("책이 등록 되었습니다.");
			System.out.println( toString());
			return true;

		} else {

			// 4/ 파일에 정상적으로 등록이 되지 않은 경우
			// 리스트에서 제거

			list.remove(book);
			System.out.println("책이 등록되지 않았습니다. \n 관리자에게 문의 해주세요.");

		}

		// TODO Auto-generated catch block

		return res;
	}

	@Override
	public String toString() {

		System.out.println("책 목록 ================== lib");
		String info = "";
		
		
		// 정렬
		Collections.sort(list);
		
		for (Book book : list) {

			info += book.info() + "\n";
		}

		return info;
	}

	/**
	 * 책의 일련번호를 입력받아서 리스트에서 삭제합니다. 리스트를 파일로 출력합니다.
	 * 
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {

		// 리스트 전체를 확인
		for (Book book : list) {

			if (book.getNumber() == no) {

				list.remove(book);

				boolean res = dao.listToFile(list);

				if (!res) {

					// 파일로 출력이 실패할 경우 책을 다시 리스트에 추가합니다
					list.add(book);
					System.err.println("파일 출력도중 오류가 발생 하였습니다. \n Library.deletBook()");
					return false;

				}
				System.out.println("정상적으로 삭제 되었습니다.");
				System.out.println(toString());
				return true;

			}
		}

		System.err.println("입력하신 일련번호에 해당하는 도서를 찾을 수 없습니다.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 책을 찾는다. 책을 찾아서 책의 상태가 렌트가 가능한 상태이면 대여 렌트가 가능한 상태가 아니라면 메세지 처리 리스트를
	 * 파일로 출력
	 * 
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {

		try {

			for (Book book : list) {
				// 일련번호에 해당하는 책을 찾는다.
				if (book.getNumber() == no) {

					if (!book.isRent()) {

						// 대여중 으로 변경
						book.setRent(true);
						// 파일로 출력
						dao.listToFile(list);
						boolean res = dao.listToFile(list);
						
						
						if (!res) {
							book.setRent(false);
							System.out.println("파일로 출력 하는데 실패 했습니다.");

						}

						System.out.println("도서가 대여 처리 되었습니다.");
						System.out.println(toString());
						return true;

					}

				}
			}
			return false;

		} catch (Exception e) {
			System.out.println("대여 도중 오류가 발생하였습니다. \n");
			System.out.println(e.getMessage());
		}

		System.err.println("일련번호를 찾을 수 없습니다.");
		return false;
	}

	
	
	/**
	 * 일련번호에 해당하는 도서를 찾는다. 도서가 대여중이라면 반납처리 아니면 (반납가능한 도서가 아닙니다 ) 메세지 처리
	 * 
	 * @param no
	 * @return
	 */
	public boolean returnBook(int no) {

		for (Book book : list) {

			if (book.getNumber() == no) {

				if (book.isRent()) {

					book.setRent(false);

					dao.listToFile(list);
					System.out.println("도서가 반납되었습니다.");
					return true;
					
				} else {

					System.err.println("반납 가능한 도서가 아닙니다.");
				}

			}

		}

		System.err.println("일련번호에 해당하는 책이 존재하지 않습니다.");
		return false;
	}
}
