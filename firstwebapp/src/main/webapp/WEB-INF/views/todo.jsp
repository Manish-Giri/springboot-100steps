<%--
  Created by IntelliJ IDEA.
  User: manishgiri
  Date: 10/17/19
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new todo</title>
</head>
<body>
<h2>Welcome, ${name}</h2>
<p>Add a new todo below</p>

<form action="/add-todo" method="post">
    <input type="text" name="desc" placeholder="Enter description of new todo">
    <input type="submit">
</form>
</body>
</html>
