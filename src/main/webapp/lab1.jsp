<%-- 
    Document   : lab1
    Created on : 8 квіт. 2021, 21:50:04
    Author     : Mark
--%>

<%@page import="knu.fit.ist.ta.LabFirstClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Lab №1</h1>
        <p>Muzyka Mark IP-12</p>
        <%! LabFirstClass Val = new LabFirstClass();%>

        <%
            int x = Val.getVal();
            x += 5;
            x /= 5;
        %>
        <p>15 divide by 5 equal to <%=x%></p>
        <form action="index.jsp">
            <input type="submit" value="Home">
        </form>
    
</html>
