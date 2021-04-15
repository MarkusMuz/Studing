<%-- 
    Document   : lab3
    Created on : 15 квіт. 2021, 22:11:20
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab 3</h1>
        
        <%--<p><%=request.getAttribute("results")%></p>--%>
        <p><%=request.getAttribute("result")%></p>
        
        <div>
            <form action="lab3form.jsp">  
                <input type="submit" value="New k">
            </form> 
        </div>
        
        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
