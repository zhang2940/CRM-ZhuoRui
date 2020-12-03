<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页-有点</title>
</head>
<frameset rows="100,*" cols="*" scrolling="No" framespacing="0"
	frameborder="no" border="0"> <frame src="inc/head.jsp"
	name="headmenu" id="mainFrame" title="mainFrame"><!-- 引用头部 -->
<!-- 引用左边和主体部分 --> <frameset rows="100*" cols="210,*" scrolling="No"
	framespacing="0" frameborder="no" border="0"> <frame
	src="left.jsp" name="leftmenu" id="mainFrame" title="mainFrame">
<frame src="main.jsp" name="main" scrolling="yes" noresize="noresize"
	id="rightFrame" border="0" style="margin:0"  title="rightFrame"></frameset></frameset>
</html>