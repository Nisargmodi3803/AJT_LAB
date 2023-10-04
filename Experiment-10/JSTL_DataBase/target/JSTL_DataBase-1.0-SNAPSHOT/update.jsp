<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 04-10-2023
  Time: 07:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <%!
       String id,newName;
    %>
    <%
        id = request.getParameter("ID");
        newName = request.getParameter("newName");
    %>
    <sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres"
                       user="postgres" password="nisarg"/>
    <sql:update dataSource="${db}" var="update">
        update public.collage set name='<%=newName%>' where id='<%=id%>'
    </sql:update>
    <%
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.include(request,response);
    %>
</body>
</html>
