<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서목록</title>
<style type="text/css">
#container {
	border: 1px solid black;
}

</style>

</head>
<body>

<div id="container">
<%@ include file="../common/header.jsp" %>



<h2>도서목록 - </h2>
	
총건수 : 00건
<!-- 검색폼 시작 -->
<%@ include file="../common/SearchForm.jsp" %>
<!-- 검색폼 끝 -->
	
	<table border="1">
	
	<c:if test="${sessionScope.adminYN eq 'Y' }">
	<tr>
		<td colspan="5" class="right">
			<!-- 어드민 계정인 경우 등록, 삭제버튼을 출력 -->
	<button>도서등록</button>
	<button>도서삭제</button>
		</td>
	</tr>
	</c:if>
		
	<tr>
		<td width="5%"></td>
		<td width="20%">번호</td>
		<td width="10%">제목</td>
		<td width="20%">대여여부</td>
		<td width="20%">작가</td>
	</tr>
	
	<c:if test="${empty list }" var="res">
		<td colspan="5" class=center>
			등록된 게시물이 없습니다
		</td>
	</c:if>
	
	<c:forEach items="${list }" var="book" varStatus="loop">

	<!-- <c:set var="rentYN" value="${book.rentyn }"/>
	<c:if test="${rentYN eq 'Y' }" var="rentyn">대여가능</c:if>

	<c:if test="${not rentYN eq 'Y'}" var="rentyn">대여중</c:if> -->	
		<tr>
			
		
			<td><input type="checkbox" name="delbo" value="${book.no }"></td>
			<td>${book.no }</td>
			<td><a href="../book/view.book?no=${book.no }">
			${book.title }</a>
			</td>
			<td>${book.rentyn }</td>
			<td>${book.author }</td>
		</tr>
	
	</c:forEach>
	
	</table>
</div>
</body>
</html>