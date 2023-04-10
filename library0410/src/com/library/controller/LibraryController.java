package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;

/**
 * 1. 사용자의 요청을 입력 받습니다.
 * 2. 요청에 맞는 서비스 호출
 * 
 * @author user
 *
 */
public class LibraryController {

	BookService bookService = new BookService();
	MemberService memberService = new MemberService();

	public void start() {
		
		System.out.println("===================");
		System.out.println("도서관에 오신걸 환영합니다.");
		System.out.println("===================");

		while(true) {
			
			// 로그인 요청
			MemberVo memberVo = login();
			
			// 도서 정보 출력
			bookService.getList();
			
			if ("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
				// 관리자 계쩡
				adminMenu();
				
			} else {
				
				userMenu();
			}
		}

	}

	public void adminMenu() {
		
		outter:
		while(true) {
			
			System.out.println("관리자 메뉴 =========================================================");
			System.out.println("1. 도서등록 | 2. 도서삭제 | 3. 계정등록 | 4. 계정삭제 | 0. 이전메뉴 | q.  종료");
			System.out.println("메뉴를 선택 해주세요====================================================");
			
			int menu = getInt();
			
			
			int bookNo =0;
			String id = "";
			
			switch (menu) {
			
			case 1:
				// 도서 등록
				
				System.out.println("등록하실 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				System.out.println("등록하실 도서의 제목을 입력해주세요.");
				String title = getString();
				System.out.println("등록하실 도서의 작가를 입력해주세요.");
				String author = getString();
				
				
				int res = bookService.insertBook(new BookVo(bookNo, title, author, "N"));
				
				System.out.println(res + "건 등록되었습니다.");
				
				break;
				
			case 2:
				
				// 도서 삭제 일련번호
				System.out.println("삭제하실 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				
				res = bookService.deleteBook(bookNo);
				
				System.out.println(res + "건 삭제 되었습니다.");
				
				
				break;
				
			case 3:
				
				System.out.println("사용자 등록을 실행합니다.");
				System.out.println("아이디를 입력해주세요.");
				id = getString();
				
				System.out.println("비밀번호를 입력해주세요.");
				String pw = getString();
				System.out.println("이름을 입력해주세요.");
				String name = getString();
				System.out.println("관리자 계정은 Y 를 입력해주세요");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("Y") ? "Y" : "N";
				
				res = memberService.insertMember(new MemberVo(id, pw, name, adminYN));
				
				
				
				
				

				
				break;
				
			case 4:
				
				System.out.println("계정 삭제를 진행합니다.");
				System.out.println("삭제하실 계정 아이디를 입력해주세요");
				id = getString();
				
				res = memberService.deleteMember(id);
				
				
				break;
				
			case 0:
				
				break outter;
				
			default:
				
				System.err.println("메뉴를 확인 후 다시 입력해주세요.");
				
				break;
			}
		}

	}

	public void userMenu() {
		
		
		while(true) {
			
			System.out.println("사용자 메뉴 ====================================");
			System.out.println("1. 도서대여 | 2. 도서반납 | 0. 이전메뉴 | q. 종료 ");
			System.out.println("메뉴를 선택 해주세요===============================");
			
			int bookNo = 0;
			int menu = getInt();
			
			switch (menu) {
			
			case 1:
				
				System.out.println("도서 대여 메뉴를 실행합니다.");
				System.out.println("대여하실 도서의 일련번호를 입력해주세요.");
				
				bookNo = getInt();
				
				bookService.rentBook(bookNo);
				
				break;
				
			case 2:
				
				System.out.println("도서 반납 메뉴를 실행합니다.");
				System.out.println("반납하실 도서의 일련번호를 입력해주세요.");
				
				bookNo = getInt();
				
				bookService.returnBook(bookNo);
				
				break;
				
			case 0:
				
				return;
				
			default:
				System.out.println("메뉴를 확인 후 다시 선택 해주세요.");
				
				break;
			}
		}
		
	}

	/**
	 * 로그인 ID / PW 를 입력 받아서 사용자 정보를 조회 해옵니다. 로그인 성공 까지 반복
	 * 
	 * @return
	 */
	public MemberVo login() {

		while (true) {

			System.out.println("아이디 를 입력해주세요.");
			// 로그인 요청
			String id = getString();
			// 로그인 요청
			System.out.println("패스워드 를 입력해주세요.");
			String pw = getString();

			MemberVo memberVo = memberService.login(id, pw);
			if (memberVo != null) {

				return memberVo;
			}

		}

	}

	/// 생성하지 않고 사용
	public static Scanner scan = new Scanner(System.in);

	public static int getInt() {

		int i = 0;

		while (true) {

			try {

				String str = scan.next();
				if (str.equalsIgnoreCase("q")) {
					System.exit(0);
				}

				i = Integer.parseInt(str);

				return i;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.err.println("숫자 입력중 오류가 발생 했습니다.");

			}
		}

	}

	public static String getString() {

		String str = " ";

		str = scan.next();

		if (str.equalsIgnoreCase("q")) {

			System.exit(0);

		}

		return str;

	}

}
