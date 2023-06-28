<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>

<link >

</head>
<body>

<h2>도서 등록 페이지</h2>


<%@ include file="../common/header.jsp" %>


<form action="../book/write.book" name="writeFrm" method="post" enctype="multipart/form-data"
onsubmit="return validateForm(this);">
<table border="1" width="90%">
	
	<tr>
		<td>아이디 :	
		
			<input type="text" name="id" style="width:150px;"
				value="${sessionScope.userId }" readonly="readonly">
		</td>
	</tr>
	
	<tr>
		<td>도서명 : <input type="text" name="title" style="width:150px"></td>
		
	</tr>
	<tr>
	<td>작가명 : <input type="text" name="author" style="width:150px"></td>
	</tr>
	
	<tr>
		<td>책 이미지
		
			<input type="file" name="bookImg">
		</td>
	</tr>
	
	<tr>
		<td>
			<input type="submit" value="등록하기">
		</td>
	</tr>	
	
</table>

</form>

</body>
</html>