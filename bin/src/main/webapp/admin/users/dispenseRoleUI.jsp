<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/layer/2.3/layer.js"></script>
<style type="text/css">
	div {
		float: left;
		width: 150px;
		height: 100px;
	}
</style>
</head>
<body>
	<h3>为${user.username }分配角色</h3>
	<div>
		<h4>所有角色</h4>
		<select size="${size }" multiple="multiple">
			<j:forEach items="${allRoles }" var="r">
				<option value="${r.rid }">${r.rname}</option>
			</j:forEach>
		</select>
	</div>
	<div>
		<button> > </button><br />
		<button> < </button><br />
		<button> >> </button><br />
		<button> << </button><br />
	</div>
	<div>
		<h4>已有角色</h4>
		<select size="${size }" multiple="multiple" name="rids">
			<j:forEach items="${hasedRoles }" var="r">
				<option value="${r.rid }" selected="selected">${r.rname}</option>
			</j:forEach>
		</select>
	</div>
	<div>
		<button type="button">确认分配</button>
	</div>
	<script type="text/javascript">
		$(function () {
			$("button:eq(4)").click(function () {
				var uid=${user.uid };
				var rids=$("select:eq(1)").val();
				window.location="/users/dispenseRole?uid="+uid+"&rids="+rids;
				layer.msg("角色分配");
			});
			$("button:eq(0)").click(function () {
				$("select:eq(0) option:selected").appendTo($("select:eq(1)"));
			});
			$("button:eq(1)").click(function () {
				$("select:eq(1) option:selected").appendTo($("select:eq(0)"));
			});
			$("button:eq(2)").click(function () {
				$("select:eq(0) option").appendTo($("select:eq(1)"));
			});
			$("button:eq(3)").click(function () {
				$("select:eq(1) option").appendTo($("select:eq(0)"));
			});
		});
	</script>
</body>
</html>