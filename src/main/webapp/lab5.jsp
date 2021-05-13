<%-- 
    Document   : lab5
    Created on : 13 трав. 2021, 21:07:49
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        <h1>Lab 5</h1>
        <h2>Варіант 12</h2>
        
        <div>
            <p>Невідсортований масив Integer: <%=request.getAttribute("unsortedList")%></p>        
            <p>Відсортований масив задопомогою sortApproach2: <%=request.getAttribute("sortedListv2")%></p>  
            <p>Відсортований масив задопомогою sortApproach3: <%=request.getAttribute("sortedList")%></p>
            <p>Визначити місце знаходження числа: <%=request.getAttribute("task2")%></p>
            <p>Невідсортований масив String: <%=request.getAttribute("unsortedText")%></p>   
            <p>Відсортований масив задопомогою sortApproach2: <%=request.getAttribute("sortedText")%></p>             
            <p>Визначити місце знаходження літери: <%=request.getAttribute("task3")%></p>        
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
