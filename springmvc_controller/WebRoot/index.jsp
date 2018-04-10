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
     <a href="service01">service01</a><br/>
     <a href="service02">service02</a><br/>
     <a href="service03">service03</a><br/>
     <a href="service04">service04</a><br/>
     <a href="service05">service05</a><br/>
  </body>
</html>
