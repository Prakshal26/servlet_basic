<%--
  Created by IntelliJ IDEA.
  User: praksjai
  Date: 07-Jul-20
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<!--
First Page will be login page. A form where user will enter username and password.
Login servlet(Login.java) is called. There take the data and match is correct username passowrd entered.

-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Login" method="post">

    Enter UserName: <input type="text" name="uname"><br>
    Enter Password:<input type="password" name="pass">
    <input type="submit" value="login">
</form>
</body>
</html>
