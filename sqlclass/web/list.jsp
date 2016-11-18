<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
	 <script type="text/javascript">
		 function addFlight(){
			 document.Form1.action = "/FlightAction_add.action";
		 }
		 function listAll(){
			 document.Form2.action="/FlightAction_home.action"
		 }
	 </script>
 </head>
 <body>
 <h1 align="center">航班信息</h1>
 <s:form action="/FlightAction_home.action" method="POST" name="Form1" id="Form1">
	 <h4 align="right"><a href="home.jsp">退出</a></h4>
 <div style = "text-align:right;"><s:submit value="-添加-" onclick="addFlight()"></s:submit></div>
	 <table cellspacing="0" cellpadding="1" rules="all"
			bordercolor="gray" border="1" id="DataGrid1"
			style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
		 <tr
				 style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #00ffff">

			 <td align="center" width="6%">
				 航班号
			 </td>
			 <td align="center" width="10%">
				 起点
			 </td>
			 <td align="center" width="10%">
				 终点
			 </td>
			 <td align="center" width="15%">
				 日期
			 </td>
			 <td align="center" width="7%">
				 起飞时刻
			 </td>
			 <td align="center" width="7%">
				 到达时刻
			 </td>
			 <td align="center" width="6%">
				 剩余座位数
			 </td>
			 <td align="center" width="6%">
				 票价
			 </td>
			 <td align="center" width="5%">
				 折扣票数
			 </td>
			 <td align="center" width="5%">
				 折扣率
			 </td>
			 <td align="center" width="15%">
				 航空公司
			 </td>
			 <td width="4%" align="center">
				 编辑
			 </td>
			 <td width="4%" align="center">
				 删除
			 </td>
		 </tr>
		 <s:if test="#request.flightList">
			 <s:iterator value="%{#flightList}">
			 <tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR:#00ccff">
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					<s:property value="number"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					<s:property value="start"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="end"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="date"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="starttime"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="endtime"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="seats"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="price"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="discountvote"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="discountrate"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <s:property value="company"/>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <a href="FlightAction_edit.action?fid=<s:property value="fid"/>">
						 编辑
					 </a>
				 </td>
				 <td style="CURSOR: hand; HEIGHT: 22px" align="center">
					 <a href="FlightAction_delete.action?fid=<s:property value="fid"/>">
						 删除
					 </a>
				 </td>
			 </tr>
			 </s:iterator>
		 </s:if>
	 </table>
 </s:form>
 <hr>
 <s:form name="Form2" id="Form2" align="center" action="/FlightAction_find.action" method="POST">
 <font size="5">航班号</font>&nbsp<s:textfield name="number"></s:textfield><br><br><br>
 &nbsp&nbsp&nbsp&nbsp&nbsp<font size="5">日期</font>&nbsp
		 <s:select list="{'2016','2017','2018','2019','2020'}" name="year" headerValue="--选择年--" >
		 </s:select>年
		 <s:select  list="{'1','2','3','4','5','6','7','8','9','10','11','12'}" name="month" headerValue="--选择月--">
		 </s:select>月
		 <s:select list="{'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31'}" name="day" headerValue="--选择日--">
		 </s:select>日<br><br><br>
	 <s:submit value="查询"/>&nbsp&nbsp&nbsp&nbsp&nbsp<s:submit value="查看所有" onclick="listAll()"/>
</s:form>
 </body>

</html>
