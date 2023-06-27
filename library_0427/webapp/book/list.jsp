<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서목록</title>

<script type="text/javascript">
	
	let message = '${message}';
	
	if(message != null && "" != message){
		alert(message);
	}
	
	function deleteBook() {
		// 체크박스가 선택된 요소의 value값을 ,로 연결
		delNoList =  document.querySelectorAll("[name=delNo]:checked");
		
		let delNo = "";
		delNoList.forEach((e)=>{
			delNo += e.value + ',';
		});
		
		
		delNo = delNo.substr(0, delNo.length-1);
		
		console.log("삭제할 번호 : " + delNo);
		
		// 삭제요청
		searchForm.action = "../book/delete.book";
		searchForm.delNo.value= delNo;
		searchForm.submit();
		
	}
	

	
</script>

<style type="text/css">
*{
	padding : 0;
	margin: 0;
}

main{

	border: 1px solid red;
	
}
body{
	margin: 0 auto;
	width: 600px;
	border: 1px solid black;
}

header{
	border : 1px solid black;
	width  : 600px;
	height : 50px;
	line-height : 50px;
	display : flex;
	justify-content: space-between;
	
}

.right{
	text-align:right;
}

</style>

</head>
<body>



<header>
<%@ include file="../common/header.jsp" %>
</header>


<h2>도서목록 - </h2>

총건수 : ${map.totalCnt}건
	<table border="1" width="100%">
	
	
	
	<tr>
<!-- 검색폼 시작 -->
<td>
<%@ include file="../common/SearchForm.jsp" %>
</td>
<!-- 검색폼 끝 -->
	</tr>
	
	
	<c:if test="${sessionScope.adminYN eq 'Y' }">
	<tr>
		<td colspan="5" class="right">
			<!-- 어드민 계정인 경우 등록, 삭제버튼을 출력 -->
	<button onclick="location.href='./Write.jsp'">도서등록</button>
	<button onclick="deleteBook()">도서삭제</button>
		</td>
	</tr>
	</c:if>
		
	<tr>
		<td width="5%"></td>
		<td width="5%">번호</td>
		<td width="20%">제목</td>
		<td width="20%">대여여부</td>
		<td width="20%">작가</td>
	</tr>
	
	<c:if test="${empty map.list }" var="res">
		<td colspan="5" class=center>
			등록된 게시물이 없습니다
		</td>
	</c:if>
	
	<c:forEach items="${map.list }" var="book" varStatus="loop">

	<!-- <c:set var="rentYN" value="${book.rentyn }"/>
	<c:if test="${rentYN eq 'Y' }" var="rentyn">대여가능</c:if>

	<c:if test="${not rentYN eq 'Y'}" var="rentyn">대여중</c:if> -->	
		<tr>
			
		
			<td><input type="checkbox" name="delNo" value="${book.no}"></td>
			<td>${book.no }</td>
			<td><a href="../book/view.book?no=${book.no }">
			${book.title }</a>
			</td>
			<td>${book.rentyn }</td>
			<td>${book.author }</td>
		</tr>
	
	</c:forEach>
	
	
	
	
	<c:set var = "pageDto" value="${map.pageDto }"></c:set>
	
	
		<tr>
			<td colspan="5" align="center">
				<%@include file="../9페이지/PageNavi.jsp" %>
			</td>
		</tr>
	</table>

	

</body>
</html>