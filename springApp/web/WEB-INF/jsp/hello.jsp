<%-- 
    Document   : hello
    Created on : Jul 26, 2012, 9:15:31 PM
    Author     : haller
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html>
<html>
    <head><title>Hello :: Spring Application</title></head>
    <body>
        <h1>Hello - Spring Application</h1>
        <p>Greetings, it is now <c:out value="${now}"/></p>
    </body>
</html>
