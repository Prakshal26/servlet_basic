package com.servletjsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//test
public class AddServlet extends HttpServlet {

    //Service is HttpServlet method class
    //We need not to do new in HttpServletRequest/Response object. Automatically object will be created by Java
    //Service method will handle both do get and do post request.
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k= i +j;

        PrintWriter out = res.getWriter();
        out.println("result is=" +k);



    }
}