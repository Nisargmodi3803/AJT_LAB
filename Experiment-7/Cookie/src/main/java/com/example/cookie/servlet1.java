package com.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        try
        {
            resp.setContentType("text/html");

            PrintWriter out = resp.getWriter();

            String s1 = req.getParameter("name");
            Cookie cookie = new Cookie("name",s1);
            resp.addCookie(cookie);

            out.println("<h1>Servlet1</h1?>");
            out.println("<h2>Hello "+s1+" </h2>");
            out.println("<form method='post' action='servlet2'><input type='submit' value='next'></form>");
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
