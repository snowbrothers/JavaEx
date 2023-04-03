package com.library.vo;

import java.util.Scanner;

public class Application {

	// 실행 클래스
	// 인스턴스멤버 => 생성 후 사용 가능
	// 레퍼런스 변수 명으로 사용 할 수 있다.

	public Scanner scan = new Scanner(System.in);

	// 메소드로 정의해 놓으면 코드가 간결해질 수 있음.

	public static void main(String[] args) {

		// 인스턴스멤버는 생성 후 사용이 가능합니다.

		Application app = new Application();
		// Book book = new Book(0, null, null, false);

		// 도서관 생성
		Library lib = new Library("file");

		// 로그인 처리

		while (true) {

			System.out.println("아이디를 입력해주세요.");
			String id = app.getString();

			if ("admin".equalsIgnoreCase(id)) {

				// 도서목록 출력
				// 메뉴 확인
				System.out.println("관리자님 어서오세요. ^_^");
				System.out.println("1. 도서등록 | 2. 도서삭제 | 0. 로그아웃 | q. 프로그램 종료");

				app.adminMenu(lib);

			} else {

				while (true) {

					app.memberMenu(lib);
					
					break;
				
				}

			}
		}

	}

	
	
	
	
	
	private void memberMenu(Library lib) {

		
		while (true) {

			// 메뉴확인
			System.out.println("==========================================");
			System.out.println("0. 로그아웃 | 1. 도서대여 | 2. 도서반납  |  q. 프로그램 종료");

			int menu = getInt();
			
			lib.info();

			if (menu == 1) {

				System.out.println("도서번호를 입력해주세요.");
				int index = getInt();
				lib.rentBook(index);
				lib.info();

			} else if (menu == 2) {

				// 정해지지 않은 인덱스 번호를 입력했을 경우 추가해야할 듯

				System.out.println("도서번호를 입력해주세요.");
				int index = getInt();
				lib.returnBook(index);
				lib.info();

			} else if (menu == 0) {

				return;

			} else {
				System.out.println("메뉴를 확인해주세요.");

			}

		}
	}

	private void adminMenu(Library lib) {

		while (true) {

			int menu = getInt();

			int no = 0;

			switch (menu) {

			case 1:
				System.out.println("일련번호를 입력해주세요.");
				no = getInt();
				System.out.println("제목을 입력해주세요");
				String title = getString();
				System.out.println("작가를 입력해주세요.");
				String author = getString();

				lib.insertBook(no, title, author, false);

				System.out.println("도서가 등록 되었습니다 : " + no + " / " + title + " / " + author + " / " + false);

				lib.info();

				break;

			case 2:
				// 도서 삭제
				System.out.println("삭제할 책의 일련번호를 입력해주세요.");
				no = getInt();
				lib.removeBook(no);

				lib.info();

				break;

			case 0:
				// 로그아웃

				return;

			default:
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
			}
		}

	}

	/**
	 * 
	 * 사용자로부터 숫자를 입력 받습니다.
	 * 
	 * @return
	 */
	public int getInt() {

		int i = 0;

		while (true) {

			try {

				String str = scan.next();

				if (str.equalsIgnoreCase("q")) {

					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}

				i = Integer.parseInt(str);

				break;

			} catch (Exception e) {

				System.err.println("입력중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요.");

			}
		}

		return i;

	}

	/**
	 * 
	 * 사용자로부터 문자열을 입력받습니다.
	 * 
	 * @return
	 */
	public String getString() {

		String res = " ";

		while (true) {

			try {

				res = scan.next();

				if (res.equalsIgnoreCase("q")) {

					System.out.println("프로그램을 종료합니다.");
					System.exit(0);

				}

				break;

			} catch (Exception e) {

				System.err.println("입력중 오류가 발생했습니다.");
				System.err.println("문자를 입력해주세요");

			}
		}

		return res;

	}

}
