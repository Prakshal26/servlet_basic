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
    /*
    Suppose USer click on logout. Its's session will be cleared and he will be a invalid user.
    But if user click back button in browser then again the welcome page will be displayed as that page will
    be stored in cache memory of a browser.
    So this setheader will tell browser not to store cache of this particular page and hence on clicking
    back button page will not be displayed.
     */
    response.setHeader("cache-control","no-cache,no-store,must-revalidate");

    /*
    If we have come from login page then session will be created, so if session is created then only
    allow user to access the content of welcome page.
    If user is coming to welcome page directly(without login) then no session will have been created
    as a result invalid user and redirect him back to login page.
    */
    if(session.getAttribute("username")==null) {//No session was present and hence invalid access to login page
        response.sendRedirect("login.jsp");
    }
    else {
        //Now display actual content of Welcome page

    }
%>
        ${username}
    <a href="videos.jsp">Videos Here</a>

    <form action="Logout">
        <input type="submit" value ="Logout">
    </form>
</body>
</html>
