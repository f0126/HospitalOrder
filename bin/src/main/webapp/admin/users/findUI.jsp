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
	<h3>用户列表</h3>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>用户编号</th>
				<th>用户名称</th>
				<th>用户密码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${userList}" var="u">
				<tr>
					<td>${u.uid }</td>
					<td>${u.username }</td>
					<td>${u.password }</td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm" value="${u.uid }">删除</button>
						|
						<button type="button" name="update" class="btn btn-warning btn-sm" value="${u.uid }">修改</button>
						|
						<button type="button" name="dispense" class="btn btn-success btn-sm" value="${u.uid }">分配角色</button>
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
					window.location="/users/delete/"+$(this).val();
				}
			});
			$(":button[name=update]").click(function () {
				window.location="/users/findOne/"+$(this).val();
			});
			$(":button[name=dispense]").click(function () {
				window.location="/users/dispenseRoleUI/"+$(this).val();
			});
		});
	</script>
</body>
</html>