<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: manishgiri
  Date: 10/15/19
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logged In</title>
</head>
<body>
<h1>Welcome, ${name}!</h1>
<hr>
<p>Time on server: <%= new Date()%></p>
<p>Here are your <a href="/list-todos">todo items</a>.</p>
</body>
</html>
