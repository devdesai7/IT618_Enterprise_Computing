<%-- 
    Document   : Menu
    Created on : 17 Aug, 2021, 12:32:32 AM
    Author     : dev23
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Poll Simulator</h1>
<a href = "AddCandidate.jsp"> Add Candidate </a> <br>
<a href="PollServlet?p=view"> Vote </a> <br>
<a href = "PollServlet?p=Result"> Poll Result </a> <br>
<a href = "PollServlet?p=Report"> Voting Summary </a> <br>

    </body>
</html>
