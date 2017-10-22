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
        <style>
            table{
                margin-left:auto; 
                margin-right:auto;
            }
        </style>

        <title>JSP Page</title>
    </head>
    <body>
        <table style="width:100%">
            <tr>
                <th>Program ID</th>
                <th>Language</th>
                <th>Type</th>
                <th>Version</th>
            </tr>
            <c:forEach items="${listOfPrograms}" var="program">
                <tr>
                    <td>${program.getId()}</td>
                    <td>${program.getLanguage().toString()}</td>
                    <td>${program.getProgramType().toString()}</td>
                    <td>${program.getVersion()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
