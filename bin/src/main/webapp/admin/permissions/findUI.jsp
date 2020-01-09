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
<style type="text/css">
	.ztree *{
		font-size: 20px;
	}
</style>
</head>
<body>
	<h3>权限列表</h3>
	<ul id="ztree" class="ztree"></ul>
	<script type="text/javascript">
		$(function () {
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
				edit:{
					enable:true
				},
				callback:{
					beforeRemove: function(treeId,treeNode){
						if(treeNode.isParent){
							alert("不能直接删除父节点");
							return false;
						}
						var flg=window.confirm("确认是否删除");
						return flg;
					},
					onRemove: function (event,treeId,node) {
						window.location="/permissions/delete/"+node.pid;
					},
					onRename: function (event,treeId,node) {
						window.location="/permissions/update?pid="+node.pid+"&pname="+node.pname;
					}
				},
			};
			var nodes=${treejson};
			var ztree = $.fn.zTree.init($("#ztree"), setting, nodes);
			ztree.expandAll(true);
		});
	</script>
</body>
</html>