<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서목록</title>
</head>
<body>
<%@ include file="../common/header.jsp" %>

<h2>도서목록 - </h2>
	
	<table border="1">
		<tr>
		<td></td>
		<td>번호</td>
		<td>제목</td>
		<td>대여여부</td>
		<td>작가</td>
		</tr>
	
	
	
	<c:forEach items="${list }" var="book" varStatus="loop">
	
		<tr>
			<td><input type="checkbox"></td>
			<td>${book.no }</td>
			<td>${book.title }</td>
			<td>${book.rentyn }</td>
			<td>${book.author }</td>
		</tr>
	
	</c:forEach>
	
	</table>

</body>
</html>