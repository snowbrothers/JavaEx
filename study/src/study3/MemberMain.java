package study3;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member("강백호", "Kang");
		
		System.out.println("당신의 이름은 " + member.name 
									+ " \n당신의 아이디는 :" + member.id);
	}

}
