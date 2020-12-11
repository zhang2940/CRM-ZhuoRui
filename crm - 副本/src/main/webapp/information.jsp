<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据字典管理</title>
<link rel="stylesheet" type="text/css" href="css/cs.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">基础数据</a>&nbsp;-</span>&nbsp;查询产品数据
			</div>
		</div>
		<div class="page1">
			<!-- balance页面样式 -->
			<div class="conform">
			 <div class="cfD">
				<div class="cfD" style="position: absolute;">
				<form action="informa.do" method="get">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					名称:<input name="informationName" class="vinput" type="text" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					型号:<input name="informationModel" class="vinput" type="text" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					批次:<input name="informationBatch" class="vinput" type="text" />
						<input class="button" type="submit" value="查询">
						</form>
					</div>

				</div>
			</div>
			<div class="conShow" >
				<table border="1" cellspacing="0" cellpadding="0">
					<tr>
						<td width="66px" class="tdColor tdC">编号</td>
						<td width="255px" class="tdColor">名称</td>
						<td width="210px" class="tdColor">型号</td>
						<td width="235px" class="tdColor">等级/批次</td>
						<td width="245px" class="tdColor">单位</td>
						<td width="280px" class="tdColor">单价(元)</td>
						<td width="280px" class="tdColor">备注</td>
					</tr>
				<c:forEach items="${list}" var="info" varStatus="wu">
					<tr>
						<td>${(pageInfo.pageNum-1)*pageInfo.pageSize + wu.count}</td>
						<td>${info.informationName}</td>
						<td>${info.informationModel}</td>
						<td>${info.informationBatch}</td>
						<td>${info.informationUnits}</td>
						<td>${info.informationPrice}</td>
						<td>${info.informationRemark}</td>
					</tr>
					</c:forEach>
				</table>
				<section class="paging">
				共${pageInfo.total}行,第${pageInfo.pageNum}/${pageInfo.pages}页
				</section>
				<div style="position: absolute;">
					<section class="page-bar">
						<c:forEach var="index" begin="1" end="${pageInfo.pages}">
						<a href="information.do?pageNum=${index }">${index }</a> 
						</c:forEach> 
					</section>
				</div>
			</div>
		</div>
</body>
</html>