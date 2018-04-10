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
    <script>
    	window.onload=function(){
    		var shop='${shop}';
    		var s=JSON.parse(shop);
    		var ips=document.getElementsByTagName('input');
    		ips[0].value=s.shopId;
    		ips[1].placeholder=s.shopName;
    		ips[2].placeholder=s.shopAddress;
    		ips[3].placeholder=s.contact;
    	}
    </script>
  </head>
  
  <body>
   	<form action="update.shop">
   		<p>商店编号:<input type="text" name="shopId"  readonly="readonly" ></p>
  		<p>商店名称:<input type="text" name="shopName" ></p>
  		<p>商店地址:<input type="text" name="shopAddress" ></p>
  		<p>联系方式:<input type="text" name="contact" ></p>
  		<p><input type="submit" value="提交"></p>
  	</form>
  </body>
</html>
