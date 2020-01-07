<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>项目列表</h3>
	<button type="button" onclick="location.href='/admin/projects/saveUI.jsp'" class="btn btn-warning btn-sm">添加</button>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>项目编号</th>
				<th>项目名称</th>
				<th>项目价格</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${plist}" var="p">
				<tr>
					<td>${p.projectid}</td>
					<td>${p.projectname }</td>
					<td>${p.projectidprice}</td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm" value="${p.projectid}">删除</button>
						|
						<button type="button" name="update" class="btn btn-warning btn-sm" value="${p.projectid}">修改</button>
					</td>
				</tr>
			</j:forEach>
		</tbody>
	</table>
	<script type="text/javascript">
		$(function () {
			$(":button[name=delete]").click(function () {
				var flg=window.confirm("请确认是否删除？");
				if(flg){
					window.location="/projects/delete/"+$(this).val();
				}
			});
			$(":button[name=update]").click(function () {
				window.location="/projects/findOne/"+$(this).val();
			});
		});
	</script>
</body>
</html>