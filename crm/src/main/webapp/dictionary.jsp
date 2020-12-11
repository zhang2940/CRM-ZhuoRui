<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<title>数据字典管理</title>
<link rel="stylesheet" type="text/css" href="css/cs2.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script>
/**
 * desc：删除
 */
function deleting(id){
	confirm("确定要删除？");
}
</script>
</head>
<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">基础数据</a>&nbsp;-</span>&nbsp;数据字典管理
			</div>
		</div>
		<div class="page1">
			<!-- balance页面样式 -->
			<div class="conform">
				<div class="cfD">
					<div class="cfD" style="position: absolute;">
						<form action="diction.do" method="get">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							类型:<input name="dictionaryType" class="vinput" type="text" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							条目:<input name="dictionaryEntry" class="vinput" type="text" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							值:<input name="dictionaryValue" class="vinput" type="text" /> <input
								class="button" type="submit" value="查询">
							<input type="hidden" id="sroleName" value="${param.dictionaryType }" />
							<input type="hidden" id="pageNum" name="pageNum" />
						</form>
						<a href="dictionary1.jsp"><button class="button1">新建</button></a>
					</div>
				</div>
			</div>
			<div class="conShow">
				<table border="1" cellspacing="0" cellpadding="0">
					<tr>
						<td width="66px" class="tdColor tdC">编号</td>
						<td width="255px" class="tdColor">类型</td>
						<td width="210px" class="tdColor">条目</td>
						<td width="235px" class="tdColor">值</td>
						<td width="245px" class="tdColor">是否可编辑</td>
						<td width="280px" class="tdColor">操作</td>
					</tr>
					<c:forEach items="${list}" var="dicti" varStatus="we">
						<tr>
							<td>${(pageInfo.pageNum-1)*pageInfo.pageSize + we.count}</td>
							<td>${dicti.dictionaryType }</td>
							<td>${dicti.dictionaryEntry }</td>
							<td>${dicti.dictionaryValue }</td>
							<td>${dicti.dictionaryCompile }</td>
							<td><c:choose>
									<c:when test="${dicti.dictionaryCompile=='是'}">
										<a href="#"></a>
										<a href="dictionary2.do?dicid=${dicti.dictionaryId}"><i class="glyphicon glyphicon-trash trash"></i>删除</a>
									</c:when>
									<c:otherwise>
										<a href="#"></a>
										<a href="#"></a>
									</c:otherwise>
								</c:choose></td>
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
						<a href="dictionary.do?pageNum=${index }">${index }</a> 
						</c:forEach> 
					</section>
				</div>
			</div>
		</div>
	</div>
</body>
</html>