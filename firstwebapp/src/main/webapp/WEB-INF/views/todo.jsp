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
    <link rel="stylesheet" href="webjars/bootstrap/4.3.1/css/bootstrap.css">
</head>
<body>
<div class="container">
    <h1>Welcome, ${name}</h1>
    <p>Add a new todo below</p>

    <form action="/add-todo" method="post">
        <fieldset class="form-group">
            <label>Description</label>
            <input name="desc" type="text"
                   class="form-control" required="required" placeholder="Enter description of new todo"/>
        </fieldset>

        <button type="submit" class="btn btn-success">Add</button>
    </form>
</div>

<script src="webjars/jquery/3.4.1/jquery.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
</body>
</html>
