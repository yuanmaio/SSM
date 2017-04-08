<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/12
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
<form action="<%=request.getContextPath()%>/user/login" method="post">
    <div class="col-md-12">
        <div class="form-group">
            <label for="username">账号</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="Account">
        </div>
        <div class="form-group">
            <label for="password">密码</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="PassWord">
        </div>
        <div id="login-button" class="form-group">
            <button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
        </div>
    </div>
</form></body>
</html>
