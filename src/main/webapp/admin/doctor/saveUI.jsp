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
<form action="/doctor/save" method="post" role="form">
  <div class="form-group">
    <label for="doctorname">医生姓名</label>
    <input type="text" class="form-control" id="doctorname" placeholder="医生姓名" name="doctorname">
  </div>
  <div class="form-group">
    <label for="doctorlevel">医生级别</label>
    <input type="text" class="form-control" id="doctorlevel" placeholder="医生级别" name="doctorlevel">
  </div>
  <div class="form-group">
    <label for="doctorstatus">医生状态</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="医生状态" name="doctorstatus">
  </div>
  <div class="form-group">
    <label for="doctorphoto">医生照片</label>
    <input type="file" id="doctorphoto" name="doctorphoto">
    <p class="help-block">请上传个人一寸照片</p>
  </div>
  <div class="form-group">
    <label for="departmentid">科室</label>
    <select name="departmentid" class="form-control">
		<d:forEach items="${department }" var="d">
			<option value="${d.departmentid }">${d.departmentname }</option>
		</d:forEach>
	</select>
  </div>
  <div class="form-group">
    <label for="consroomid">诊室</label>
    <select name="consroomid" class="form-control">
		<d:forEach items="${room }" var="d">
			<option value="${d.consroomid }">${d.consroomname}</option>
		</d:forEach>
	</select>
  </div>
  <div class="form-group">
    <label for="uid">科室</label>
    <select name="uid" class="form-control">
		<d:forEach items="${user }" var="d">
			<option value="${d.uid }">${d.username }</option>
		</d:forEach>
	</select>
  </div>
  <button type="submit" class="btn btn-primary" data-toggle="button">提交</button>
</form>
</body>
</html>