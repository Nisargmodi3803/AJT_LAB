package com.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class servlet2 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        try
        {
            PrintWriter out = resp.getWriter();
            Cookie[] cookies = req.getCookies();

            out.println("<h1> Servlet2 </h1>");
            out.println("<h2> Hello "+cookies[0].getValue()+"</h2>");
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
