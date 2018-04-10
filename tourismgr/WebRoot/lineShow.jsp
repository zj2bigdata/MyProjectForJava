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
							url : "find.line",
							type : "post",
							success : function(data){
								showData(data);
							},
							error : function(){
								alert("查询失败!")
							}
						});
				
			})	
			
			function showData(lines){
				var json_lines=JSON.parse(lines);
				var html=[ ];
				html.push('<table class="gridtable">');
				html.push('<tr><th>线路编号</th><th>线路名</th><th>行程天数</th><th>价格</th><th>交通工具</th><th>宾馆标准</th><th>修改</th></th><th>修改</th><th>删除</th></tr>')
				for(var i=0;i<json_lines.length;i++){
					html.push('<tr>'+'<td>'+json_lines[i].lineID+'</td>');
					html.push('<td>'+json_lines[i].lineName+'</td>');
					html.push('<td>'+json_lines[i].days+'</td>');
					html.push('<td>'+json_lines[i].price+'</td>');
					html.push('<td>'+json_lines[i].vehicle+'</td>');
					html.push('<td>'+json_lines[i].hotel+'</td>');
					html.push('<td>'+json_lines[i].hasMeal+'</td>');
					html.push('<td><a href="lineUpdate.jsp?lineID='+json_lines[i].lineID+'">修改</a></td>');
					html.push('<td><a href="javascript:void(0)" onclick="sel('+json_lines[i].lineID+')">删除</a></td></tr>');
				}
				html.push('</table>');
				var js=html.join(' ');
				document.getElementById("idv").innerHTML=js;
			}
			function sel(lineID){
					if(confirm("确认?")){
						var line={};
						line.lineID=lineID;
						$.ajax({
								url:"delete.line",
								type:"post",
								data:line,
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
			<a href="lineAdd.jsp">增加</a>
         	<div id="idv"></div>
	</body>
</html>