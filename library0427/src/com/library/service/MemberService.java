package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {

	MemberDao dao = new MemberDao();

	public Member login(String id, String pw) {

		Member member = null;

		member = dao.login(id, pw);

		if (member == null) {

			System.err.println("아이디/비밀번호를 확인해주세요.");

		} else {

			System.out.println(member.getName() + "님 환영합니다.");
		}

		return member;

	}
	
	
	public void idCheck(String id ) {
		
		Boolean check = dao.idCheck(id);
		
		if(check) {
			
			System.out.println("아이디 생성 가능");
		} else {
			
			System.out.println("아이디가 중복 되었습니다.");
		}
		
	}
	
	
	
	
	public void insertMember(String id, String pw, String name, String adminYN
													, String status, String grade) {
				
		
		
		
			
			System.out.println("아이디 생성가능");
			
			Member member = new Member(id, pw, name, adminYN, status, grade);
			
			int res = dao.insertMember(member);
			
			if(res > 0 ) {
				
				System.out.println(res + "건 등록되었습니다.");

				
			}			
			
	
			
		
		
	}

	
	
	public void deleteMember(String id) {
		
		int res = dao.deleteMember(id);
		
		if(res > 0 ) {
			
			System.out.println(res + "건 삭제되었습니다.");

		} else {
			System.err.println("사용자 삭제 중 오류가 발생 하였습니다.");
		
	}
}
}
