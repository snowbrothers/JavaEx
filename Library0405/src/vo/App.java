package vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Dao;
import dao.FileDao;

public class App {

	private Dao dao = new FileDao();

	Scanner scan = new Scanner(System.in);

	List<Book> list;

	public static void main(String[] args) {

		// 라이브러리 생성
		// 생성만 하면 파일을 읽어와서 출력함.
		Library lib = new Library(); // 도서 목록 출력

		// 생성자 호출 메서드 사용하기 위해서. // app 을 생성하지 않고 메서드를 사용 할 수 없다.
		// main 메소드는 static메소드 정적메소드
		// 정적필드에서는 인스턴스 필드를 사용 할 수 없어
		// 생성하고 사용해야 한다.

		App app = new App();

		while (true) {

			// 자주 사용하는 로직은 메소드로 빼서 만들면 코드가 간결해집니다.
			// 스캐너 로 입력을 받아서 리턴 해주는 역할
			// 로그인
			// id 를 입력 받아서 admin 이면 관리자 아니면 사용자.

			System.out.println("id 를 입력해주세요.");

			String id = app.getString();

			if ("admin".equalsIgnoreCase(id)) {

				System.out.println("관리자 메뉴로 로그인합니다 .... ");
				System.out.println("관리자님 어서오세요!");

				
				app.adminMenu(lib);

			} else {

				System.out.println(id + "님 환영합니다!");

				app.memberMenu(lib);

			}

		}

		// admin - 책 등록, 책 삭제
		// user - 책 대여, 책반납

//		lib.insertBook(1, "편의점1", "김밥1", false);
//		lib.insertBook(2, "편의점2", "김밥2", false);
//		
//		System.out.println(lib);

		// 책 삭제
//		int no = 0;
		// lib.deleteBook(1);
//		System.out.println(lib.toString());
//		
//		// 책 대여
//		lib.rentBook(2);
//		System.out.println(lib.toString());
//		
		// lib.returnBook(1);

// ==============================================================================
//		FileDao dao = new FileDao();
//
//		List<Book> list = dao.getList();
//
//		for (Book book : list) {
//
//			System.out.println(book.toString());

	}

	public void adminMenu(Library lib) {

		int no = 0;
		
			// 관리자 반복 시작!
		while(true) {
			
			System.out.println("메뉴를 선택해주세요!");
			System.out.println("0. 로그아웃 | 1. 도서 등록 | 2. 도서 삭제 | q. 프로그램종료 ");
		
			
			int menu = getInt();
			
			
			switch (menu) {
			
			case 1:
				
				System.out.println("도서 등록 메뉴를 선택하셨습니다.");
				
				System.out.println("등록하실 도서의 일련번호를 입력해주세요!");
				no = getInt();
				System.out.println("등록하실 도서의 제목을 입력해주세요!");
				String title = getString();
				System.out.println("등록하실 도서의 작가를 입력해주세요!");
				String author = getString();
				
				lib.insertBook(no, title, author, false);
				
				break;
				
			case 2:
				
				System.out.println("도서 삭제 메뉴를 선택하셨습니다.");
				
				System.out.println("삭제하실 도서의 일련번호를 입력해주세요!");
				
				System.out.println(lib.toString());
				
				no = getInt();
				
				System.out.println("정말 삭제 하시겠습니까? : ");
				System.out.println("삭제 : y , 종료 : x");
				
				String str = scan.next();
				
				if (str.equalsIgnoreCase("y")) {
					
					lib.deleteBook(no);
					
					break;
					
				} else if (str.equalsIgnoreCase("x")) {
					
				}
				
			case 0:
				
				System.out.println("로그아웃 되었습니다.");
				return;
				
			default:
				System.err.println(menu + "는 존재하지 않는 메뉴 입니다.");
				
				break;
			}
		} //관리자 반복 끝

	}

	
	// 사용자 메뉴
	public void memberMenu(Library lib) {

		int no = 0;
		
		
		
		while(true) {
			
			
			System.out.println("================================");
			System.out.println("0. 로그아웃 | 1. 도서 대여 | 2. 도서 반납 | q. 프로그램종료 ");
			System.out.println();
			System.out.println("메뉴를 선택해주세요!");
			int menu = getInt();
			
			
			switch (menu) {
			case 1:
				
				System.out.println("도서 대여 메뉴를 선택하셨습니다.");
				System.out.println("대여하실 도서의 일련번호를 입력해주세요.");
				
				System.out.println(lib.toString());
				
				no = getInt();
				
				lib.rentBook(no);
				
				
				break;
				
			case 2:
				
				System.out.println("도서 반납 메뉴를 선택하셨습니다.");
				System.out.println("반납하실 도서의 일련번호를 입력해주세요.");
				
				System.out.println(lib.toString());
				
				no = getInt();
				
				lib.returnBook(no);
				System.out.println( lib.toString());
				
				
				break;
				
			case 0:
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				
				System.err.println(menu + "는 존재하지 않는 메뉴 입니다.");
				break;
			}
		}

	}

	/**
	 * 사용자로부터 입력받은 숫자를 반환한다. 문자가 입력되었을 경우 다시요청한다.
	 * 
	 * @return
	 */
	public int getInt() {

		int i = 0;

		while (true) {

			try {

				// 1. 사용자 입력 받기 // 사용자가 종료를 입력하는지 확인하기 위해 str 을 받는다.
				String str = scan.next();

				// 종료 확인
				if (str.equalsIgnoreCase("q")) {

					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}

				// 숫자로 변환
				i = Integer.parseInt(str);

				break;

			} catch (Exception e) {
				// 오류가 발생 시 다시 사용자 입력으로 .
				System.err.println("오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요");

			}
		}

		return i;
	}

	/**
	 * 
	 * 사용자로부터 입력받은 문자열을 반환합니다. 숫자가 입력될 경우 다시 요청 q, Q 입력 시 프로그램 종료
	 * 
	 * @return
	 */
	public String getString() {

		String str = " ";

		while (true) {

			try {

				str = scan.next();

				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);

				}
				// 숫자로 변환 시 숫자로 변경되면 문자로 입력해달라고 요청.
				Integer.parseInt(str);

				System.err.println("문자를 입력해주세요.");

			} catch (Exception e) {
				// 문자가 입력된 경우 반복문 탈출
				break;
			}

		}

		return str;
	}

}
