<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/zTree/css/metroStyle/metroStyle.css"/>
<script type="text/javascript" src="/zTree/js/jquery.ztree.all.min.js"></script>
<script src="https://cdn.bootcss.com/layer/2.3/layer.js"></script>
<style type="text/css">
	.ztree *{
		font-size: 20px;
	}
</style>
</head>
<body>
	<h3>为${role.rname }分配权限</h3>
	<ul id="ztree" class="ztree"></ul><br/>
	<button type="button" class="btn btn-success">确认分配</button>
	<script type="text/javascript">
		$(function () {
			$("button:eq(0)").click(function () {
				var checkedNodes=ztree.getCheckedNodes();
				var pids=[];
				var rid=${role.rid};
				//将得到选定的节点的id放入数组中
				for(var i=0;i<checkedNodes.length;i++){
					pids.push(checkedNodes[i].pid);
				}
				window.location="/roles/dispensePermissions?rid="+rid+"&pids="+pids;
				layer.msg("授权成功");
			});
			var setting={
				data:{
					simpleData:{
						enable:true,
						pIdKey:"parentid",
						idKey:"pid"
					},
					key:{
						name:"pname"
					}
				},
				check:{
					enable:true
				},
			};
			var nodes=${treejson};
			var ztree = $.fn.zTree.init($("#ztree"), setting, nodes);
			ztree.expandAll(true);
			var hasedPermissionsJson=${hasedPermissionsJson};
			var rootnodes=ztree.getNodes();
			var allNodes=ztree.transformToArray(rootnodes);
			
			/* 遍历的到的所有节点，判断是否和以有权限id相等 */
			for(var i=0;i<allNodes.length;i++){
				if(exists(hasedPermissionsJson,allNodes[i].pid)){
					ztree.checkNode(allNodes[i], true, false);
				}
			}
			
			function exists(arr, pid) {
				for(var i = 0; i < arr.length; i++) {
					if(arr[i].pid == pid) {
						return true;
					}
				}
				return false;
			}
		});
	</script>
</body>
</html>