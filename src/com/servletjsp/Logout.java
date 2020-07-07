package com.servletjsp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Logout")
public class Logout extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
/*
As soon as logout button is called delete the session and make that user invalid.
Now if he again try to go to welcome page it will tell him to be a invalid user.
 */
        HttpSession session=request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        response.sendRedirect("login.jsp");
    }
}
