<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1 class="text-center">医生概览</h1>
<table class="table table-striped table-bordered table-hover table-condensed">
	<tr>
		<td>医生编号</td>
		<td>诊室</td>
		<td>科室</td>
		<td>用户</td>
		<td>医生姓名</td>
		<td>级别</td>
		<td>状态</td>
		<td>照片</td>
		<td>操作</td>
	</tr>
	<tr>
	 	<d:forEach items="${list}" var="d">
			<tr>
				<td>${d.doctorid}</td>
				<td>${d.consultingroom.consroomname}</td>
				<td>${d.department.departmentname}</td>
				<td>${d.users.username}</td>
				<td>${d.doctorname}</td>
				<td>${d.doctorlevel}</td>
				<td>${d.doctorstatus}</td>
				<td>
					<img src="/images/${d.doctorphoto}" width="80px" height="100px">
				</td>
				<td>
					<a href="/doctor/delete/${d.doctorid }">删除</a>
					|
					<a href="/doctor/selectById/${d.doctorid }">修改</a>
				</td>
			</tr>
		</d:forEach>
	</tr>
</table>
</body>
</html>