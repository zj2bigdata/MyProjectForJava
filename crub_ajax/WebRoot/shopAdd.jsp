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
      <script type="text/javascript" src="js/jquery.min.js"></script>
      <script type="text/javascript">
      		$(function(){
      				$("#btn").click(function(){
	      					var param={};
	      					param. shopName=$("#shopName").val();
	      					param.shopAddress=$("#shopAddress").val();
	      					param.contact=$("#contact").val();
	      					
	      					$.ajax({
		      					url:"add.shop",
		      					type:"post",
		      					data:param,
		      					success: function(data){
		      						alert("新增:"+$.parseJSON(data).result)
		      							location.href="shopShow.jsp";
		      						},
		      					error:	function(){
		      							alert("增加失败!");
		      						}
		      				});
      				});
      		})
      </script>
  </head>
  
  <body>
  		<p>商店名称:<input type="text" id="shopName"></p>
  		<p>商店地址:<input type="text" id="shopAddress"></p>
  		<p>联系方式:<input type="text" id="contact"></p>
  		<p><button id="btn">提交</button></p>
  </body>
</html>
