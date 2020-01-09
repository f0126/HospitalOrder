<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../commons/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function () {
		$("select option[value='"+${p.parentid}+"']").prop("selected","selected");
	});
</script>
</head>
<body>
	<h3>修改权限</h3>
	<form action="/permissions/update" method="post">
			  <input type="hidden" name="pid" value="${pid }"/>
		权限名称:<input type="text" name="pname" value="${p.pname }"/><br/>
		父级权限:
		       <select name="parentid">
		       <option value="0">空</option>
		       	<j:forEach items="${alllist}" var="per">
		       		<option value="${per.pid }">${per.pname }</option>
		       	</j:forEach>
		       </select><br/>
			<button>提交修改</button>
	</form>
</body>
</html>