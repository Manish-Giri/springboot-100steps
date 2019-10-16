<%@ page import="java.util.Date" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
<h1>Hello World</h1>

<h3 style="color:red">${error}</h3>
<p>Please login below</p>
<form action="/login" method="post">
    <input type="text" name="name" placeholder="Enter user name">
    <input type="password" name="password" placeholder="Enter your password">
    <input type="submit">
</form>
</body>
</html>