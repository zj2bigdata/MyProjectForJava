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
     <script type="text/javascript" src="js/jquery.min.js"></script>
     <script type="text/javascript">
     	function responseString(){
 			var json='{"name":"zj","id":"1"}';
     		$.ajax({
     			url:"responseString4",
     			type:"post",
     			data:json,
     			contentType:"application/json",
     			success:function(data){
     				console.log(data[0].name);
     			},
     			error:function(){
     			
     			}
     		
     		});
     	}
     </script>
  </head>
  <body>
  		<button id="btn" onclick="responseString()">提交</button>
  	
  </body>
</html>
