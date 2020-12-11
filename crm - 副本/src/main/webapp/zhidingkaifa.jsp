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
					onclick="fun()">首页</a>&nbsp;&nbsp;<a
					href="kekai.do?accountId=${userInfo.accountId}">客户开发计划</a>&nbsp;-</span>
			</div>
		</div>

		<div class="page">
			<!-- balance页面样式 -->
			<div class="connoisseur">
				<div class="conform">
					<form action="kexiaocha.do" method="get">
						<div class="cfD">
							<input type="hidden" name="accountId"
								value="${userInfo.accountId}"> <input type="hidden"
								name="pageNum" value="1"> <a
								style="position: fixed; left: 40px; top: 70px">客户名称：</a> <input
								style="position: fixed; left: 110px; top: 70px"
								name="clientName" value="" type="text" /> <a
								style="position: fixed; left: 400px; top: 70px">概要:</a> <input
								style="position: fixed; left: 440px; top: 70px" name="summary"
								value="" type="text" /> <a
								style="position: fixed; left: 710px; top: 70px">联系人：</a><input
								style="position: fixed; left: 770px; top: 70px" name="contact"
								type="text" value="" /> <input type="submit" value="搜索"
								style="position: fixed; left: 1030px; top: 70px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
								class="button">
							</button>
						</div>
					</form>
				</div>
				<!-- bbalance 表格 显示 -->
				<div style="position: fixed; top: 100px; left: 40px;"
					class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">编号</td>
							<td width="305px" class="tdColor">客户名称</td>
							<td width="275px" class="tdColor">概要</td>
							<td width="315px" class="tdColor">联系人</td>
							<td width="240px" class="tdColor">联系电话</td>
							<td width="330px" class="tdColor">创建时间</td>
							<td width="130px" class="tdColor">操作</td>
						</tr>
						<c:forEach items="${kekai}" var="showlist" varStatus="postion">
							<tr height="85px">
								<td>${postion.count}</td>
								<td>${showlist.customerName}</td>
								<td>${showlist.summary}</td>
								<td>${showlist.contacts}</td>
								<td>${showlist.contactsPhone}</td>
								<td>${showlist.creationTime}</td>
								<td><a href="zhiji.do?sellId=${showlist.sellId}"><img
										class="operation" src="img/update.png"></a>
							</tr>
						</c:forEach>
					</table>
					<div
						style="width: 1671px; overflow:  auto; height:  10px; border: 1px gray solid;">
						<div style="position: fixed; left: 1180px;">
							<a>共${pageInfo1.total}条记录</a> <a>每页${pageInfo1.pageSize}条</a> <a>第${pageInfo1.pageNum}/共${pageInfo1.pages}页</a>
							<a href="kekai.do?&accountId=${userInfo1.accountId}">第一页</a> <a
								href="kekai.do?pageNum=${pageInfo1.pageNum-1}&accountId=${userInfo1.accountId}">上一页</a>
							<a
								href="kekai.do?pageNum=${pageInfo1.pageNum+1}&accountId=${userInfo1.accountId}">下一页</a>
							<a
								href="kekai.do?pageNum=${pageInfo1.pages}&accountId=${userInfo1.accountId}">最后一页</a>
							<a>转到
								<form style="display: inline-block;" action="kekai.do"
									method="get">
									<input style="width: 40px" type="text" name="pageNum" value="">页<input
										style="width: 40px" type="submit" value="go">
								</form>
							</a>
						</div>
					</div>
				</div>
				<!-- balance 表格 显示 end-->
			</div>
			<!-- balance页面样式end -->
		</div>

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