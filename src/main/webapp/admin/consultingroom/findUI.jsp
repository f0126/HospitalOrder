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
	<h3>诊室列表</h3>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>诊室编号</th>
				<th>医生编号</th>
				<th>诊室名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${consultingroomList}" var="c">
				<tr>
					<td>${c.consroomId }</td>
					<td>${c.doctorId }</td>
					<td>${c.consroomName }</td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm" value="${c.consroomId }">删除</button>
						|
						<button type="button" name="update" class="btn btn-warning btn-sm" value="${c.consroomId }">修改</button>
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
					window.location="/consultingroom/delete/"+$(this).val();
				}
			});
			$(":button[name=update]").click(function () {
				window.location="/consultingroom/findOne/"+$(this).val();
			});
			
		});
	</script>
</body>
</html>