<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/style.css">
<title>목록 조회</title>
</head>
<body>
<%@include file="../commom/header.jsp" %>


<h2>도서목록</h2>


총건수 : ${requestScope.totalCnt}건
	
	
	
	<table border="1" >
	
	
	<tr>
		<td colspan="5" class="center">
		<%@ include file ="../commom/SearchForm.jsp" %>
		</td>
	
	</tr>
		
	
	
	
	<tr>
		<th width="5%"></th>
		<th width="5%">아이디</th>
		<th width="20%">이름</th>
		<th width="20%">관리자여부</th>
	</tr>
	
	<c:if test="${empty memberList }" var="res">
		<td colspan="5" class=center>
			등록된 게시물이 없습니다
		</td>
	</c:if>
	
	<!-- 리퀘스트 영역에 저장된 map 에서 list 를 뽑아온다.
		향상된 for문 형식의 forEach문 -->
	<c:forEach items="${memberList }" var="member" varStatus="loop">

	<!-- <c:set var="rentYN" value="${book.rentyn }"/>
	<c:if test="${rentYN eq 'Y' }" var="rentyn">대여가능</c:if>

	<c:if test="${not rentYN eq 'Y'}" var="rentyn">대여중</c:if> -->	
		<tr>
			
		
			<!-- 삭제버튼을 누르면 체크 박스를 보여주도록하고 그후에 체크박스 선택 후 삭제 가능토록 하는것도 ..? -->
			<td><input type="checkbox" name="delNo" value="${member.id}" class="center"></td>
			<td>${member.id }</td>
			<td>	${member.name }</td>
			<td>${member.adminyn }</td>
			
		</tr>
	
	<!-- 페이징처리 모듈화 -->
	</c:forEach>
	
	<table border="1" width="100%">
		<tr>
			<td align="center">
				<jsp:include page="../page/PageNavi.jsp">
				
				<jsp:param name="pageDto" value="${requestScope.pageDto }" />
				</jsp:include>
			</td>
		</tr>
	</table>
	
	</table>

</body>
</html>