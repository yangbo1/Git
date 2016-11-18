<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: 杨波
  Date: 2016/11/15
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <title>Document</title>
    <style type="text/css">
        .div1{
            margin:0 auto;width:500px;height:300px;margin-top:100px;
        }
        .div2{
            padding:0 auto;width:300px;height:200px;padding-top:60px;padding-left:30px;
        }
    </style>
</head>
<body>
<div class="div1">
    <font size="8">请输入用户信息</font>
    <font color="#00ccff"><s:fielderror name="error"/></font>
    <div class="div2">
        <s:form action="/FlightAction_login.action" method="POST">
            <font size="5">用户名</font>&nbsp&nbsp&nbsp
            <%--<input type="text" size="14" name="username" /><br><br>--%>
            <s:textfield size="14" name="username"></s:textfield><br><br>
            <font size="5">密&nbsp码</font>&nbsp&nbsp&nbsp
            <%--<input type="password" size="14" name="password" /><br><br><br>--%>
            <s:password size="14" name="password"></s:password><br><br><br>
            &nbsp&nbsp
            <%--<input type="submit" value="确定"/>&nbsp&nbsp&nbsp&nbsp--%>
            <s:submit value="确定"></s:submit>&nbsp&nbsp&nbsp&nbsp
            <%--<input type="button" value="取消"/>--%>
            <s:reset value="取消"></s:reset>
        </s:form>
    </div>
</div>
</body>
</html>