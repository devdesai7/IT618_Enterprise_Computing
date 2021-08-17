<%-- 
    Document   : temp
    Created on : 17 Aug, 2021, 12:14:27 AM
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
         <form action="PollServlet?p=view" method="POST">
<!--         <input type = "text" name ="student_Name" > <br>
            <br>-->
        <input type = "submit" value="Vote" >
        <% String userlabel=(String)request.getAttribute("mes_add_pageTitle"); %>

Value is: <%=userlabel%>
        
    </form>
        <h1>Hello World!</h1>
    </body>
</html>
