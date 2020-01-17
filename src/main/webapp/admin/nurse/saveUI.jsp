<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/nurses/save" method="post" enctype="multipart/form-data" role="form">
		<!-- 這裏做成下拉菜單 -->
		角色：<input type="text" name="uid" /><br /> 
		护士姓名：<input type="text" name="nursename" /><br /> 
		级别：<input type="radio" name="sex" value="男" />男
			<input type="radio" name="sex" value="女" checked="checked" />女<br />
		护士照片：<input type="file" name="file" /><br />
		<button type="submit">保存</button>
	</form>
</body>
</html>