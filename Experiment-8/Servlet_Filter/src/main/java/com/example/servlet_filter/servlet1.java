package com.example.servlet_filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1> Welcome!!!</h1>");
        int id = Integer.parseInt(request.getParameter("ID"));
        String name = request.getParameter("Name");

        out.println("<h1> ID : "+id+"</h1>");
        out.println("<h1> Name : "+name+"</h1>");
    }
}
