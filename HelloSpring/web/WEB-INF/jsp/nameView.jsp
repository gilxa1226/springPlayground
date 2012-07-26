<%-- 
    Document   : nameView
    Created on : Jul 26, 2012, 3:06:48 PM
    Author     : michael.j.haller
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter your name:</title>
    </head>
    <body>
        <h1>
            <spring:nestedPath path="name">
                <form action="" method="post">
                    Name:
                    <spring:bind path="value">
                        <input type="text" name="${status.expression}" value="${status.value}">
                    </spring:bind>
                    <input type="submit" value="OK">
                </form>
            </spring:nestedPath>
        </h1>
    </body>
</html>
