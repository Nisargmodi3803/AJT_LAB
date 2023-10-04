<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 04-10-2023
  Time: 11:37 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
<head>
    <title>Insert</title>
</head>
<body>
    <sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres"
                        user="postgres" password="nisarg"/>
    <%!
        String id,name;
    %>
    <%
        id = request.getParameter("newId");
        name = request.getParameter("newName");
    %>
    <sql:update var="insert" dataSource="${db}">
        insert into public.collage values('<%=id%>','<%=name%>')
    </sql:update>

    <%
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.include(request,response);
    %>
</body>
</html>
