<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="addStu.action" Method="Post">
	<p> 学号：<input type="text" id="id" name="id" value="${restu.id}"/></p>
	<p> 姓名：<input type="text" id="name" name="name" value="${restu.name}"/></p>
	<p><input name="submit" value="提交" type="submit"/></p>
	</form>

</body>
</html>