<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더영역</title>
</head>
<body>

<header>
	userId : ${sessionScope.userId }
	adminYN : ${sessionScope.adminYN }
	
	
	<c:if test="${sessionScope.adminYN eq 'Y'}" var="loginCheck">
	<!-- 어드민  -->
		관리자
		<div>로고</div>
		<div>
			<a href="">도서관리</a>
			<a href="">사용자관리</a>
		</div>
		<div>
		<a href="../LogoutController">로그아웃</a></div>
		
	</c:if>
	
	<!-- 사용자 -->
	<c:if test="${not loginCheck}">
		<div>로고</div>
		<div>
				<a href="">도서관리시스템</a>
		</div>
			<a href="">마이페이지</a>
	<!-- 사용자 메뉴 종료 -->
			
	<!-- 로그인 전 -->
		<c:if test="${empty sessionScope.userId}" var="res1">
			<div>로그인</div>
		</c:if>
		
		<c:if test="${not res1 }"></c:if>
	
			<div>로그아웃</div>
	</c:if>
	<!-- 로그인 후 -->
	
	
</header>

</body>
</html>