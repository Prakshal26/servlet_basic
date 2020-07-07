/*
There are two ways to send reg from one servlet to another:
1> RequestDispatcher: Like we are doing now,using RequestDispatcher and then sending the request to Sq servlet. without
involving the client.
2> SendRedirect: We will send response from servlet 1 to client and ask client to send request to servlet 2.
Can be done in 3 ways: Url Pattern, Cookies, Sessions.

 */


package com.servletjsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    //Service is HttpServlet method class
    //We need not to do new in HttpServletRequest/Response object. Automatically object will be created by Java
    //Service method will handle both do get and do post request.
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k= i +j;

        //Url Pattern of sendRedirect.

        res.sendRedirect("sq?k"+k);

        //Using Session
        HttpSession session = req.getSession();
        session.setAttribute("key",k);
        res.sendRedirect("sq");

        //Using Cookies                          Sending value as a string
        Cookie cookie = new Cookie("key",k+"");
        //Add cookie to response object
        res.addCookie(cookie);
        res.sendRedirect("sq");


    }
}