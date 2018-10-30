<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\14 0014
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">查询所有</a>
<h3>测试</h3>
<form action="account/save" method="post">
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    财富：<input type="text" name="money"/><br>
    <input type="submit" name="保存">



</form>
</body>
</html>
