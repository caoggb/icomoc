<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="likeStu.action" method="Post">
		查找学生：<input type="text" id="name" name="name" /> <input type="submit"
			value="提交">

	</form>
	<c:forEach var="stu" items="${stu}">
		<p>${stu.id},${stu.name}</p>
		<a href="delStu.action?id=${stu.id}">删除</a>,<a
			href="getStu.action?id=${stu.id}">修改姓名</a>
	</c:forEach>
	<hr />
	<a href="add.jsp">添加学生</a>
</body>
</html>