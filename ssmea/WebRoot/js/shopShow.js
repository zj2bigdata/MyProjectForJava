	$(function(){
		initDataGrid();
	});
	
	function initDataGrid(){
		$('#dg').datagrid({
			          title: '商店详情',  //表格名称
			          iconCls: 'icon-edit',  //图标
			           width:860,   //表格宽度
			           height:'auto',   //表格高度，可指定高度，可自动
			           border:true,  //表格是否显示边框
			          url:'queryShops',   //获取表格数据时请求的地址
			           columns:[[
			             {field:'shopId',title:'商店编号',width:200,hidden:false},
			             {field:'shopName',title:'商店名称',width:200},
			             {field:'shopAddress',title:'商店地址',width:200},
			             {field:'contact',title:'联系电话',width:200}
			           ]],
			           pagination:true,//如果表格需要支持分页，必须设置该选项为true
			           pageSize:3,   //表格中每页显示的行数
			           pageList:[1,2,3],
			           rownumbers:true,   //是否显示行号
			           nowrap: false,   
			           striped: true,  //奇偶行是否使用不同的颜色
			           method:'get',   //表格数据获取方式,请求地址是上面定义的url
			           sortName: 'SHOPID',  //按照ID列的值排序
			           sortOrder: 'desc',  //使用倒序排序
			           idField: 'shopId',
			           loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
			           frozenColumns: [[  //固定在表格左侧的栏
			                       {field: 'ck', checkbox: true},
			                     ]],
			           toolbar: [{
			                     text: '添加',
			                     iconCls: 'icon-add',
			                    handler: function() {
			                    	showDialog(1);
			                     }
			                 }, '-', {
			                     text: '删除',
			                     iconCls: 'icon-cut',
			                     handler: function() {
			                    	var opts = $('#dg').datagrid('getChecked');
			                    	if(opts.length<=0){
			                    		$.messager.alert("提醒","至少要选择一条才能删除!");
			                    	}else{
			                    		for(var i=0;i<opts.length;i++){
				                    		deleteShop(opts[i]);
				                    	}
			                    	}
			                     }
			                 }, '-', {
			                     text: '修改',
			                     iconCls: 'icon-save',
			                     handler: function() {
			                    	 var opts = $('#dg').datagrid('getChecked');
			                    	 if(opts.length!=1){
			                    		 $.messager.alert("提醒","请勾选单条记录来进行修改!");
			                    	 }else{
			                    		 showDialog(2,opts[0]);
			                    	 }
			                     }
			                 }]
			         });
	}
	
	function deleteShop(shop){
		if(confirm("确认?")){
			$.ajax({
					url:"deleteShop/"+shop.shopId,
					success:function(data){
							alert("删除:"+$.parseJSON(data).result)
	      							location.reload();
					},
					error:function(){
						
					}
			});					
		}	
	}
	//展示各种窗口
	function showDialog(type,opts)
	{
		var jsp="";
		var title="";
		if(type==1){
			jsp="shopAdd.jsp";
			title="新增";
		}else{
			jsp="shopUpdate.jsp";
			title="修改";
		}
		$("<div id='div_dialog' style='padding:10px'/>").dialog({
			title : title,
			width : 850,
			height : 600,
			modal : true,
			// 注：panel组件的href属性只会引用目标文件body标签之间的内容
			href : jsp,
			buttons : [{
				text : "保存",
				iconCls : "icon-save",
				handler : function()
				{
					if(type==1){
						var param={};
	  					param.shopName=$("#shopName").val();
	  					param.shopAddress=$("#shopAddress").val();
	  					param.contact=$("#contact").val();
	  					if($("#shopName").val()==''||$("#shopAddress").val()==''||$("#contact").val()==''){
	  						 $.messager.alert("提醒","三项必填!");
	  					}else{
	  						$.ajax({
		      					url:"insertShop",
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
	  					}
						
					}else{
						var param={};
	    				param.shopId=$("#shopId").val();
	   					param.shopName=$("#shopName").val();
	   					param.shopAddress=$("#shopAddress").val();
	 					param.contact=$("#contact").val();
	 					if($("#shopName").val()==''||$("#shopAddress").val()==''||$("#contact").val()==''){
	  						 $.messager.alert("提醒","请完整填写!");
	  					}else{
	  						$.ajax({
		      					url:"updateShop",
		      					type:"post",
		      					data:param,
		      					success: function(data){
		      						alert("修改:"+$.parseJSON(data).result)
		      							location.href="shopShow.jsp";
		      						},
		      					error:	function(){
		      							alert("修改失败!");
		      						}
	  						});	
	  					}	
					}
				}
			}, {
				text : "关闭",
				iconCls : "icon-cancel",
				handler : function()
				{
					$("#div_dialog").dialog("close");
				}
			}],
			onLoad : function()
			{		
           	 		if(opts!=null){
           	 		$("#shopId").val(opts.shopId)
           	 		$("#shopName").val(opts.shopName);
 					$("#shopAddress").val(opts.shopAddress);
 					$("#contact").val(opts.contact);
           	 		}
			},
			onClose : function()
			{
				$(this).dialog("destroy");
			}
		});
	}