<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 28-09-2023
  Time: 09:51 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Print Output</title>
</head>
<body>
        <jsp:useBean id="student" scope="session" class="com.example.javabeans_session.Student"/>
        <h1>
            ID : <jsp:getProperty name="student" property="id"/><br><br>
            Name : <jsp:getProperty name="student" property="name"/>
        </h1>
</body>
</html>
