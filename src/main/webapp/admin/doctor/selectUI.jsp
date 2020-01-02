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
<table class="table table-bordered">
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
				<td>${d.Consultingroom.consroomname}</td>
				<td>${d.Department.departmentname}</td>
				<td>${d.Users.username}</td>
				<td>${d.doctorname}</td>
				<td>${d.doctorlevel}</td>
				<td>${d.doctorstatus}</td>
				<td>${d.doctorphoto}</td>
			</tr>
		</d:forEach>
	</tr>
</table>
</body>
</html>