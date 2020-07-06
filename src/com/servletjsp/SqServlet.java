package com.servletjsp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        /*
        Web.xml has redirected us here , There we were having key value so here we will
        fetch it, do some operations and print the result.
         */
        int k = (int)req.getAttribute("key");
        k=k*k;

        PrintWriter out = res.getWriter();
        out.println("Result is "+ k);
    }
}
