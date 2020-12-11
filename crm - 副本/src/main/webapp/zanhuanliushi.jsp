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
					-<a
					href="zanhuanliushi.jsp?accountId=${userInfo.accountId}">暂缓流失</a>&nbsp;
					</span>
			</div>
		</div><form action="zanhuanbao.do" method="get">
					<table   border="1" cellspacing="0" cellpadding="0" style="position:fixed;top:140px;left:80px; height: 300px; width: 1200px;">
					<tr>
					<td style="background-color: #6EC2FE">编号</td>
					<td><input name="loss_id" readonly="readonly" type="text" value="${zanhuan.loss_id}"></td>
					<td style="background-color: #6EC2FE">客户</td>
					<td><input readonly="readonly" type="text" value="${zanhuan.loss_client_name}"></td>
					</tr>
					<tr>
					<td style="background-color: #6EC2FE">地区</td>
					<td><input readonly="readonly" type="text" value="${zanhuan.loss_client_area}"></td>
					<td style="background-color: #6EC2FE">详细地址</td>
					<td><input readonly="readonly" type="text" value="${zanhuan.loss_client_address}"></td>
					</tr>
					<tr>
					<td style="background-color: #6EC2FE">暂缓措施</td>
					<td colspan="3">
					<c:forEach items="${yuanyin}" var="we">${we.reason}</c:forEach>
					</td>
					</tr>
					<tr>
					<td style="background-color: #6EC2FE">追加暂缓措施</td>
					<td colspan="3"><textarea name="reason" style="height:100px;width:600px; resize: none;"></textarea></td>
					</tr>
					<div style="position:fixed; left: 1150px;top:120px;"><a href="kehuliushi.jsp?accountId=${userInfo.accountId}"  style="background-color: #0066CB;color: white;">返回</a>
					<a href="querenliusi.do?client_id=${zanhuan.client_id}&accountId=${userInfo.accountId}" style="background-color:#0066CB;color: white;">确认流失</a>
					<a><input style="background-color:#0066CB;color: white;border: 0px;" type="submit" value="保存"></a></div>		
					</table>
					<form>
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