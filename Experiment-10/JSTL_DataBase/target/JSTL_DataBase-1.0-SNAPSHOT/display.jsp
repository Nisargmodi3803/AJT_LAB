<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 04-10-2023
  Time: 11:51 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
    <sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres"
                   user="postgres" password="nisarg"/>
    <sql:query var="select" dataSource="${db}">
        select * from public.collage;
    </sql:query>

    <div>
        <table border="2" width="50%" align="center">
            <tr>
                <th>Student-ID</th>
                <th>Student-Name</th>
            </tr>
            <c:forEach var="table" items="${select.rows}">
                <tr>
                    <td><c:out value="${table.id}"/></td>
                    <td><c:out value="${table.name}"/> </td>
                </tr>
            </c:forEach>

    </table>
    </div>
</body>
</html>
