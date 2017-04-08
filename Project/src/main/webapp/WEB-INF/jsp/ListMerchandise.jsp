<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/7
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListMerchandise</title>
</head>
<body>
<%@include file="Title.jsp"%>
<table id="merchandisetable">
    <tr>
        <td>name</td>
        <td>number</td>
        <td>description</td>
    </tr>
    <c:forEach var="merchandise" items="${list}">
        <tr>
        <td>${merchandise.name}</td>
        <td>${merchandise.number}</td>
            <td>${merchandise.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
