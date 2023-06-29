<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

<h2>로그인</h2>

<form action="../login/login.do" method="post">
	
	<div class="loginbox">
		<div id="login">
	
		<p>아이디 : <input type="text" name="id" value="${requestScope.id }" placeholder='ID를 입력해주세요'></p>
		<p>비밀번호 : <input type="text" name="pw" placeholder='PW를 입력해주세요.'></p>
		
		</div>
		
		<div id="button">
			<input type="submit" value="로그인">
		</div>
	</div>
	<div id="info">
		<input type="checkbox" name="saveID" value="Y">아이디저장
		<a href="">회원가입</a> <a href="">ID찾기</a> <a href="">PW찾기</a>
	
	</div>

</form>

</body>
</html>