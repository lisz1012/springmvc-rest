<%--
  Created by IntelliJ IDEA.
  User: shuzheng
  Date: 12/10/20
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<html>
<head>
    <title>User</title>
</head>
<body>
    <form action="testUser" method="post">
        编号：<input name="id" type="text"> <br />
        姓名：<input name="name" type="text"> <br />
        年龄：<input name="age" type="text"> <br />
        性别：<input name="gender" type="text"> <br />
        <input type="submit" value="提交">
    </form>
</body>
</html>
