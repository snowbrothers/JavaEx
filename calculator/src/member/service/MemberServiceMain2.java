package member.service;

public class MemberServiceMain2 {

	public static void main(String[] args) {
		
	MemberService2 member	= new MemberService2("hon", "12345");
	
	if("hong".equals(member.id) 
			&& "12345".equals(member.password)) {
		System.out.println("어서오세요 ");
	} else {
		System.out.println("민초단 화이팅");
	}
	
	
	System.out.println("메서드 실행");
	
	MemberService member1 = new MemberService();
	member1.login("hong", "12345");
	member1.logout(null);
	
	}

}
