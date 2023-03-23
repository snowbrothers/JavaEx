package member.service;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i=0;
		while(true) {
		
			System.out.println("아이디를 입력해주세요");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요");
			String pw = scan.next();
			
			
			boolean res = 
			/* MemberService service = new MemberService();
			boolean res = service.login("hong", "12345");
			if(res) {
				System.out.println(" 민초단 화이팅");
				
			} else {
				System.out.println("누구십니까");
			}
			
			service.logout("hong"); */
	}

}
