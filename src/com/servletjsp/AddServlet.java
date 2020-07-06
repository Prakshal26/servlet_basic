package com.servletjsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        PrintWriter out = res.getWriter();
        out.println("result is=" +k);

        //Sending Request from one Servlet to another

        /*
        We will set the value in req object as a key value pairs.
        Here value passsed is k.
         */
        req.setAttribute("key",k);
        //Sending the request to the dispatcher namely sq.
        //We have to give the mapping in web.xml of this servlet.
        /*
        Sq is kind of url,That is in web.xml we are saying when sq url is called then go to
        SqServlet. We are passing request model from here which have the key as key and value k.
         */
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
        requestDispatcher.forward(req,res);

    }
}