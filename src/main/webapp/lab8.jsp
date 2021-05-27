<%-- 
    Document   : lab8
    Created on : 27 трав. 2021, 23:06:42
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
        <h1>Lab 8</h1>
        <h2>Варіант 12</h2>
        
        <div>
            <p>Невідсортований масив Integer: <%=request.getAttribute("unsortedList")%></p>        
            <p>Відсортований масив задопомогою сортування включенням: <%=request.getAttribute("sortedList_2")%></p>
            <p>Складність алгоритму O( n^2 )</p> 
            <p>Витрачено часу на сортування методом включення: <%=request.getAttribute("elapsedTime_2")%> мілісекунд</p>  
            <p>Відсортований масив задопомогою сортування злиттям: <%=request.getAttribute("sortedList_3")%></p>  
            <p>Складність алгоритму O( n * log( n ) )</p>
            <p>Витрачено часу на сортування методом злиття: <%=request.getAttribute("elapsedTime_3")%> мілісекунд</p>  
            <form action="lab8form.jsp">  
                <input type="submit" value="New value">
            </form> 
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
