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
	<h3>患者角色列表</h3>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>患者编号</th>
				<th>患者名称</th>
				<th>患者年龄</th>
				<th>身份证号码</th>
				<th>联系方式</th>
				<th>账户余额</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<j:forEach items="${patientList}" var="p">
				<tr>
					<td>${p.patientid }</td>
					<td>${p.patientname }</td>
					<td>${p.patientage }</td>
					<td>${p.patientprovincialcard }</td>
					<td>${p.patientphone }</td>
					<td>${p.surplusmoney }</td>
					<td>
						<button type="button" name="delete" class="btn btn-danger btn-sm" value="${p.patientid }">删除</button>
						|
						<button type="button" name="update" class="btn btn-warning btn-sm" value="${p.patientid }">修改</button>
					</td>
				</tr>
			</j:forEach>
		</tbody>
	</table>
	
</body>
</html>