package service;

import dao.MemberDao;
import vo.MemberVo;

public class MemberService {

	
	MemberDao memberDao = new MemberDao();
	
	
	public MemberVo login(String id, String pw) {
	
		MemberVo memberVo = memberDao.login(id, pw);
		
		if(memberVo != null) {
			
			System.out.println(memberVo.getName() + "님 환영합니다.");
			return memberVo;
		
		}else {
			System.out.println("아이디 / 비밀번호가 일치하지 않거나 없는 계정입니다.");
			return null;
		}
		
		
		// 확인 할 것
	}
	
	
	public int insertMember(MemberVo memberVo) {
		
		int res = memberDao.insertMember(memberVo);
		int num = 0;
		
		if(res > 0) {
			System.out.println("계정 추가 되었습니다.");
			
			num=1;
		} else {
			System.err.println("계정 추가도중 오류가 발생 했습니다.");
		}
		
		return num;
	}

	
	public int deleteMember(String id) {
		
		int res = memberDao.deleteMember(id);
		int num = 0;
		if(res > 0) {
			System.out.println("삭제 되었습니다.");
			num=1;
		} else {
			System.err.println("삭제 도중 오류가 발생 했습니다.");
		}
		
		return num;
	}

	
	
}
