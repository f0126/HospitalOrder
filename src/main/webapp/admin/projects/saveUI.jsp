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
	<h3>添加项目</h3>
	<form class="form-horizontal" role="form" action="/projects/save" method="post">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">项目名</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="projectname" placeholder="projectname"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail4" class="col-sm-2 control-label">项目价格</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="projectidprice" id="inputEmail4" placeholder="projectidprice">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary">提交</button>
		    </div>
		  </div>
	</form>
</body>
</html>