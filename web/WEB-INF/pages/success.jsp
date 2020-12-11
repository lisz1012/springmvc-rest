<%--
  Created by IntelliJ IDEA.
  User: shuzheng
  Date: 12/10/20
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    Success <br>
    request:${requestScope.get("request")}<br>
    session:${sessionScope.get("session")}
</body>
</html>
