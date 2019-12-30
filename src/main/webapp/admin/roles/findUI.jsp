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
	<h3>角色列表</h3>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>角色编号</th>
				<th>角色名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${rolesList}" var="r">
				<tr>
					<td>${r.rid }</td>
					<td>${r.rname }</td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm" value="${r.rid }">删除</button>
						|
						<button type="button" name="update" class="btn btn-warning btn-sm" value="${r.rid }">修改</button>
						|
						<button type="button" name="dispense" class="btn btn-success btn-sm" value="${r.rid }">分配权限</button>
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
					window.location="/roles/delete/"+$(this).val();
				}
			});
			$(":button[name=update]").click(function () {
				window.location="/roles/findOne/"+$(this).val();
			});
			$(":button[name=dispense]").click(function () {
				window.location="/roles/dispensePermissionsUI/"+$(this).val();
			});
		});
	</script>
</body>
</html>