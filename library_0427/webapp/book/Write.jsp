<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>

<h2>도서 등록 페이지</h2>

<form action="../book/insertProcess.book">
<table border="1">
	<tr>
		<td>도서명 : <input type="text" name="title"></td>
		
	</tr>
	<tr>
	<td>작가명 : <input type="text" name="author"></td>
	</tr>

	
	
</table>
<input type="submit" value="등록하기"> 
</form>

</body>
</html>