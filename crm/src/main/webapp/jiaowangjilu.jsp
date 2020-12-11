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
					<a
					href="kehuxinxi.jsp">客户信息</a>&nbsp;-
					<a
					href="jiaowangjilu.jsp">交往记录</a>&nbsp;-
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
						href="kehuxinxi.jsp">返回</a>	
				<a style="position:fixed;left:1640px;top:120px; font-size:30px; top:130px; display: inline-block; width: 80px; height: 30px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="xinjianjiaowangjilu.jsp?clientId=${xiangxin.clientId}">新建</a>	
				
				
				 </div>
				<!-- bbalance 表格 显示 -->
				<div style="position:fixed;top:200px;left: 40px;" class="conShow">
					<table border="1" cellspacing="0" cellpadding="0" style="width:1673px; height: 50px">
						<tr>
							<td height="40px" width="66px" class="tdColor tdC">时间</td>
							<td height="40px" width="305px" class="tdColor">地点</td>
							<td height="40px" width="275px" class="tdColor">概要</td>
							<td height="40px" width="315px" class="tdColor">详细信息</td>
							<td height="40px" width="330px" class="tdColor">备注</td>
							<td height="40px" width="130px" class="tdColor">操作</td>
						</tr>
						<c:forEach items="${clientrecord}" var="showlist" varStatus="postion" >
						<tr height="85px">
							<td>${showlist.record_date}</td>
							<td>${showlist.record_place}</td>
							<td>${showlist.record_summary}</td>
							<td>${showlist.record_detailed_information}</td>
							<td>${showlist.record_remark}</td>
							<td><a href="xiugaijiaowang.do?record_id=${showlist.record_id}"><img class="operation"
									src="img/update.png"></a> 
									<a class="zhan"  href="shanjiaowangjl.do?record_id=${showlist.record_id}&clientId=${xiangxin.clientId}"><img 
								src="img/delete.png"></a></td>
						</tr>
						</c:forEach>
					</table>
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