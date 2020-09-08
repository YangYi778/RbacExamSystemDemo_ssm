<%--
  Created by IntelliJ IDEA.
  User: 让鲁班举高高
  Date: 2020/9/6
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="2px">
        <tr>
            <td>商品id</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品数量</td>
        </tr>
        <c:forEach items="${list}" var="good">
            <tr>
                <td>${good.id}</td>
                <td>${good.name}</td>
                <td>${good.price}</td>
                <td>${good.num}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
