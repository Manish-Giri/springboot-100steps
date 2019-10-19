<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: manishgiri
  Date: 10/15/19
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Items</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.3.1/css/bootstrap.css">
</head>
<body>
<div class="container">
    <h1>Welcome, ${name}!</h1>
    <p>Here are your todo items.</p>
    <table class="table table-striped">
        <caption>Your todos are</caption>
        <thead>
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is it Done?</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div><a class="button" href="/add-todo">Add a Todo</a></div>
</div>
<script src="webjars/jquery/3.4.1/jquery.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
</body>
</html>
