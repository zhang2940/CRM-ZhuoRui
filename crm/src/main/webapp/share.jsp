<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>红包管理-分享</title>
<link rel="stylesheet" type="text/css" href="css/css.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">红包管理</a>&nbsp;-</span>
			</div>
		</div>

		<div class="page">
			<!-- balanceé¡µé¢æ ·å¼ -->
			<div class="connoisseur">
				<div class="conform">
					<form>
						<div class="cfD">
							时间段
							<input class="vinput" type="text" />
							&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;
							<input class="vinput vpr" type="text" />
							<input class="addUser" type="text" placeholder="æ é¢/åäº«è" />
							<button class="button">搜索</button>
						</div>
					</form>
				</div>
				<!-- bbalance è¡¨æ ¼ æ¾ç¤º -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="305px" class="tdColor">标题</td>
							<td width="275px" class="tdColor">分享者</td>
							<td width="315px" class="tdColor">领取红包数</td>
							<td width="240px" class="tdColor">亲文数</td>
							<td width="330px" class="tdColor">分享时间</td>
							<td width="130px" class="tdColor">操作</td>
						</tr>
						<tr height="85px">
							<td>1</td>
							<td>某偶红包</td>
							<td>山下就只</td>
							<td>123</td>
							<td>1</td>
							<td>2015-25-36 12:12</td>
							<td><img class="operation delban"src="img/delete.png"></td>
						</tr>
						<tr height="85px">
							<td>1</td>
							<td>某偶红包</td>
							<td>山下就只</td>
							<td>123</td>
							<td>1</td>
							<td>2015-25-36 12:12</td>
							<td><img class="operation delban"src="img/delete.png"></td>
						</tr>
					</table>
					<div class="paging">此处是分页</div>
				</div>
			</div>
		</div>

	</div>
	<!-- 删除弹出框-->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="img/shanchu.png" /></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗</p>
			<p class="delP2">
				<a href="#" class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- å é¤å¼¹åºæ¡  end-->

</body>

<script type="text/javascript">
// å¹¿åå¼¹åºæ¡
$(".delban").click(function(){
  $(".banDel").show();
});
$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
});

</script>
</html>