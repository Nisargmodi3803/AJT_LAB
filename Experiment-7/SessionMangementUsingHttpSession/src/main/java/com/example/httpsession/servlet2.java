package com.example.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class servlet2 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
        {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            HttpSession httpSession = req.getSession(false);
            String name = (String) httpSession.getAttribute("name");

            out.println("<h1> servlet2 </h1>");
            out.println("<h2> Hello "+name+"</h2>");
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
