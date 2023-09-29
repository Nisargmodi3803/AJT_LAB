package com.example.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
        {
            resp.setContentType("text/html");
            String s1 = req.getParameter("name");
            PrintWriter out = resp.getWriter();

            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("name",s1);
            out.println("<h1> Servlet1 </h1>");
            out.println("<form action='servlet2' method='post'> <input type='submit' value='next'></form>");
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
