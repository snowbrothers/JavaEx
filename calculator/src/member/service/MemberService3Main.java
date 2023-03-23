package member.service;

import java.util.Scanner;

public class MemberService3Main {

	public static void main(String[] args) {
		
		MemberService3 member = new MemberService3("hong", "12345");
		Scanner scan = new Scanner(System.in);
		
		System.out.println(member.id);
		System.out.println(member.pw);

		while(true) {
		
			System.out.println(" ===================== ");
		
		System.out.println("id를 입력해주세요.");
		String id = scan.next();
		
		System.out.println("pw를 입력해주세요.");
		String pw = scan.next();
		
		boolean res = member.login(id, pw);
		
			
			if(res) {
				System.out.println("민초단에 오신 것을 환영합니다.");
				break;
			} else {
				System.out.println("민초단이 아닙니다.");
			}
			
		}
		
		System.out.println("로그아웃 하시려면 q를 입력해주세요");
		String exit = scan.next();
		if("q".equals(exit)) {
			System.out.println("로그아웃 되었습니다.");
			System.exit(0);
		}
		scan.close();
		member.logout();
	} 

}
