package com.servletjsp;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {


        //Handling Request from AddServlet Using URL Pattern

        int k = Integer.parseInt(req.getParameter("key"));
        k=k*k;

        PrintWriter out = res.getWriter();
        out.println("Result is "+ k);

        //Handling Request Using Session

        HttpSession session = req.getSession();
        int k1= (int)session.getAttribute("key");

        //Handling Request using Cookies.
        /*
        One Client can have many cookies so client will send all the cookies as a list,
        now we will fetch the cookie from that list which we need.
         */
        Cookie cookie[]=req.getCookies();

        for(Cookie c :cookie) {
            if(c.getName().equals("key")) {
                int k2=Integer.parseInt(c.getValue());
            }
        }

    }
}
