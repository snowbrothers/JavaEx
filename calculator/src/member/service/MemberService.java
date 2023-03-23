package member.service;

public class MemberService {
	
	 String id;
	 String password;
	
	 public MemberService(String id, String password) {
			this.id = id;
			this.password = password;
			
			
			
		}

			
	public boolean login(String id, String password) {
			// id 에 null 이 들어올 경우 nullpointException 이 발생할 우려가 있다
			// null 이 아닌 경우 로직 실행  or "hong"(문자열).equals 사용
		
			
		if(this.id.equals(id)
				&& this.id.equals(password)) {
			System.out.println("로그인 되었습니다.");
			return true;
		} else {
			
			System.out.println("누구십니까");
			return false;
		}
			}
			
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

/*	public static void main(String[] args) {
	MemberService mem = new MemberService();
	
	mem.login("hong", "12345");
	mem.logout(null); */
	
	}


	 
