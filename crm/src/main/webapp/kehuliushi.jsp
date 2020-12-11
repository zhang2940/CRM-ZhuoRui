<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>销售机会管理</title>
<link rel="stylesheet" type="text/css" href="css/css.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>
<body>

	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a id="shou"
					onclick="fun()">首页</a>&nbsp;&nbsp;-<a
					href="kehuliushi.jsp?accountId=${userInfo.accountId}">客户流失管理</a>&nbsp;
					</span>
			</div>
		</div>
					<table  border="1" cellspacing="0" cellpadding="0" style="position:fixed;top:120px;left:80px; height: 100px; width: 1200px;">
					<tr style="background-color:#0066CB ">
					<td style="color: white;">编号</td>
					<td style="color: white;">客户名称</td>
					<td style="color: white;">地区</td>
					<td style="color: white;">详细地址</td>
					<td style="color: white;">确认流失时间</td>
					<td style="color: white;">状态</td>
					<td style="color: white;">操作</td>
					</tr>
					<c:forEach items="${liushi}" var="liushi">
					
					<td>${liushi.loss_id }</td>
					<td>${liushi.loss_client_name }</td>
					<td>${liushi.loss_client_area }</td>
					<td>${liushi.loss_client_address }</td>
					<td>${liushi.loss_affirm_date }</td>
					<td>
					${liushi.loss_status }</td>
					<td>
					
					<c:choose>
              <c:when test="${liushi.loss_status=='确认流失'}">
             <a href=""></a>
                      </c:when>
       <c:otherwise>
            	<a href="zanhuanliushi.do?loss_id=${liushi.loss_id}&client_id=${liushi.client_id}"><img class="operation"
									src="img/update.png"></a>
       </c:otherwise>
</c:choose>
					
					</td>
					</c:forEach>
					
					
					</table>
		</div>


	<!-- 删除弹出框 -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="img/shanchu.png" /></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->



</body>
<script type="text/javascript">
	window.onload = function() {

		document.getElementById("shou").onclick = function() {
			top.location.href = "index.jsp";
		}
		document.getElementById("gai").onclick = function() {
			document.getElementById("gai").type = "datetime-local";
		}

	}
	// 广告弹出框
	$(".zhan12").click(function() {
		$(".banDel").show();
	});
	$(".close").click(function() {
		$(".banDel").hide();
	});
	$(".no").click(function() {
		$(".banDel").hide();
	});
	// 广告弹出框 end
</script>
</html>