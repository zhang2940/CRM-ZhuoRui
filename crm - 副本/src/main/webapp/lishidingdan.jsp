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
				<img src="img/coin02.png" /><span><a id="shou" onclick="fun()">首页</a>&nbsp;&nbsp;<a
					href="kexin.do?accountId=${userInfo.accountId}">客户信息管理</a>&nbsp;-
					<a href="kehuxinxi.jsp">客户信息</a>&nbsp;-
					<a
					href="lishidingdan.jsp">历史订单</a>&nbsp;
					</span>
			</div>
		</div>

		<div class="page">
			<!-- balance页面样式 -->
			<div class="connoisseur">
			    <table style="background-color:#F2F2F2; position:fixed;left:40px;top:60px; width: 1674px;height: 50px;top:170px;" border="1px black solid">
			    <tr>
			    <td style="background-color:#6EC2FD " width="25%">客户编号</td>
			    <td width="25%">${xiangxin.clientId}</td>
			    <td style="background-color:#6EC2FD "  width="25%">客户名称</td>
			     <td width="25%">${xiangxin.clientName}</td>
			    </tr>
			    
			    </table>
					
				</div>
				<div style="position:fixed;left:1550px;top:130px; display: inline-block;">
				<a style="font-size:30px; top: 160px; display: inline-block; width: 80px; height: 30px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="lishidingdan.jsp">返回</a>	
				
				 </div>
				<!-- bbalance 表格 显示 -->
				<div style="position:fixed;top:200px;left: 40px;" class="conShow">
					<table border="1" cellspacing="0" cellpadding="0" style="height: 50px">
						<tr>
							<td height="40px" width="300px" class="tdColor tdC">订单编号</td>
							<td height="40px" width="365px" class="tdColor">日期</td>
							<td height="40px" width="350px" class="tdColor">送货地址</td>
							<td height="40px" width="350px" class="tdColor">状态</td>
							<td height="40px" width="300px" class="tdColor">操作</td>
						</tr>
						<c:forEach items="${showdingdan}" var="showlist" varStatus="postion" >
						<tr height="85px">
							<td>${showlist.order_id}</td>
							<td>${showlist.order_date}</td>
							<td>${showlist.order_address}</td>
							<td>${showlist.order_status}</td>
							<td><a href="dingdanxiangxi.do?order_id=${showlist.order_id}&clientId=${xiangxin.clientId}"><img class="operation"
									src="img/update.png"></a> 
								</td>
						</tr>
						</c:forEach>
					</table>
					
					<div style="position:fixed;left: 1200px; "><a>共${pageInfo1.total}条记录</a>
					<a>每页${pageInfo1.pageSize}条</a>
					<a>第${pageInfo1.pageNum}/共${pageInfo1.pages}页</a>
					<a  href="showlishidd.do?clientId=${xiangxin.clientId}&pageNum=1">第一页</a>
					<a  href="showlishidd.do?pageNum=${pageInfo1.pageNum-1}&clientId=${xiangxin.clientId}">上一页</a>
					<a  href="showlishidd.do?pageNum=${pageInfo1.pageNum+1}&clientId=${xiangxin.clientId}">下一页</a>
					<a  href="showlishidd.do?pageNum=${pageInfo1.pages}&clientId=${xiangxin.clientId}">最后一页</a>
					<a>转到<form style="display: inline-block;" action="showlishidd.do" method="get"><input type="hidden" name="accountId" value="${userInfo1.accountId}"><input style="width: 40px" type="text" name="pageNum" value="">页<input style="width: 40px" type="submit" value="go"></form></a>
					</div>
					</div>
					
				</div>
				<!-- balance 表格 显示 end-->

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
window.onload=function(){
	
 document.getElementById("shou").onclick=function(){
		top.location.href="index.jsp";
		}

	
	
}
// 广告弹出框
$(".zhan12").click(function(){
  $(".banDel").show();
});
$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
});
// 广告弹出框 end
</script>
</html>