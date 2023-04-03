package vo;

import java.util.Scanner;

public class Application {


	public Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		// 로그인 
		
		Application app = new Application();
		Library lib = new Library("");
		
	while(true) {
		
	
		System.out.println("로그인 을 진행합니다.\n");
		System.out.print("id 를 입력해주세요.");
		
		String id = app.getString();
		
		if("admin".equalsIgnoreCase(id)) {
			System.out.println("관리자 메뉴로 접속합니다...");
			app.adminMenu(lib);
			
		} else {
			
			app.memberMenu(lib);
		}
		
		
		
	}	
		
		
	}
	
	
	public void adminMenu(Library lib) {
		
		

		while(true) {
			
			
			
			System.out.println("==================================");
			
			System.out.println("0. 로그아웃 | 1. 도서 추가 | 2. 도서 삭제 | q. 프로그램 종료");
			
			
			int menu = getInt();
			
			int no = 0;
			
			lib.info();
			
			switch (menu) {
			
			case 1:
				
				System.out.println("추가하실 도서의 일련번호를 입력해주세요.");
				no = getInt();
				System.out.println("도서의 제목을 입력해주세요.");
				String title = getString();
				System.out.println("도서의 작가를 입력해주세요.");
				String author = getString();
				
				lib.insertBook(no, title, author, false);
				
				System.out.println("도서가 등록 되었습니다 : " 
						+ no + " / " 
						+ title + " / " 
						+ author + " / " + false);
				
				lib.info();
				
				break;
				
				
			case 2: 
				
				System.out.println("삭제하실 도서의 일련번호를 입력해주세요.");
				no = getInt();
				lib.deleteBook(no);
				
				System.out.println("도서가 삭제되었습니다.");
				
				lib.info();
				
				break;
				
			case 0:
				
				return;
				
			default:
				
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
				
			}
		}
	
		
	
	}
	
	public void memberMenu(Library lib) {
		
		while(true) {
			
			System.out.println("==================================");
			System.out.println("0. 로그아웃 | 1. 도서 대여 | 2. 도서 반납 | q. 프로그램 종료");
			
			
			int menu = getInt();
			
			// 도서 정보 출력
			lib.info();
			
			if(menu == 1) {
				
				System.out.println("도서번호를 입력해주세요.");
				int index = getInt();
				lib.rentBook(index);
				
				lib.info();
				
			} else if (menu == 2) {
				
				System.out.println("반납하실 도서 번호를 입력해주세요.");
				int index = getInt();
				lib.returnBook(index);
				lib.info();
				
			} else if(menu == 0) {
				
				
				return; 
				
			} else {
				
				System.out.println("메뉴를 확인해주세요.");
			}
		}
		
		
	}
	
	public int getInt() {
		
		int i = 0;
		while(true) {
			
			try {
				
				String str = scan.next();
				
				if(str.equalsIgnoreCase("q")) {
					
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				
				
				i = Integer.parseInt(str);
				
				break;
				
			} catch (Exception e) {
				
				System.err.println("입력 중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요. ");
				
			}
		
		}
		
		
		return i;
	}
	
	
	
	public String getString() {
		
		String res = " "; 
		
		
		while(true) {
			
			try {
				
				res = scan.next();
				
				if(res.equalsIgnoreCase("q")) {
					
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				
				}
				
				break;
			} catch (Exception e) {

				System.out.println("입력중 오류가 발생했습니다.");
				System.out.println("문자를 입력해주세요.");
			}
		}
		
		
		return res;
	}
	
	
	
}
