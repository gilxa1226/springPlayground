<%-- 
    Document   : hello
    Created on : Jul 26, 2012, 9:15:31 PM
    Author     : haller
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html>
<html>
    <head><title><fmt:message key="title"/></title></head>
    <body>
        <h1><fmt:message key="heading"/></h1>
        <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
        
        <c:forEach items="${model.products}" var="prod">
            <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
        </c:forEach>
        
    </body>
</html>
