<%--
  Created by IntelliJ IDEA.
  User: praksjai
  Date: 07-Jul-20
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(session.getAttribute("username")==null) {
        response.sendRedirect("login.jsp");
    }
    else {
        //Now display actual content of Welcome page

    }
%>

</body>
</html>
