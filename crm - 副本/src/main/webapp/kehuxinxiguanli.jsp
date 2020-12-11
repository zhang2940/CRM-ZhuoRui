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
					href="kexinguan.do?accountId=${userInfo.accountId}">客户信息管理</a>&nbsp;-</span>
			</div>
		</div>

		<div class="page">
			<!-- balance页面样式 -->
			<div class="connoisseur">
			<div  class="conform">
					<form action="kexincha.do" method="post">
						<div  class="cfD"><input type="hidden" name="accountId" value="${userInfo.accountId}">
						<input type="hidden" name="pageNum" value="1">
						<a style="position: fixed;left:40px;top: 70px">客户名称：</a>
							<input style=" position: fixed;left: 110px;top: 70px" name="clientName" value="" type="text" />
							<a style="position: fixed;left:400px;top: 70px">地区:</a>
							<input style=" position: fixed;left: 440px;top: 70px" name="clientArea" value="" type="text" />
						    <a style="position: fixed;left:710px;top: 70px">法人：</a><input style=" position: fixed;left: 770px;top: 70px" name="clientLegalPerson" type="text" value="" />
							<input type="submit" value="搜索" style="position:fixed;left:1030px;top: 70px; display:inline-block; width:80px;height:27px; text-decoration:none;text-align:center;line-height:25px; color: white;background-color: #47A4E1" class="button"></button>
						</div>
					</form>
				</div>
				<!-- bbalance 表格 显示 -->
				<div style="position:fixed;top:100px;left: 40px;" class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">编号</td>
							<td width="305px" class="tdColor">客户名称</td>
							<td width="275px" class="tdColor">地区</td>
							<td width="315px" class="tdColor">客户经理</td>
							<td width="240px" class="tdColor">地址</td>
							<td width="330px" class="tdColor">法人</td>
							<td width="130px" class="tdColor">操作</td>
						</tr>
						<c:forEach items="${kexin}" var="showlist" varStatus="postion" >
						<tr height="85px">
							<td>${postion.count}</td>
							<td>${showlist.clientName}</td>
							<td>${showlist.clientArea}</td>
							<td>${showlist.manager}</td>
							<td>${showlist.clientAddress}</td>
							<td>${showlist.clientLegalPerson}</td>
							<td><a href="xiangxin.do?clientId=${showlist.clientId}"><img class="operation"
									src="img/update.png"></a></td>
						</tr>
						</c:forEach>
					</table>
					<div style="width: 1671px;overflow: auto;height: 10px;border:1px gray solid;">
					<div style="position: fixed;left:1180px;"><a>共${pageInfo.total}条记录</a>
					<a>每页${pageInfo.pageSize}条</a>
					<a>第${pageInfo.pageNum}/共${pageInfo.pages}页</a>
					<a  href="show.do?&accountId=${userInfo.accountId}">第一页</a>
					<a  href="show.do?pageNum=${pageInfo.pageNum-1}&accountId=${userInfo.accountId}">上一页</a>
					<a  href="show.do?pageNum=${pageInfo.pageNum+1}&accountId=${userInfo.accountId}">下一页</a>
					<a  href="show.do?pageNum=${pageInfo.pages}&accountId=${userInfo.accountId}">最后一页</a>
					<a>转到<form style="display: inline-block;" action="show.do" method="get"><input type="hidden" name="accountId" value="${userInfo.accountId}"><input style="width: 40px" type="text" name="pageNum" value="">页<input style="width: 40px" type="submit" value="go"></form></a>
				</div>
					</div>
				</div>
				<!-- balance 表格 显示 end-->
			</div>
			<!-- balance页面样式end -->
		</div>

	</div>
	<!-- 删除弹出框 -->
	
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