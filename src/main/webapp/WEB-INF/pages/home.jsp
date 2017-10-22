<%-- 
    Document   : home
    Created on : Oct 22, 2017, 7:43:09 PM
    Author     : Eddie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Programs: </h1>
         <c:forEach items="${listOfPrograms}" var="program">
             <h1> ${program}.getLanguage() </h1>
         </c:forEach>
    </body>
</html>
