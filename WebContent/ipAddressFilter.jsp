<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<html>
<head></head>
<body>
有错误，没有权限：
<a><%=request.getAttribute("msg") %></a>
<a href="http://127.0.0.1:8080/dn14SH/project/list.action">连接</a>
</body>
</html>


