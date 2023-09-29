package com.example.servlet_filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

public class servletFilter2 implements Filter
{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest) request;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(req.getParameter("ID"));
        String name = req.getParameter("Name");
        if(name.isEmpty() && id==0)
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            out.println("<h1>Name field is empty & ID is Zero!!!</h1>");
            requestDispatcher.include(request,response);
        }
        else if(name.isEmpty() && id<0)
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            out.println("<h1>Name field is empty & ID is Negative!!!</h1>");
            requestDispatcher.include(request,response);
        }
        else if(name.isEmpty())
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            out.println("<h1>Name field is empty!!!</h1>");
            requestDispatcher.include(request,response);
        }
        else if(id==0)
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            out.println("<h1>ID is Zero!!!</h1>");
            requestDispatcher.include(request,response);
        }
        else if(id<0)
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            out.println("<h1>ID is Negative!!!</h1>");
            requestDispatcher.include(request,response);
        }
        else
        {
            chain.doFilter(request,response);
        }
    }
}
