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
	Hello Member JSP!  
</h1>

<P>  한글은 잘 써지냐? </P>
<P>  <a href="/">Home</a> </P>

 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td><a href="/memberDetail?sId=${member.id}">${member.id}</a></td>
                    <td>${member.pw}</td>
                    <td>${member.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
</body>
</html>
