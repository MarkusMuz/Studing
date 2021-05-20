<%-- 
    Document   : lab6form
    Created on : 20 трав. 2021, 22:14:59
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
        <form method="post" action="./lab6">
                <p>Перший елемент геометричної прогресії</p>
                <input type="text" name="a" placeholder="a"/>
                <p>Крок геометричної прогресії</p>
                <input type="text" name="q" placeholder="q"/>
                <p>Скільки членів геометричної прогресії шукати</p>
                <input type="text" name="k" placeholder="k"/>
                <input type="submit" value="ok"/>
        </form>
    </body>
</html>
