<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 杨波
  Date: 2016/11/13
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:property value="user.username"/><br>
<s:property value="user.address"/><br>
<s:property value="user.zip"/><br>
    <table  width="500" border="1" style="border-collapse:collapse;">
        <tr>
            <td>bookname</td>
            <td>publisher</td>
            <td>price</td>
            <td>quantity</td>
        </tr>
<s:if test="#request.book">
    <s:iterator value="book">
        <tr>
            <td><s:property value="bookname"></s:property></td>
            <td><s:property value="publisher"></s:property></td>
            <td><s:property value="price"></s:property></td>
            <td><s:property value="quantity"></s:property></td>
        </tr>
    </s:iterator>
</s:if>
        <font color="aqua">totalcast:</font><font color="red">$<s:property value="#request.totalcast"/></font>
    </table>
<font color="#ff8c00"><s:property value="user.username"/></font>has bought<font color="#ff8c00"><s:property value="#request.total"/></font>books<br><br>
<font color="#ff8c00"><s:property value="user.username"/></font>paid<font color="#ff8c00"><s:property value="#request.totalcast"/></font><br><br>
paid by<font color="#ff8c00"><s:property value="#request.paymethod"/></font>

<br><br><br>
<font color="#ff8c00">已在d盘根目录下生成文件！</font>
<br><br>
<a href="book2.jsp">返回</a>
</body>
</html>
