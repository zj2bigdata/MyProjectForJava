<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
     <meta charset="utf-8">
  </head>
  
  <body>
     <a href="service01?shopId=10">service01</a><br/>
     <a href="service02?shopId=12">service02</a><br/>
     <a href="service03?shopId=10&shopId=12&shopId=13">service03</a><br/>
      <a href="service04?shopId=1&shopName=wode&shopAddress=nide&contact=123123">service04</a><br/>
       <a href="service05?list=1,2,3">service05</a><br/>
       <a href="service06?shopId=1&shopName=wode&shopAddress=nide&contact=123123">service06</a><br/>
  </body>
</html>
