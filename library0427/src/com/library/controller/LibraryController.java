package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
import com.library.vo.Member;

/**
 * 도서대여 시스템 도서 대여 및 이력 관리
 * 
 * ▶ 사용자로부터 입력을 받아서 사용자요청에 알맞는 서비스 로직 호출. ▶ 로그인 - 관리자 메뉴 : 도서등록, 도서삭제, 사용자등록,
 * 사용자삭제, 도서대여조회 - 사용자 메뉴 : 도서대여, 도서반납, 도서대여현황 -
 * 
 * @author user
 *
 */
public class LibraryController {

	Scanner scan = new Scanner(System.in);
	
	// 서비스 멤버로 등록 한다
	MemberService memService = new MemberService();
	BookService bookService = new BookService();
	RentService rentSerivce = new RentService();
	/**
	 * 
	 * 어떤 메뉴를 실행 할 지 안내해주는 메서드 프로그램 시작
	 */
	public void library() {

		System.out.println("==================================");
		System.out.println("도서관리 시스템 v1.0");
		System.out.println("==================================");

		while (true) {

			Member member = login();

			if ("Y".equals(member.getAdminYN())) {

				// 관리자 메뉴 실행
				System.out.println("관리자 권한으로 접속합니다.");
				
				adminMenu();

			} else {
				// 사용자 메뉴 실행
			
				userMenu(member.getId());
			}

		}

	}

	public Member login() {

		// 로그인
		while (true) {

			System.out.println("- 로그인 - ");
			System.out.println("아이디를 입력해주세요.");
			String str = getString();
			System.out.println("비밀번호를 입력해주세요.");
			String pw = getString();

			Member member = memService.login(str, pw);

			// 로그인 성공 - member 객체를 반환
			if (member != null) {

				// 리턴문을 만나면 메서드 종료.
				return member;

			}
		}

	}

	
	
	/**
	 * 관리자 메뉴
	 * 
	 */
	public void adminMenu() {
		
		while(true) {
			
		// 도서목록 출력
		bookService.getList();
		
		System.out.println("=====================================================================");
		System.out.println("1. 도서등록 | 2. 도서삭제 | 3. 사용자등록 | 4. 사용자삭제 | 0. 로그아웃  | Q. 종료");
		System.out.println("=====================================================================");

		System.out.println();
		System.out.println("메뉴를 선택해주세요.");
		
		
		int menu = getInt();

		switch (menu) {

		case 1:
			
			// 도서등록
			// 사용자로 부터 입력 받기 - 도서명, 작가명
			// Controller -> service -> dao -> 데이터 처리

			System.out.println("도서명 을 입력해주세요.");
			String title = getString();
			
			System.out.println("작가를 입력해주세요");
			String author = getString();
			
			bookService.insertBook(title, author);
			
			break;

		case 2:
			
			System.out.println("삭제할 도서의 일련번호를 입력해주세요");
			int no = getInt();
			
			bookService.deleteBook(no);
			
			break;
		case 3:
			
			System.out.println("아이디를 입력해주세요");
			String id = getString();
			
			System.out.println("비밀번호를 입력해주세요");
			String pw = getString();
			
			System.out.println("이름을 입력해주세요");
			String name = getString();
			
			System.out.println("권한을 입력해주세요 | Y,N");
			String adminYN = getString();
			
			System.out.println("대여가능 여부를 입력해주세요 | Y,N");
			String status = getString();
			
			System.out.println("등급을 입력해주세요");
			String grade = getString();
			
			memService.insertMember(id, pw, name, adminYN, status, grade);
			
			
			break;
		
		case 4:
			
			System.out.println("삭제 할 계정의 id를 입력해주세요");
			id = getString();
			
			memService.deleteMember(id);
			
			
			break;
		case 0:
			
			return;
		
		default:
			System.out.println("메뉴 확인 후 다시 입력해주세요.");
			break;
		}

		}
	}

	/**
	 * 
	 * 
	 */
	private void userMenu(String id) {

		while(true) {
			
		
		
		bookService.getList();
		System.out.println(" 사용자메뉴 =========================================");
		System.out.println("1. 도서대여 | 2. 도서반납 | 0. 로그아웃 | Q. 종료 ");
		System.out.println("==================================================");

		
		
		int menu = getInt();
		
		
		switch (menu) {
		
		
		case 1:
			
			System.out.println("대여하실 도서의 일련번호를 입력해주세요.");
			int no = getInt();
			
			rentSerivce.rentBook(no, id);
			System.out.println("도서가 대여되었습니다.");
		
			break;
		
		case 2:
			
			System.out.println("반납하실 도서의 일련번호를 입력해주세요.");
			no = getInt();
			String N = "N";
			rentSerivce.returnBook(no);
			System.out.println("도서가 반납되었습니다.");
			
			break;
			
		case 0:
			
			return ;
			
		
		default:
			break;
		}
		}
		
	}

	// 문자 입력 메서드
	// 숫자 입력 메서드

	/**
	 * 
	 * 사용자의 입력을 받아 문자열을 반환 한다 문자가 입력 될 때까지 반복한다. Q,q 입력되면 종료
	 * 
	 * @return
	 */

	private String getString() {

		String str = " ";

		while (true) {

			try {

				str = scan.next();

				if (str.equalsIgnoreCase("q")) {

					System.out.println("프로그램 종료");
					System.exit(0);
				}

				break;

			} catch (Exception e) {
				System.err.println("문자를 입력 해주세요");
				System.err.println(e.getMessage());
			}

		}

		return str;
	}

	/**
	 * 
	 * 사용자의 입력을 받아 숫자을 반환 한다 숫자가 입력 될 때까지 반복한다. Q,q 입력 되면 종료
	 * 
	 * @return
	 */
	private int getInt() {

		int i = 0;

		while (true) {

			try {

				i = scan.nextInt();

				return i;

			} catch (Exception e) {
				String str = scan.next();

				// q 를 입력 시 정상 종료
				if (str.equals("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);

				}
				System.out.println(str + "은 입력 불가능 합니다.");
				System.out.println("숫자를 입력해주세요");
			}

		}

		// return i;
	}

}
