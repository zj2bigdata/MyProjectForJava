<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'shopUpdate.jsp' starting page</title>
    
  </head>
  <body>
   		<p>商店编号:<input type="text" id="shopId"  readonly="readonly" disabled="disabled"></p>
  		<p>商店名称:<input type="text" id="shopName" ></p>
  		<p>商店地址:<input type="text" id="shopAddress" ></p>
  		<p>联系方式:<input type="text" id="contact" ></p>
  </body>
</html>
