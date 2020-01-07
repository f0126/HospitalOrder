<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <style type="text/css">
         td {
           text-align: center;
         }
    </style>
</head>
<body>
    <table class="table table-bordered table-hover table-condensed">
        <tr>
           <td>预约id</td>
           <td>患者id</td>
           <td>号源id</td>
           <td>队列id</td>
           <td>预约编号</td>
           <td>预约时间</td>
           <td>预约状态</td>
           <td>操作</td>
        </tr>
        <j:forEach items="${list}" var="b" varStatus="status">
         <tr>
           <td>${status.index+1}</td>
           <td>${b.patientid}</td>
           <td>${b.sourceid}</td>
           <td>${b.queuingid}</td>
           <td>${b.bookingcode}</td>
           <td><fmt:formatDate value="${b.bookingtime}" pattern="yyyy年MM月dd日HH点mm分ss秒"/></td>
           <td>${b.bookingstatus}</td>
           <td>修改</td>
         </tr>
        </j:forEach>
    
    </table>
</body>
</html>