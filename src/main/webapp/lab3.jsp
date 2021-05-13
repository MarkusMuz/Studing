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
        <title>Lab 3</title>
    </head>
    <body>
        <h1>Lab 3</h1>
        
        <%--<p><%=request.getAttribute("results")%></p>--%>
        <h2>Варіант 7</h2>
        <p>Рандомно згенерований масив: <%=request.getAttribute("result")%></p>
        <p>НСД усіх елементів масива = <%=request.getAttribute("ans")%></p>
        
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
