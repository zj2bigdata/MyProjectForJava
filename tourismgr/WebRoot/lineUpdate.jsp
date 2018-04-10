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
	    			$("#btn").click(function(){
	    				var param={};
	    				param.lineID=${param.lineID};
	   					param.lineName=$("#lineName").val();
	   					param.days=$("#days").val();
	 					param.price=$("#price").val();
	 					param.vehicle=$("#vehicle").val();
	 					param.hotel=$("#hotel").val();
	 					param.hasMeal=$("input[name='hasMeal']:checked").val();
	    				$.ajax({
			      					url:"update.line",
			      					type:"post",
			      					data:param,
			      					success: function(data){
											alert($.parseJSON(data).result?"修改成功!":"修改失败!")
			      							location.href="lineShow.jsp";
			      						},
			      					error:	function(){
			      							alert("增加失败!");
			      						}
			      				});	
	    			
	    		});	
    		})
    		window.onload=function(){
    				var pr={};
	    			pr.lineID=${param.lineID};
    			$.ajax({
			      					url:"toUpdate.line",
			      					type:"post",
			      					data:pr,
			      					success: function(data){
			      						var json=$.parseJSON(data);
			      						$("#lineID").val(json.lineID);
			      						$("#lineName").val(json.lineName);
			      						$("#days").val(json.days);
			      						$("#price").val(json.price);
	 									$("#vehicle").val(json.vehicle);
	 									$("#hotel").val(json.hotel);
	 									var sel=json.hasMeal;
	 									<!-- 无法比较json.hasMeal和"是"-->
		 									if(sel.trim()=="是"){
		 										$("#yes").attr("checked","1");
		 									}else{
		 									
		 										$("#no").attr("checked","1");
		 									}
			      						},
			      					error:	function(){
			      							alert("增加失败!");
			      						}
			      				});
    		}
    </script>
  </head>
  
  <body>
   		<p>商店编号:<input type="text" id="lineID"  readonly="readonly" ></p>
  		<p>线路名:<input type="text" id="lineName"></p>
  		<p>行程天数:<input type="text" id="days"></p>
  		<p>价格:<input type="text" id="price"></p>
  		<p>交通工具:<input type="text" id="vehicle"></p>
  		<p>宾馆标准:<input type="text" id="hotel"></p>
  		<p>是否含餐:是:<input type="radio" name="hasMeal" value="是" id="yes">否:<input type="radio" name="hasMeal" value="否" id="no"></p>
  		<p><button id="btn">提交</button></p>
  </body>
</html>
