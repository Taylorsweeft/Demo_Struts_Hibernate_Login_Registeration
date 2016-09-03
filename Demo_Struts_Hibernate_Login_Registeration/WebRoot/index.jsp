<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Login Page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<center>
		<form method="post" action="login">
		用户名：<input type="text" name="username"><br> 
		密码：    <input type="password" name="password"><br> 
		<input type="submit" value="提交" />
		<a href="registerpage"><input type="button" value ="注册"/></a>
		</form>
	</center>
	
</body>
</html>
