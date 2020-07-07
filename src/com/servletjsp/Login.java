package com.servletjsp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uname= request.getParameter("uname");
        String pass = request.getParameter("pass");

        if(uname.equals("prakshal") && pass.equals("1234")) {
            /*
            If username password is correct then create a session.
             */
            HttpSession session = request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("welcome.jsp");//Go to Welcome page
        }
        else {//USername Password wrong again go to login page
            response.sendRedirect("login.jsp");
        }
    }
}
