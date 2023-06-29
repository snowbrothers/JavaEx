package com.lib.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lib.dao.MemberDao;
import com.lib.vo.Member;
import com.utils.CookieManager;

@WebServlet("/login/login.do")
public class LoginController extends HttpServlet{

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// id와 pw 를 받아서 MemberDao 에 로그인 메서드를 생성 후 DB와 연동 값이 있으면 값 반환 후 세션에 저장 할 수 있도록 처리
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String saveID = req.getParameter("saveID");
		MemberDao dao = new MemberDao();
		Member member = dao.login(id, pw);

		// 아이디 저장
		if("Y".equals(saveID)) {
			
			CookieManager.makeCookie(resp, "userId", id, 3600);
			
		}
		
		
		if(member != null && !member.getId().equals("")) {
			
			HttpSession session = req.getSession(); 
			
			session.setAttribute("member", member);
			
			session.setAttribute("userId", member.getId());
			
			System.out.println(member.getName() + "님 환영합니다.");
			
			if("Y".equals(member.getAdminyn())) {
				session.setAttribute("adminYN", "Y");
			}
			
			resp.sendRedirect("../list.lib");
			
		}else {
			System.out.println("로그인 불가능");
		}
		
		
	}

}
