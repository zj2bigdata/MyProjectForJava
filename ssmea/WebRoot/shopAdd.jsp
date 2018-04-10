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
    	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.5.4/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="jquery-easyui-1.5.4/themes/icon.css">
		<script type="text/javascript" src="jquery-easyui-1.5.4/jquery.min.js"></script>
		<script type="text/javascript" src="jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
  </head>
  
  <body>
  		<p>商店名称:<input class="easyui-textbox" id="shopName" data-options="required:true"></p>
  		<p>商店地址:<input class="easyui-textbox" data-options="required:true" id="shopAddress"></p>
  		<p>联系方式:<input  class="easyui-textbox" data-options="required:true" id="contact"></p>
  </body>
</html>
