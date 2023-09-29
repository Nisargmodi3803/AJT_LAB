package com.example.servlet_filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

public class servletFilter1 implements Filter
{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest)request;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(req.getParameter("ID"));

        if(id>0)
        {
            chain.doFilter(request,response);
        }
        else
        {
            if(id==0)
            {
                chain.doFilter(request,response);
            }
            else
            {
                chain.doFilter(request,response);
            }
        }
    }
}
