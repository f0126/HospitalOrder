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
	<h3>添加号源</h3>
	<form class="form-horizontal" role="form" action="/sourcenumbers/save" method="post">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">项目</label>
		    <div class="col-sm-5">
	    		<select class="form-control" name="projectname">
	    			<option>请选择项目</option>
	    			<j:forEach items="${plist}" var="p">
	    				<option value="${p.projectid }">${p.projectname }</option>
	    			</j:forEach>
	    		</select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">日期</label>
		    <div class="col-sm-5">
		      <input type="date" class="form-control" name="sourcetime"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail" class="col-sm-2 control-label">上午/下午</label>
		    <div class="col-sm-5">
		      <select class="form-control" name="sourceampm">
		      	<option value="am">上午</option>
		      	<option value="pm">下午</option>
		      </select>
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail2" class="col-sm-2 control-label">号源上限</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="sourcenumup" id="inputEmail2" placeholder="sourcenumup">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail4" class="col-sm-2 control-label">价格</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="sourceprice" id="inputEmail4" placeholder="sourceprice">
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