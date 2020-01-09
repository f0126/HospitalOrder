<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../commons/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>添加权限</h3>
	<form action="/permissions/save" method="post">
		权限名称:<input type="text" name="pname"/><br/>
		父级权限:
		       <select name="parentid">
		       	<option value="0"></option>
		       	<j:forEach items="${alllist}" var="p">
		       		<option value="${p.pid }">${p.pname }</option>
		       	</j:forEach>
		       </select><br/>
			<button>提交</button>
	</form>
</body>
</html>