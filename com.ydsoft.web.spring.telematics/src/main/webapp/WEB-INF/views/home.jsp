<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  Data from server : ${data}. </P>
<P>  Name : ${name}. </P>
<P>  <a href="/calendar/">Calendar</a> </P>
<P>  <a href="/member/">Member</a> </P>

</body>
</html>
