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
					href="kexin.do?accountId=${userInfo.accountId}">客户信息管理</a>&nbsp;- <a
					href="kehuxinxi.jsp">客户信息</a>&nbsp;- <a
					href="jiaowangjl.do?clientId=${xiangxin.clientId}">交往记录</a>&nbsp;-
					<a href="xiugaijiaowangjilu.jsp">修改交往记录</a>&nbsp;- </span>
			</div>
		</div>
		<!-- bbalance 表格 显示 -->
		<div style="position: fixed; top: 200px; left: 200px;" class="conShow">
			<form action="xiugaijiaowangjl.do" method="get">
			<input type="hidden" name="record_id" value="${xiugajl.record_id}">
				<table border="1" cellspacing="0" cellpadding="0"
					style="height: 150px; width: 1000px;">
					<tr height="110px">
                         <td style="background-color: #6EC2FE" height="80px" width="25%"
							class="tdColor tdC">时间</td>
						<td height="80px" width="25%" class="tdColor"><input id="gai"
							value="${xiugajl.record_date}" style="width: 200px; height: 50px"
							type="text" name="record_date"></td>
						<td style="width: 200px; height: 50px" class="tdColor">地点</td>
						<td height="80px" width="25%" class="tdColor"><input
							name="record_place" style="width: 200px; height: 50px"
							value="${xiugajl.record_place }"></td>

					</tr>
					<tr height="110px">
						<td style="background-color: #6EC2FE" height="80px" width="25%"
							class="tdColor tdC">概要</td>
						<td height="80px" width="25%" class="tdColor"><input
							value="${xiugajl.record_summary}"
							style="width: 200px; height: 50px" type="text"
							name="record_summary"></td>
						<td style="background-color: #6EC2FE" height="80px" width="25%"
							class="tdColor">备注</td>
						<td height="80px" width="25%" class="tdColor"><input
							style="width: 200px; height: 50px" type="text"
							value="${xiugajl.record_remark}"
							name="record_detailed_information"></td>
					</tr>
					<tr height="110px">
						<td style="background-color: #6EC2FE" height="80px" width="25%"
							class="tdColor tdC">详细信息</td>
						<td colspan="2" height="80px" width="25%" class="tdColor"><textarea
								style="resize: none; width: 300px; height: 100px" type="text"
								name="record_remark" value="${xiugajl.record_detailed_information}"></textarea></td>
						<td height="80px" width="25%" class="tdColor"></td>

					</tr>

				</table>
				<div
					style="position: absolute; left: 920px; top: -50px; display: inline-block;">
					<a><input
						style="border: white; top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						type="submit" value="保存"></a>
				</div>
				&nbsp;&nbsp;
				<div
					style="position: absolute; left: 820px; top: -50px; display: inline-block;">
					<a
						style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="jiaowangjl.do?clientId=${xiangxin.clientId}">返回</a>
				</div>
			</form>
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
		document.getElementById("gai").onclick = function() {
			document.getElementById("gai").type="datetime-local";
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