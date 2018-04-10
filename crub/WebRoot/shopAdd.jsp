<%@ page pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shopAdd.jsp' starting page</title>
  </head>
  
  <body>
  	<form action="add.shop">
  		<p>商店名称:<input type="text" name="shopName"></p>
  		<p>商店地址:<input type="text" name="shopAddress"></p>
  		<p>联系方式:<input type="text" name="contact"></p>
  		<p><input type="submit" value="提交"></p>
  	</form>
  </body>
</html>
