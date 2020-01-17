<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>护士列表</h3>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>护士编号</th>
				<th>护士名称</th>
				<th>级别</th>
				<th>护士照片</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${NurseList}" var="n">
				<tr>
					<td>${n.nurseid}</td>
					<td>${n.nursename}</td>
					<td>${n.nurselevel}</td>
					<td><img src="/admin/images/nursesPhoto/${n.nursephoto}" width="100px" height="100px"/></td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm"
							value="${n.nurseid}">删除</button> |
						<button type="button" name="update" class="btn btn-warning btn-sm"
							value="${n.nurseid }">修改</button> |
						<button type="button" name="dispense"
							class="btn btn-success btn-sm" value="${n.nurseid }">分配角色</button>
					</td>
				</tr>
			</j:forEach>
		</tbody>
	</table>
	<script type="text/javascript">
		$(function() {
			$(":button[name=delete]").click(function() {
				var flg = window.confirm("请确认是否删除？");
				if (flg) {
					window.location = "/nurses/delete/" + $(this).val();
				}
			});
			$(":button[name=update]").click(function() {
				
				window.location = "/nurses/findOne/" + $(this).val();
			});
			$(":button[name=dispense]").click(function() {
				window.location = "/nurses/dispenseRoleUI/" + $(this).val();
			});
		});
	</script>

</body>
</html>