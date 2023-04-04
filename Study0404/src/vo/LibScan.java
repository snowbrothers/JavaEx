package vo;

import java.util.Scanner;

import dao.Dao;

public class LibScan {

	Scanner scan = new Scanner(System.in);

	private Dao dao;

	public static void main(String[] args) {

		
		
		LibScan lib = new LibScan();

		Library library = new Library();

		String id = " ";

		
		while(true) {
			
			System.out.println("도서관 프로그램을 실행 합니다.");
			
			
			// login
			
			System.out.println("id 를 입력해주세요 .");
			
			id = lib.getString();
			
			if ("admin".equalsIgnoreCase(id)) {
				
				System.out.println("관리자 권한으로 로그인 합니다.");
				
				lib.adminMenu(library);
				
				// 출력
				lib.toString();
				
			} else {
				
				System.out.println(id + " 님 어서오세요!");
				
				lib.memberMenu(library);
				
			}
		}


	}

	
	
	
	
	public void memberMenu(Library lib) {
		
		while(true) {
			
			System.out.println("================== 메뉴번호 를 입력해주세요 ==================");
			System.out.println("0. 로그아웃 | 1. 도서 대여 | 2. 도서 반납 | q. 프로그램 종료");
			
			
			int menu = 0;
			
			menu = getInt();
			
			switch (menu) {
			
			case 1:
				
				System.out.println("도서 대여 메뉴를 선택하셨습니다.");
				System.out.println("대여하실 도서의 일련번호를 입력해주세요.");
				
				lib.toString();
				
				int number = getInt();
				
				lib.rentBook(number);
				
				break;
				
				
			case 2:
				
				System.out.println("도서 반납 메뉴를 선택하셨습니다.");
				System.out.println("반납하실 도서의 일련번호를 입력해주세요.");
				
				number = getInt();
				
				lib.returnBook(number);
				
				
				break;
				
			case 0:
				
				
				return;
				
			}
		}
		
		
		
		
	}
	
	
	
	// 관리자, 일반 사용자 메뉴 세팅
	public void adminMenu(Library lib) {

		Book book = new Book();

		while (true) {

			System.out.println("============= 메뉴번호 를 입력해주세요 ===============");
			System.out.println("0. 로그아웃 | 1. 신규 도서추가 | 2. 기존 도서삭제 | q. 프로그램 종료");

			int menu = 0;

			menu = getInt();

			switch (menu) {

			case 1:

				lib.toString();

				System.out.println("신규 도서추가 메뉴를 선택하셨습니다.");

				System.out.println("일련번호를 입력해주세요.");
				int number = scan.nextInt();
				System.out.println("도서의 제목을 입력해주세요.");
				String title = scan.next();
				System.out.println("도서의 작가를 입력해주세요.");
				String author = scan.next();

				lib.insertBook(number, title, author, false);

				lib.toString();
				break;

			case 2:

				lib.toString();

				String str = " ";

				System.out.println("기존 도서삭제 메뉴를 선택하셨습니다.");

				System.out.println("삭제하고자 하는 도서의 일련번호를 입력해주세요.");

				number = scan.nextInt();

				for (Book bkk : lib.bookList) {

					if (bkk.getNumber() == number) {

						System.out.println(bkk.toString() + " 해당 도서를 정말 삭제하시겠습니까? ");

						System.out.println("삭제를 원하시면 y 를 입력, 취소는 x 를 입력해주세요.");

						str = scan.next();

						if ("y".equalsIgnoreCase(str)) {

							lib.deleteBook(number);
							break;

						} else if ("x".equalsIgnoreCase(str)) {

							break;
						}
					}

				}

				break;

				
			case 0:

				return;

			}
		}

	}

	// getInt , getString //

	public String getString() {

		String str = " ";

		while (true) {

			try {

				str = scan.next();

				break;

			} catch (Exception e) {

				System.err.println("입력도중 오류가 발생했습니다.");
				System.err.println("문자를 입력해주세요.");

			}
		}

		return str;
	}

	public int getInt() {

		int i = 0;

		while (true) {

			try {

				String str = scan.next();

				if ("q".equalsIgnoreCase(str)) {

					System.out.println("프로그램을 종료합니다.");
					System.exit(0);

				}

				i = Integer.parseInt(str);

				break;

			} catch (Exception e) {

				System.err.println("입력도중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요.");

			}
		}

		return i;
	}
}
