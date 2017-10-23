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
                width: 500px;
            }
        </style>

        <title>JSP Page</title>
    </head>
    <body>
        <table>

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
        <table>
            <th> <a href="/AMT_Programs/home?page=<c:out value="${currentPage == 0 ? currentPage : currentPage - 1}" />" /> Prev.</th>
            <th> Page <c:out value="${currentPage}" /> </th>
            <th> <a href="/AMT_Programs/home?page=<c:out value="${currentPage + 1}" />" /> Next.</th>
        </table>
        <br>
        <form action = "generate" method="post" >
            Number to generate:<input type = "number" name = "numberToGenerate">
            <input type = "submit" value = "Generate!"><br>
        </form>

        <form action = "CRUD" method="post" id="addProgram">
            <input type="hidden" name="operation" value="add"/>
            Add a program:   <input type = "number" step="0.1" name = "version" placeholder="Version">
            <select name="language">
                <option value="CPP">C++</option>
                <option value="JAVASCRIPT">Javascript</option>
                <option value="JAVA">Java</option>
                <option value="C">C</option>
                <option value="COBOL">COBOL</option>
                <option value="PHP">PHP</option>
            </select>

            <select name="type">
                <option value="WEBAPP">Web Application</option>
                <option value="APPLICATION">Application</option>
                <option value="APPLET">Applet</option>
                <option value="GUI">GUI</option>
                <option value="SERVER">SERVER</option>
                <option value="SCRIPT">SCRIPT</option>
            </select>

            <input type = "submit" value = "Add"><br>
        </form>





        <form action = "CRUD" method="post" id="updateProgram">
            <input type="hidden" name="operation" value="update"/>
            Update a program: <input type="number" name="id" placeholder="ID">
            <input type = "number" step="0.1" name = "version" placeholder="Version">
            <select name="language">
                <option value="CPP">C++</option>
                <option value="JAVASCRIPT">Javascript</option>
                <option value="JAVA">Java</option>
                <option value="C">C</option>
                <option value="COBOL">COBOL</option>
                <option value="PHP">PHP</option>
            </select>


            <select name="type">
                <option value="WEBAPP">Web Application</option>
                <option value="APPLICATION">Application</option>
                <option value="APPLET">Applet</option>
                <option value="GUI">GUI</option>
                <option value="SERVER">SERVER</option>
                <option value="SCRIPT">SCRIPT</option>
            </select>


            <input type = "submit" value = "Update"><br>
        </form>


        <form action = "CRUD" method="post" id="deleteProgram">
            <input type="hidden" name="operation" value="delete"/>
            Delete a program: <input type = "number" name = "id" placeholder="ID">
            <input type = "submit" value = "Delete"><br>
        </form>

    </body>
</html>
