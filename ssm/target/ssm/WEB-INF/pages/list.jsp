<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\14 0014
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有的帐户</h3>

<c:forEach items="${list}" var="account">
    <h2 style="background-color: orange" align="center">${account.name}</h2> <br>
</c:forEach>
</body>
</html>
