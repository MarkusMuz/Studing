<%-- 
    Document   : lab7form
    Created on : 20 трав. 2021, 22:48:46
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
        <p>Введіть попярядку числа для побудування з них бінарного дерева</p>
        <form method="post" action="./lab7">
                <p>Перший</p>
                <input type="text" name="1" placeholder="Перший"/>
                <p>Другий</p>
                <input type="text" name="2" placeholder="Другий"/>
                <p>Третій</p>
                <input type="text" name="3" placeholder="Третій"/>
                <p>Четвертий</p>
                <input type="text" name="4" placeholder="Четвертий"/>
                <p>П'ятий</p>
                <input type="text" name="5" placeholder="П'ятий"/>
                <p>Шостий</p>
                <input type="text" name="6" placeholder="Шостий"/>
                <p>Сьомий</p>
                <input type="text" name="7" placeholder="Сьомий"/>
                <p>Восьмий</p>
                <input type="text" name="8" placeholder="Восьмий"/>
                <input type="submit" value="ok"/>
        </form>
    </body>
</html>
