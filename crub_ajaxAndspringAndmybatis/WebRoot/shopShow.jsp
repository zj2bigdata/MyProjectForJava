<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>商店展示页面</title>
		  <link type="text/css" rel="stylesheet" href="table.css" />
		  <script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$.ajax({
							url : "find.shop",
							type : "post",
							success : function(data){
								showData(data);
							},
							error : function(){
								alert("查询失败!")
							}
						});
				
			})	
			
			function showData(shops){
				var json_shops=JSON.parse(shops);
				var html=[ ];
				html.push('<table class="gridtable">');
				html.push('<tr><th>商店编号</th><th>商店名称</th><th>商店地址</th><th>联系方式</th><th>修改</th><th>删除</th></tr>')
				for(var i=0;i<json_shops.length;i++){
					html.push('<tr>'+'<td>'+json_shops[i].shopId+'</td>');
					html.push('<td>'+json_shops[i].shopName+'</td>');
					html.push('<td>'+json_shops[i].shopAddress+'</td>');
					html.push('<td>'+json_shops[i].contact+'</td>');
					html.push('<td><a href="shopUpdate.jsp?shopId='+json_shops[i].shopId+'">修改</a></td>');
					html.push('<td><a href="javascript:void(0)" onclick="sel('+json_shops[i].shopId+')">删除</a></td></tr>');
				}
				html.push('</table>');
				var js=html.join(' ');
				document.getElementById("idv").innerHTML=js;
			}
			function sel(shopId){
					if(confirm("确认?")){
						var shop={};
						shop.shopId=shopId;
						$.ajax({
								url:"delete.shop",
								type:"post",
								data:shop,
								success:function(data){
										alert($.parseJSON(data).result?"删除成功!":"删除失败!")
				      					location.reload();
								},
								error:function(){
									
								}
						});					
					}	
			}
		</script>
	</head>
	<body>
			<a href="shopAdd.jsp">增加</a>
         	<div id="idv"></div>
	</body>
</html>