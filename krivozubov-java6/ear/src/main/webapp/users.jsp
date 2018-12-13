<%--
  Created by IntelliJ IDEA.
  User: upagge
  Date: 03/12/2018
  Time: 01:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
</head>
<body>
<h1>hello, ${login}</h1>
<form method="post" action="${pageContext.request.contextPath}/users">
    <input type="submit" value="exit">
</form>
<ol>
    <c:forEach items="${users}" var="user">
        <li>${user.name}</li>
    </c:forEach>
</ol>

</body>
</html>
