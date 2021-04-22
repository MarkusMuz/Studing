<%-- 
    Document   : lab4form
    Created on : 22 квіт. 2021, 22:28:12
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
        <h1>Insert text</h1>
        
        <div>
            <form action="./lab4" method="post"> 
                <input type="text" name="text" placeholder="Enter text"/>
                <input type="submit" value="Ok"/>
            </form> 
        </div>
    </body>
</html>
