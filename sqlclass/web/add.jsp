<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 杨波
  Date: 2016/11/16
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="/FlightAction_save.action" method="POST">
    <table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
        <tr>
            <td class="ta_01" align="center" bgColor="#afd1f3" colSpan="2"
                height="26">
                <strong><STRONG>添加航班</STRONG>
                </strong>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                航班号：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="number"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                起点：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="start"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                终点：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="end"></s:textfield>
            </td>
        </tr>
        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                日期：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="date"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                起飞时刻：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="starttime"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                到达时刻：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="endtime"></s:textfield>
            </td>
        </tr>
        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                剩余座位数：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="seats"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                票价：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="price"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                折扣票数：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="discountvote"></s:textfield>
            </td>
        </tr>
        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                折扣率：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="discountrate"></s:textfield>
            </td>
        </tr>

        <tr>
            <td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
                航空公司：
            </td>
            <td class="ta_01" bgColor="#ffffff" width="82%">
                <s:textfield name="company"></s:textfield>
            </td>
        </tr>


    </table>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <%--<input type="submit" value="确定" />--%>
    <s:submit value="确定"></s:submit>
    <FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
    <%--<input type="button" value="重置">--%>
    <s:reset value="重置"></s:reset>
    <FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT><br>
</s:form>
</body>
</html>
