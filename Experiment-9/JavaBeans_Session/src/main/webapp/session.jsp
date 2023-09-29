<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 28-09-2023
  Time: 09:46 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>JavaBeans Session</title>
</head>
<body>
    <jsp:useBean id="student" scope="session" class="com.example.javabeans_session.Student"/>
        <jsp:setProperty name="student" property="id" value='<%=Integer.parseInt(request.getParameter("ID")) %>'/>
        <jsp:setProperty name="student" property="name" value='<%=request.getParameter("Name")%>'/>
    <%
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("print.jsp");
        requestDispatcher.forward(request,response);
    %>

</body>
</html>
