<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2Demo Index</title>
</head>
<body>
<%=new Date() %>
<br/>
${message }
<br/>
${xm}
<br/>
吉布森 中国
<form action="test/manage.do" method="post">
	id:<input type="text" name="person.id"><br/>
	name:<input type="text" name="person.name"><br/>
	<input type="submit" value="submit">
</form>
</body>
</html>