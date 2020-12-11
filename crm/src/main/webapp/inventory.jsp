<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查询库存</title>
<link rel="stylesheet" type="text/css" href="css/cs1.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">基础数据</a>&nbsp;-</span>&nbsp;查询库存
			</div>
		</div>
		<div class="page1">
			<!-- balance页面样式 -->
			<div class="conform">
				<div class="cfD">
				<div class="cfD" style="position: absolute;">
				<form action="inventor.do" method="get">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					产品:<input name="inventoryProduct" class="vinput" type="text" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					仓库:<input name="inventoryWarehouse" class="vinput" type="text" />
						<input class="button" type="submit" value="查询">
						</form>
					</div>
				</div>
			</div>
			<div class="conShow">
				<table border="1" cellspacing="0" cellpadding="0">
					<tr>
						<td width="66px" class="tdColor tdC">序号</td>
						<td width="255px" class="tdColor">产品</td>
						<td width="210px" class="tdColor">仓库</td>
						<td width="235px" class="tdColor">货位</td>
						<td width="245px" class="tdColor">件数</td>
						<td width="280px" class="tdColor">备注</td>
					</tr>
					<c:forEach items="${list }" var="inve" varStatus="wu">
					<tr>
						<td>${(pageInfo.pageNum-1)*pageInfo.pageSize +wu.count }</td>
						<td>${inve.inventoryProduct }</td>
						<td>${inve.inventoryWarehouse }</td>
						<td>${inve.inventoryAllocation }</td>
						<td>${inve.inventorynNumber }</td>
						<td>${inve.inventoryRemark }</td>
					</tr>
					</c:forEach>
					<c:if test="${requestScope.list.size()==0 }">
					<tr>
						<td colspan="6">未查找到数据!</td>
					</tr>
					</c:if>
				</table>
				<section class="paging">
				共${pageInfo.total}行,第${pageInfo.pageNum}/${pageInfo.pages}页
				</section>
				<div style="position: absolute;">
					<section class="page-bar">
						<c:forEach var="index" begin="1" end="${pageInfo.pages}">
						<a href="inventory.do?pageNum=${index }">${index }</a> 
						</c:forEach> 
					</section>
				</div>
			</div>
		</div>
	</div>
</body>
</html>