<%-- 
    Document   : mulproblemView
    Created on : Oct 16, 2020, 2:11:16 PM
    Author     : Live-
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Lab 2</title>
        <style>
            table {
                width: 20%;
                text-align: center;
            }
            table,td,th {
                height: 25px;
                font-size: 1.2em ;
            }
        </style>
    </head>
    <body>
        <h1>Practice: Multiplication Problem</h1>
        <table>
            <c:forEach var="i" begin="0" end="9">

                <tr>
                    <td> ${i + 1} </td>
                    <td> ${num1[i]} </td>
                    <td> x </td>
                    <td> ${num2[i]} </td>
                    <td>=</td>
                    <td>______</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
