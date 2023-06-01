<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
    function updateTime() {
        var dateElement = document.getElementById("date");
        var now = new Date();
        var hours = now.getHours();
        var minutes = now.getMinutes();
        var seconds = now.getSeconds();
        var timeString = hours + ":" + minutes + ":" + seconds;
        dateElement.innerText = timeString;
    }

    setInterval(updateTime, 1000); // Update every second
</script>

</head>
<body>

<h3>language</h3>
<p>스크립팅 언어(응용프로그램에서 사용되는 프로그램언어)를 지정</p>

<h3>contentType</h3>
<p>문서의 타입과 인코딩 방식을 지정</p>

<h3>pageEncoding</h3>
<p>소스코드의 인코딩 방식을 지정</p>

<h2>import</h2>
<p>java.lang 패키지에 속하지 않은 클래스를 JSP 문서에서 사용하기 위해 임포트</p>

<%
    LocalDateTime ldt = LocalDateTime.now();
    String date = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
%>

<p id="date"><%= date %></p>

</body>
</html>