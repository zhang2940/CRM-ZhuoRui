<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据字典管理</title>
<link rel="stylesheet" type="text/css" href="css/cs3.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">基础数据</a>&nbsp;-</span>&nbsp;<a href="dictionary.jsp">数据字典管理</a>-</span>&nbsp;新建
			</div>
		</div>
		<div class="page1">
			<!-- balance页面样式 -->
			<div class="conform">
				<div class="cfD" style="position: absolute;">
					<form action="dictionary1.do" method="post">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					编号:<input name="dictionaryId" class="button" type="text" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					类型:<input name="dictionaryType" class="vinput" type="text" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					条目:<input name="dictionaryEntry" class="vinput" type="text" />
					<br>
					<br>
					<br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					值:<input name="dictionaryValue" class="vinput" type="text" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					是否可编辑:<select name="dictionaryCompile" class="bselect">
							<option></option>
							<option>是</option>
							<option>否</option>
							</select>
					<!-- <div class="cfD" style="position: absolute;"> -->
						<input class="button" type="submit"value="保存">
						</form>
						<a href="dictionary.jsp"><button class="button1">返回</button></a>
					</div>
				</div>
			</div>
		</div>
</body>
</html>