<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css" />
		<script src="../js/jquery.min.js"></script>
<style type="text/css">
section ul li {
	margin-top: 1px;
	height: 34px;
}
section ul li a {
	width: 80px;
	height: 34px;
	line-height: 34px !important;
	text-align: center !important;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
	padding: 0px 6px !important;
	color: #222222 !important;
} 
section ul li i {
	position: absolute !important;
	top: 2px !important;
	right: 4px;
	z-index: 2;
	color: #CECECE;
	cursor: pointer;
}
section ul li i:hover {
	color: #333333;
}
section ul li:first-child {
	margin-left: 10px;
}
</style>
</head>
<body>
<section id ="sections">
			<ul class="nav nav-tabs">
				<li class="active"><a href="../main.jsp" target="main">首页</a></li>
			</ul>
</section>
</body>
</html>