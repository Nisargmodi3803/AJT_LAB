<%@ page import="java.io.IOException" %><%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 27-09-2023
  Time: 11:13 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBeans</title>
</head>
<body>
    <jsp:useBean id="jBeans" class="com.example.javabeans.javaBeansClass" scope="request">
        <jsp:setProperty name="jBeans" property="*"/>
    </jsp:useBean>

<div>
    <h1>
        ID: <jsp:getProperty name="jBeans" property="id"/><br><br>
        Name: <jsp:getProperty name="jBeans" property="name"/><br><br>
    </h1>
</div>

</body>
</html>
