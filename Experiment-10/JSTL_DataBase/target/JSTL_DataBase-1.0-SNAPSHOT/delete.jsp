<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 04-10-2023
  Time: 07:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
    <sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres"
                   user="postgres" password="nisarg"/>
    <%!
        String id;
    %>
    <%
        id = request.getParameter("ID");
    %>
    <sql:update dataSource="${db}" var="delete">
        delete from public.collage where id='<%=id%>'
    </sql:update>
    <%
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.include(request,response);
    %>
</body>
</html>
