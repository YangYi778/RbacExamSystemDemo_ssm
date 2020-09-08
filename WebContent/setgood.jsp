<%--
  Created by IntelliJ IDEA.
  User: 让鲁班举高高
  Date: 2020/9/6
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="good/updateById" method="post">
        商品id：<input type="text" name="id" /><br>
        商品名：<input type="text" name="name" /><br>
        商品价格：<input type="text" name="price" /><br>
        商品数量：<input type="text" name="num" /><br>
        <input type="submit" value="修改" />
    </form>
</body>
</html>
