<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%
request.setCharacterEncoding("utf-8");
%>
<html>
<head>
	<title>Member</title>
</head>
<body>
<h1>
	Hello Member Detail JSP!  
</h1>

<P>  회원개인정보 화면 </P>
<P>  <a href="/member">뒤로</a> </P>

 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>이메일</th>
                <th>주소</th>
                <th>전화번호</th>
            </tr>
        </thead>
        <tbody>
                <tr>
                    <td>${memberDetail.id}</td>
                    <td>${memberDetail.pw}</td>
                    <td>${memberDetail.name}</td>
                    <td>${memberDetail.email}</td>
                    <td>${memberDetail.address}</td>
                    <td>${memberDetail.cell}</td>
                </tr>
        </tbody>
    </table>
 
</body>
</html>
