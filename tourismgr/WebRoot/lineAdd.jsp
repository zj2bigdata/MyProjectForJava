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
	      					param. lineName=$("#lineName").val();
	      					param.days=$("#days").val();
	      					param.price=$("#price").val();
	      					param.vehicle=$("#vehicle").val();
	      					param.hotel=$("#hotel").val();
	      					param.hasMeal=$("input:radio[name='hasMeal']:checked").val();
	      					$.ajax({
		      					url:"add.line",
		      					type:"post",
		      					data:param,
		      					success: function(data){
		      						alert($.parseJSON(data).result?"新增成功!":"新增失败!")
		      							location.href="lineShow.jsp";
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
  		<p>线路名:<input type="text" id="lineName"></p>
  		<p>行程天数:<input type="text" id="days"></p>
  		<p>价格:<input type="text" id="price"></p>
  		<p>交通工具:<input type="text" id="vehicle"></p>
  		<p>宾馆标准:<input type="text" id="hotel"></p>
  		<p>是否含餐:是:<input type="radio" name="hasMeal" value="是">否:<input type="radio" name="hasMeal" value="否"></p>
  		<p><button id="btn">提交</button></p>
  </body>
</html>
