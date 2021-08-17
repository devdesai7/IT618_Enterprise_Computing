<%-- 
    Document   : Poll
    Created on : 16 Aug, 2021, 5:09:35 PM
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
        <h1>Add Candidate</h1>
    <form action="PollServlet?p=AddCandidate" method="POST">
        Candidate Name : <input type = "text" name ="student_Name" > <br>
            <br>
        <input type = "submit" value="ADD CANDIDATE" >

        
    </form>
        
<!--<a href="<c:url value="/report"/>?p=value">report</a>-->
    </body>
</html>
