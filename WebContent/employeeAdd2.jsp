<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*,java.net.URLDecoder"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My JSP 'employeeAdd.jsp'</title>
</head>
<body>
	${param.username }
	<form action="test/helloworld1">
		姓名：<input type="text" name="xm" value="">
	</form>
	<%= URLDecoder.decode(new String(request.getParameter("username").getBytes("UTF-8"),"UTF-8"),"UTF-8") %>
	<br/>redirect 导致属性丢失<br/>
	message：${message}<br/>
	xm：${xm}
</body>
</html>