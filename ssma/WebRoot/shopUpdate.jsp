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
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script>
    		$(function(){
    				$.ajax({
	      					url:"findById/"+${param.shopId},
	      					success: function(data){
	      						$("#shopId").val(data.shopId);
	      						$("#shopName").val(data.shopName);
	      						$("#shopAddress").val(data.shopAddress);
	      						$("#contact").val(data.contact);
	      						},
	      					error:	function(){
	      							alert("查询失败!");
	      						}
	      				});
    				
    		
	    			$("#btn").click(function(){
	    				var param={};
	    				param.shopId=${param.shopId};
	   					param.shopName=$("#shopName").val();
	   					param.shopAddress=$("#shopAddress").val();
	 					param.contact=$("#contact").val();
	    				$.ajax({
			      					url:"updateShop",
			      					type:"post",
			      					data:param,
			      					success: function(data){
											var data=$.parseJSON(data);
			      							if(data.result){
			      								alert("修改成功!");
			      								location.href="shopShow.jsp";
			      							}
			      						},
			      					error:	function(){
			      							alert("修改失败!");
			      						}
			      				});	
	    			
	    		});	
    		})
    </script>
  </head>
  
  <body>
   		<p>商店编号:<input type="text" id="shopId"  readonly="readonly" ></p>
  		<p>商店名称:<input type="text" id="shopName" ></p>
  		<p>商店地址:<input type="text" id="shopAddress" ></p>
  		<p>联系方式:<input type="text" id="contact" ></p>
  		<p><button id="btn">提交</button></p>
  </body>
</html>
