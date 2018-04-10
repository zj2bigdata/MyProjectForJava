<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>商店展示页面</title>
		  <link type="text/css" rel="stylesheet" href="/ssma/css/table.css" />
		  <script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$.ajax({
							url : "queryShops",
							success : function(data){
								showData(data);
							},
							error : function(){
								alert("查询失败!")
							}
						});
				
			})	
			
			function showData(shops){
				var html=[ ];
				html.push('<table class="gridtable">');
				html.push('<tr><th>商店编号</th><th>商店名称</th><th>商店地址</th><th>联系方式</th><th>修改</th><th>删除</th></tr>')
				for(var i=0;i<shops.length;i++){
					html.push('<tr>'+'<td>'+shops[i].shopId+'</td>');
					html.push('<td>'+shops[i].shopName+'</td>');
					html.push('<td>'+shops[i].shopAddress+'</td>');
					html.push('<td>'+shops[i].contact+'</td>');
					html.push('<td><a href="shopUpdate.jsp?shopId='+shops[i].shopId+'">修改</a></td>');
					html.push('<td><a href="javascript:void(0)" onclick="sel('+shops[i].shopId+')">删除</a></td></tr>');
				}
				html.push('</table>');
				var js=html.join(' ');
				document.getElementById("idv").innerHTML=js;
			}
			function sel(shopId){
					if(confirm("确认?")){
						$.ajax({
								url:"deleteShop/"+shopId,
								success:function(data){
										var data=$.parseJSON(data);
		      							if(data.result){
		      								alert("删除成功!");
		      								location.reload();
		      							}
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