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
	<h3>号源列表</h3>
	<button type="button" onclick="location.href='/sourcenumbers/saveUI'" class="btn btn-warning btn-sm">添加</button>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>号源编号</th>
				<th>对应项目</th>
				<th>日期</th>
				<th>上/下午</th>
				<th>号源上限</th>
				<th>余号</th>
				<th>价格</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${slist}" var="s">
				<tr>
					<td>${s.sourceid}</td>
					<td>${s.project.projectname }</td>
					<td><fmt:formatDate value="${s.sourcetime}" pattern="yyyy-MM-dd"/></td>
					<td>${s.sourceampm }</td>
					<td>${s.sourcenumup }</td>
					<td>${s.surplusnum }</td>
					<td>${s.sourceprice}</td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm" value="${s.sourceid }">删除</button>
						|
						<button type="button" name="update" class="btn btn-warning btn-sm" value="${s.sourceid }">修改</button>
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
					window.location="/sourcenumbers/delete/"+$(this).val();
				}
			});
			$(":button[name=update]").click(function () {
				window.location="/sourcenumbers/findOne/"+$(this).val();
			});
		});
	</script>
</body>
</html>