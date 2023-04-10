package libraryControll;

import java.util.Scanner;

import service.BookService;
import service.MemberService;
import vo.BookVo;
import vo.MemberVo;

public class LibraryController {

	static Scanner scan = new Scanner(System.in);
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();

	/**
	 * 프로그램 실행
	 */
	public void start() {

		System.out.println("===================");
		System.out.println("도서관에 오신걸 환영합니다.");
		System.out.println("===================");

		while (true) {

			MemberVo memberVo = login();
			// 로그인

			if ("Y".equalsIgnoreCase(memberVo.getAdminYN())) {

				adminMenu();

			} else {

				userMenu();

			}

		}

	}

	public MemberVo login() {

		while (true) {

			System.out.println("아이디를 입력해주세요");
			String id = getString();
			System.out.println("비밀번호를 입력해주세요");
			String pw = getString();

			// 확인 할 것

			MemberVo memberVo = memberService.login(id, pw);

			if (memberVo != null) {

				return memberVo;
			}
		}

	}

	public void printTitle(String title) {

	}

	public void userMenu() {

		while (true) {

			System.out.println("사용자 메뉴 =========================================");
			System.out.println("1. 도서대여 | 2. 도서반납 | 0. 이전메뉴 | q. 종료");
			System.out.println("메뉴를 선택하세요 =========================================");

			int menu = getInt();

			switch (menu) {

			case 1:

				System.out.println("도서대여 메뉴를 선택하셨습니다.");
				System.out.println("대여하실 도서의 일련번호를 입력해주세요.");
				
				bookService.getList();
				
				int bookNo = getInt();

				bookService.rentBook(bookNo);

				
				break;

			case 2:

				System.out.println("도서반납 메뉴를 선택하셨습니다.");
				System.out.println("반납하실 도서의 일련번호를 입력해주세요.");

				bookService.getList();
				
				bookNo = getInt();

				bookService.returnBook(bookNo);

				break;

			case 0:

				return;

			default:
				System.out.println("잘못된 입력 입니다.");
				System.out.println("메뉴의 번호를 확인 해주세요.");
				break;
			}

		}

	}

	public void adminMenu() {

		while (true) {

			System.out.println("관리자 메뉴 ========================================================");
			System.out.println("1. 도서등록 | 2. 도서 삭제 | 3. 계정추가 | 4. 계정삭제 | 0. 로그아웃 | q. 종료");
			System.out.println("메뉴를 선택해주세요 ===================================================");

			int menu = getInt();
			int bookNo = 0;
			int res = 0;
			switch (menu) {
			case 1:

				System.out.println("도서 등록 메뉴를 선택하셨습니다.");
				System.out.println("등록하실 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				System.out.println("등록하실 도서의 제목을 입력해주세요.");
				String title = getString();
				System.out.println("등록하실 도서의 작가를 입력해주세요.");
				String author = getString();

				res = bookService.inserBook(new BookVo(bookNo, title, author, "N"));

				System.out.println();

				break;

			case 2:

				System.out.println("도서 삭제 메뉴를 선택 하셨습니다.");
				System.out.println("삭제하실 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();

				res = bookService.deleteBook(bookNo);

				break;

			case 3:
				System.out.println("계정추가 메뉴를 선택하셨습니다.");
				System.out.println("추가하실 계정의 ID 를 입력해주세요.");
				String id = getString();
				System.out.println("PW 를 입력해주세요.");
				String pw = getString();
				System.out.println("이름을 입력해주세요.");
				String name = getString();
				System.out.println("관리자 계정으로 추가하실 경우 Y를 입력해주세요.");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("Y") ? "Y" : "N";

				res = memberService.insertMember(new MemberVo(id, pw, name, adminYN));

				break;

			case 4:

				break;

			case 0:

				return;
			default:
				System.out.println("잘못된 입력 입니다. ");
				System.out.println("메뉴를 확인 해주세요.");

				break;
			}
		}

	}

	/**
	 * 매개변수는 없음 접근이 용이하도록 static 선언
	 * 
	 * @return
	 */
	public static int getInt() {

		int i = 0;

		String str = "";

		while (true) {

			try {

				str = scan.next();

				if (str.equalsIgnoreCase("q")) {
					System.exit(0);
				}

				i = Integer.parseInt(str);

				return i;

			} catch (Exception e) {

				System.err.println("숫자를 입력해주세요.");
				System.out.println(e.getMessage());
			}
		}

	}

	public static String getString() {

		String str = "";

		while (true) {

			try {

				str = scan.next();

				if (str.equalsIgnoreCase("q")) {
					System.exit(0);
				}

				return str;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
