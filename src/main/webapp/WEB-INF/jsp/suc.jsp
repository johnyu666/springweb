<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello JSP:${uname}</h1>
    <h2><%=1+1%></h2>
<%
    String uname=(String)request.getAttribute("uname");
    out.write(uname);
%>
<%=uname%>
</body>
</html>
