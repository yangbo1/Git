<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 杨波
  Date: 2016/11/11
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询界面</title>
</head>
<body>
<font color="black">please input customer name</font>
<s:form action="/UserAction_find.action" method="POST">
    <s:textfield name="user.username"></s:textfield>
    <s:submit name="submit" value="查询"></s:submit>
    <table  width="500" border="1" style="border-collapse:collapse;">
        <tr>
            <td>name</td>
            <td>book</td>
            <td>publisher</td>
            <td>quantity</td>
        </tr>
        <s:if test="#request.result">
        <s:iterator value="result">
        <tr>
            <td><s:property value="%{username}"/></td>
            <td><s:property value="%{bookname}"/></td>
            <td><s:property value="%{publisher}"/></td>
            <td><s:property value="%{quantity}"/></td>
        </tr>
        </s:iterator>
        </s:if>
         
            <br><br><br><b>Your total price:</b><font color="red"><s:property value="%{#request.totalprice}"/></font>
    </table>
</s:form>
<a href="book.jsp">返回首页</a>
</body>
</html>
