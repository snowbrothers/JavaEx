package member.service;

public class MemberService3 {
	// 필드
	public String id;
	public String pw;
	
	// 메서드
	// 필드에 등록된 id 아이디가 일치하면 return 값으로 true 를 반환
	
	
	public MemberService3(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	/**
	 * 로그인 처리 
	 * @param id
	 * @param pw
	 * @return 로그인성공 : true, 로그인 실패 : false
	 */	
		
	public boolean login(String id , String pw) {
		this.id = id; this.pw = pw;
		
		if(id!=null // id 가 null 이 아니고
				&& "hong".equals(this.id) // id가 필드의 id 값과 동일하고
				&& pw!= null // pw 가 null 이 아니고
				&& "12345".equals(this.pw)) { // pw가 필드의 pw값과 동일하고
	
			System.out.println("로그인 성공");
			return true;
		}
		
		System.out.println("로그인 실패");
		return false;
		
		}
	
	public void logout() {
		// 동일한 이름의 지역변수가 없기 때문에
		// id는 필드를 의미합니다. 별표 다섯개
		System.out.println(id + "님 로그아웃 되었습니다.");
	}
	
}
