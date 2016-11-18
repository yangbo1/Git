<!doctype html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Welcome to book seller</title>
 </head>
 <body>
  <h1><font face="黑体">You are welcome</font></h1>
  <font color="red"><s:fielderror name="error"></s:fielderror></font>
  <s:form  action="/DisplayAction_display.action" method="POST">
  <tr><td>please input your name<s:textfield  name="user.username"></s:textfield></td></tr>
  <tr><td>please input your address<s:textfield id="address" name="user.address"></s:textfield></td></tr>
  <tr><td>please input your zip<s:textfield id="zip" name="user.zip"></s:textfield></td></tr><br>
  <font face="黑体">please fill in the quantity field of the following form</font>
  <table width="500" border="1" style="border-collapse:collapse;">
	<tr>
		<td>book</td>
		<td>publisher</td>
		<td>price</td>
		<td>quantity</td>
	</tr>
	<tr>
		<td><s:textfield value="Web technology" type="hidden"  name="book[0].bookname" >Web technology</s:textfield></td>
		<td><s:textfield value="Springer press" type="hidden"  name="book[0].publisher" >Springer press</s:textfield></td>
		<td><s:textfield value="5.0" type="hidden"  name="book[0].price" >$5.0</s:textfield></td>
		<td><s:textfield id="webquantity" name="book[0].quantity"></s:textfield></td>
	</tr>
	<tr>
		<td><s:textfield value="mathematics" type="hidden"  name="book[1].bookname">mathematics</s:textfield></td>
		<td><s:textfield value="ACM pres" type="hidden" name="book[1].publisher">ACM pres</s:textfield></td>
		<td><s:textfield value="6.2" type="hidden" name="book[1].price">$6.2</s:textfield></td>
		<td><s:textfield id="mathquantity" name="book[1].quantity"></s:textfield></td>
	</tr>
	<tr>
		<td><s:textfield value="principle of OS" type="hidden"  name="book[2].bookname">principle of OS</s:textfield></td>
		<td><s:textfield value="Science press" type="hidden" name="book[2].publisher">Science press</s:textfield></td>
		<td><s:textfield value="10" type="hidden" name="book[2].price">$10</s:textfield></td>
		<td><s:textfield id="osquantity" name="book[2].quantity"></s:textfield></td>
	</tr>
	<tr>
		<td><s:textfield value="Theory of matrix" type="hidden"  name="book[3].bookname">Theory of matrix</s:textfield></td>
		<td><s:textfield value="High education press" type="hidden" name="book[3].publisher">High education press</s:textfield></td>
		<td><s:textfield value="7.8" type="hidden" name="book[3].price">$7.8</s:textfield></td>
		<td><s:textfield id="matquantity" name="book[3].quantity"></s:textfield></td>
	</tr>
  </table>
  payment method:
 <%-- <input type="radio" name="method" value="cash" checked="checked" />cash
  <input type="radio" name="method" value="cheque" />cheque
  <input type="radio" name="method" value="credit card" />credit card
  <input type="radio" name="method" value="wechat" />wechat<br>--%>
	  <s:radio name="paymethod" list="#{'cash':'cash','cheque':'cheque','credit card':'credit card','wechat':'wechat'}"></s:radio><br>
	  <s:submit name="submit" type="submit" value="提交"></s:submit>
	  <s:reset name="reset" type="reset" value="重置"></s:reset>
  </s:form>
  <br><br>
<a href="book.jsp">到实验三</a>
 </body>
</html>
