<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 - 검색폼</title>
</head>
<body>

<!-- 검색폼 시작 -->
<form method="get" name="searchForm">
<!-- 페이지 번호 -->    
    <input type="hidden" name="pageNo"  >  
    
    <table border="1" class="center" width="100%">
    <tr>
        <td class="center">
            <select name="searchField"> 
                <option value="id">아이디</option> 
                <option value="name" ${param.searchField eq "name" ? "selected" : ""}>
                이름</option>
                
            </select>
            <input type="text" name="searchWord" value="${param.searchWord }" />
            <input type="submit" value="검색하기" />
        </td>
    </tr>   
    </table>
    </form>
    
</body>
</html>