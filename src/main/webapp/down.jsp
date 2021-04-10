<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
<a href="${pageContext.request.contextPath }/1.jpg">查看美女1号</a>
<a href="${pageContext.request.contextPath }/1.txt">查看文件内容</a>
<a href="${pageContext.request.contextPath }/简历.docx">简历</a>
<a href="${pageContext.request.contextPath }/servlet/DownServlet?file=2.jpg">美女2号</a>
<a href="${pageContext.request.contextPath }/servlet/DownServlet?file=1.txt">美女2号</a>
</body>
</html>