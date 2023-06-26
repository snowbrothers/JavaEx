package com.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.library.service.MemberService;
import com.library.vo.Member;
import com.utils.CookieManager;

/**
 * Servlet implementation class LoginActionController
 */
@WebServlet("/login/LoginAction.do")
public class LoginActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginActionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// 값 받아와서 변수에 저장 후 재사용
		// name 속성의 값을 매개값으로 넘겨주면 value속성의 값을 반환합니다.
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		
		String saveCheck = request.getParameter("saveCheck");
		
		if("Y".equals(saveCheck)){
		
			CookieManager.makeCookie(response, "userId", id, 3600);
		
		}
		
		// lib 이동
		// java Resources -> webapp/WEB-INF/lib
		MemberService service = new MemberService();
		Member member = service.login(id, pw);
		
		
		
		if(member != null && !member.getId().equals("")){
			
			HttpSession session = request.getSession();
			
			// String mem = (String)session.getAttribute("member");

			// 세션 가지고 오는 방법 
			// request 로부터 꺼내와야함 
			session.setAttribute("member", member);
			// userId 저장
			session.setAttribute("userId", member.getId());
			
			// 로그인 성공
			System.out.print(
					member.getName() + "님 환영합니다.");
			
			// 세션에 멤버객체 저장
			
			
			
			if("Y".equals(member.getAdminyn())){
				// 관리자인 경우 adminYN = Y
				session.setAttribute("adminYN", "Y");
				// 관리자 페이지 호출
			
				
			}
			
			
			response.sendRedirect("../book/list.book");
//			request.getRequestDispatcher("../book/list.book")
//							.forward(request, response);
			
		}else{
			// 로그인 실패
			// 로그인 화면으로 이동
			response.sendRedirect("login.jsp?loginErr=Y");
		}
		
		System.out.print("member : " + member);
		
	}

}

