<%--
  Created by IntelliJ IDEA.
  User: upagge
  Date: 03/12/2018
  Time: 00:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Вход</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/" method="post">
    <label>Имя</label><input type="text" name="name"/><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
