package com.example.servlet_database;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginServlet extends HttpServlet
{
    private String Username,Password,name,pass;
    private int flag=0;
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "nisarg";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse respond) throws ServletException, IOException
    {
        respond.setContentType("text/html");
        PrintWriter out = respond.getWriter();

        Username = request.getParameter("Username");
        Password = request.getParameter("Password");

        try
        {
            Connection conn = DriverManager.getConnection(url,username,password);
            Class.forName("org.postgresql.Driver");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM PUBLIC.LOGIN;");
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                name = rs.getString(0);
                pass = rs.getString(1);

                if(name.equals(Username) && pass.equals(Password))
                {
                    flag=1;
                    break;
                }
            }
            rs.close();
            ps.close();
            conn.close();
        }
        catch (Exception e)
        {
            out.println(e.toString());
        }

        if (flag==1)
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
            requestDispatcher.forward(request,respond);
        }
        else
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            out.println("<br><h1>Login Credentials are Wrong</h1>");
            requestDispatcher.include(request,respond);
        }

        out.close();

    }
}
