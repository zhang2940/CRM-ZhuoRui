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
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">销售机会管理</a>&nbsp;-</span>
			</div>
		</div>

		<div class="page">
			<!-- balance页面样式 -->
			<div class="connoisseur">
			<a style="position:fixed;left:1150px;top:70px;display:inline-block; width:80px;height:27px; text-decoration:none;text-align:center;line-height:25px; color: white;background-color: #47A4E1" href="">新建</a>
			<div  class="conform">
					<form >
						<div  class="cfD">
							<a style="position: fixed;left:40px;top: 70px">客户名称：</a>
							<input style=" position: fixed;left: 110px;top: 70px" class="vinput" type="text" />
							<a style="position: fixed;left:400px;top: 70px">概要:</a>
							<input style=" position: fixed;left: 440px;top: 70px" class="vinput vpr" type="text" />
						    <a style="position: fixed;left:710px;top: 70px">联系人：</a><input style=" position: fixed;left: 770px;top: 70px" class="addUser" type="text" placeholder="" />
							<button  style="position:fixed;left:1030px;top: 70px; display:inline-block; width:80px;height:27px; text-decoration:none;text-align:center;line-height:25px; color: white;background-color: #47A4E1" class="button">搜索</button>
						</div>
					</form>
				</div>
				<!-- bbalance 表格 显示 -->
				<div style="position:fixed;top:100px;left: 40px;" class="conShow">
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
						<c:forEach items="${showlist}" var="showlist" varStatus="postion" >
						<tr height="85px">
							<td>${postion.count}</td>
							<td>${showlist.customerName}</td>
							<td>${showlist.summary}</td>
							<td>${showlist.contacts}</td>
							<td>${showlist.contactsPhone}</td>
							<td>${showlist.creationTime}</td>
							<td><a href=""><img class="operation"
									src="img/update.png"></a> <img class="operation delban"
								src="img/delete.png"></td>
						</tr>
						</c:forEach>
					</table>
					<div style="width: 1671px;height:30px;border:1px gray solid;"><a style="position: fixed;left:1130px;">共${pageInfo.total}条记录</a>
					<a style="position: fixed;left:1200px;">每页${pageInfo.pageSize}条</a>
					<a style="position: fixed;left:1250px;">第${pageInfo.pageNum}/共${pageInfo.pages}页</a>
					<a style="position: fixed;left:1320px;" href="show.do?&accountId=${userInfo.accountId}">第一页</a>
					<a style="position: fixed;left:1370px;" href="show.do?pageNum=${pageNum.pageNum-1}&accountId=${userInfo.accountId}">上一页</a>
					<a style="position: fixed;left:1420px;" href="show.do?pageNum=${pageNum.pageNum+1}&accountId=${userInfo.accountId}">下一页</a>
					<a style="position: fixed;left:1470px;"href="show.do?pageNum=${pageNum.pages}&accountId=${userInfo.accountId}">最后一页</a>
					<a style="position: fixed;left:1530px;">转到<form style="display: inline-block" action="show.do" method="post"><input type="hidden" name="accountId" value="${useInfo.accountId}"><input style="width: 40px" type="text" name="ye" value="">页<input style="width: 40px" type="submit" value="go"></form></a>
				
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
				<a href="#" class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->



</body>
<script type="text/javascript">
// 广告弹出框
$(".delban").click(function(){
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