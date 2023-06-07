<%@page import="com.library.service.MemberService"%>
<%@page import="com.library.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

		<!-- html 문서 안에 자바코드를 포함하고 있음. -->	

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		// 값 받아와서 변수에 저장 후 재사용
		// name 속성의 값을 매개값으로 넘겨주면 value속성의 값을 반환합니다.
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		
		// lib 이동
		// java Resources -> webapp/WEB-INF/lib
		MemberService service = new MemberService();
		Member member = service.login(id, pw);
		
		if(member != null && !member.getId().equals("")){
			
			// 로그인 성공
			out.print(
					member.getName() + "님 환영합니다.");
			
			
			if("admin".equals(member.getId())){
				
				// 관리자 페이지 호출
				response.sendRedirect("loginAdmin.jsp");
			
			}else{
				
				// 사용자 페이지 호출
				response.sendRedirect("loginMember.jsp");
				
			}
			
			
		}else{
			// 로그인 실패
			// 로그인 화면으로 이동
			response.sendRedirect("login.jsp?loginErr=Y");
		}
		
		System.out.print("member : " + member);
		
		
		
	%>


</body>
</html>