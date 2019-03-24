<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--<%@ page isELIgnored="false" contentType = "text/html; charset=UTF-8" %>--%>

    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
    </head>
    <body>

        <h2> ${list.name} </h2>
            <table>
                <tr>
                    <th>Name</th>
                    <th>Position</th>
                    <th>worktype</th>
                    <th>store</th>
                    <th>id</th>
                    <th>regdate</th>
                </tr>
                <c:forEach var="list" items="${list}">
                    <tr>
                        <td>${list.name}</td>
                        <td>${list.position}</td>
                        <td>${list.worktype}</td>
                        <td>${list.store}</td>
                        <td>${list.id}</td>
                        <td>${list.regdate}</td>
                    </tr>
                </c:forEach>

            </table>
    </body>
    </html>
