<%-- 
    Document   : lab7
    Created on : 20 трав. 2021, 22:48:33
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
        <h1>Lab 7</h1>
        
        <h2>Варіант 12</h2>
        <h3>Початкове дерево: <%=request.getAttribute("LevelOrder")%></h3>
        <h3>Інфіксний обхід дерева: <%=request.getAttribute("inOrder")%></h3>
        <h3>Префіксний обхід дерева: <%=request.getAttribute("PreOrder")%></h3>
        <h3>Постфіксний обхід дерева: <%=request.getAttribute("PostOrder")%></h3>
        <h3>Симетричне бінарне дерево: <%=request.getAttribute("Balanced")%></h3>
        
        <div>
            <form action="lab7form.jsp">  
                <input type="submit" value="New values">
            </form> 
        </div>
        
        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
