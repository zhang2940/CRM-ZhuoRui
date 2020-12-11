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
					href="kehuxinxi.jsp">客户信息</a>&nbsp;- <a href="lishidingdan.jsp">历史订单</a>&nbsp;-
					<a href="dingdanxiangxi.jsp">订单详细</a>&nbsp; </span>
			</div>
		</div>
		<!-- bbalance 表格 显示 -->
		<div style="position: fixed; top: 200px; left: 200px;" class="conShow">
			<table  border="1" cellspacing="0" cellpadding="0"
				style="height: 150px; width: 1200px;">
                <tr>
                <td width="400px" style="background-color: #6EC2FE;">订单编号</td>
                  <td width="400px"> ${xiangxi[0].order_id}</td>
                    <td width="400px" style="background-color: #6EC2FE;">日期</td>
                      <td width="400px" > ${xiangxi[0].order_date}</td>
                </tr>
               <tr>
                <td style="background-color: #6EC2FE;">送货地址</td>
                  <td>${xiangxi[0].order_address}</td>
                    <td style="background-color: #6EC2FE;">总金额</td>
                      <td>${price}</td>
                </tr>
                 <tr>
                <td style="background-color: #6EC2FE;">状态</td>
                  <td>${xiangxi[0].order_status}</td>
                    <td></td>
                      <td></td>
                </tr>

			</table>
					<table  border="1" cellspacing="0" cellpadding="0" style="height: 100px; width: 1200px;">
					<tr style="background-color:#0066CB ">
					<td style="color: white;">商品</td>
					<td style="color: white;">数量</td>
					<td style="color: white;">单位</td>
					<td style="color: white;">单价(元)</td>
					<td style="color: white;">金额(元)</td>
					</tr>
					<c:forEach items="${xiangxi}" var="xiangxi1">
					<c:forEach items="${xiangxi1.list}" var="xiangxi">
					<tr>
					<td>${xiangxi.goods_name}</td>
					<td>${xiangxi.goods_number}</td>
					<td>${xiangxi.goods_units}</td>
					<td>${xiangxi.goods_unit_price}</td>
					<td>${xiangxi.goods_totle_price}</td>
					</tr>
					</c:forEach>
					</c:forEach>
					
					
					</table>

			<div
				style="position: absolute; left: 1120px; top: -50px; display: inline-block;">
				<a
					style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
					href="lishidingdan.jsp?clientId=${xiangxin.clientId}">返回</a>
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