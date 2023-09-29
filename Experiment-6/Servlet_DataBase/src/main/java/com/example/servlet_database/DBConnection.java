package com.example.servlet_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password = "nisarg";
    public static Connection getConnect() throws SQLException
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url,username,password);
        }
        catch (ClassNotFoundException e)
        {
            throw new SQLException("Driver Not found",e);
        }
    }
}
