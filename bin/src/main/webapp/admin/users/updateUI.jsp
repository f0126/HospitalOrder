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
	<h3>修改角色</h3>
	<form class="form-horizontal" role="form" action="/users/update" method="post">
		  <div class="form-group">
		    <div class="col-sm-5">
		      <input type="hidden" name="uid" value="${user.uid }"/>
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail" class="col-sm-2 control-label">密码</label>
		    <div class="col-sm-5">
		      <input type="hidden" name="uid" value="${user.uid }"/>
		      <input type="text" class="form-control" name="password" value="${user.password }" id="inputEmail">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary">修改</button>
		    </div>
		  </div>
	</form>
</body>
</html>