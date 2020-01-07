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
	<h3>修改号源</h3>
	<form class="form-horizontal" role="form" action="/sourcenumbers/update" method="post">
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
		      <input type="text" class="form-control" name="sourcetime" value="<fmt:formatDate value="${sourcenumber.sourcetime }" pattern="yyyy-MM-dd"/>" readonly="readonly"/>
		      <input type="hidden" name="sourceid" value="${sourcenumber.sourceid }"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail" class="col-sm-2 control-label">上午/下午</label>
		    <div class="col-sm-5">
		    	<j:choose>
		    		<j:when test="${sourcenumber.sourceampm==am}">
		    			<input type="text" class="form-control" value="上午" readonly="readonly"/>
		    		</j:when>
		    		<j:otherwise>
		    			<input type="text" class="form-control" value="下午" readonly="readonly"/>
		    		</j:otherwise>
		    	</j:choose>
		       
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail2" class="col-sm-2 control-label">号源上限</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="sourcenumup" value="${sourcenumber.sourcenumup }" id="inputEmail2" placeholder="sourcenumup">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail2" class="col-sm-2 control-label">号源余量</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="surplusnum" value="${sourcenumber.surplusnum }" id="inputEmail2" placeholder="sourcenumup" readonly="readonly">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail4" class="col-sm-2 control-label">价格</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" name="sourceprice" value="${sourcenumber.sourceprice }" id="inputEmail4" placeholder="sourceprice">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary">提交</button>
		    </div>
		  </div>
	</form>
	<script type="text/javascript">
		$(function () {
			$("select option[value='"+${sourcenumber.project.projectid}+"']").prop("selected","selected");
		});
	</script>
</body>
</html>