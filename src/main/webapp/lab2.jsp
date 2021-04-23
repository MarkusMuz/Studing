<%-- 
    Document   : lab2
    Created on : 11 квіт. 2021, 22:00:36
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
    </head>
    <body>
        <h1>Lab 2</h1>
        <h2>Варіант 12</h2>
        <h3>a=0 b=8 c= -5 d=1</h3>
        <p>Результат виконання: <%=request.getAttribute("result")%></p>
        
        <div>
            <form action="lab2form.jsp">  
                <input type="submit" value="New x">
            </form> 
        </div>
        
        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
