<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>ä¼åç®¡ç-æç¹</title>
<link rel="stylesheet" type="text/css" href="css/css.css" />
<link rel="stylesheet" type="text/css" href="css/manhuaDate.1.0.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/manhuaDate.1.0.js"></script>
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<!-- <script type="text/javascript" src="js/page.js" ></script> -->
	<script type="text/javascript">
$(function (){
  $("input.mh_date").manhuaDate({
    Event : "click",//å¯é               
    Left : 0,//å¼¹åºæ¶é´åé çå·¦è¾¹ä½ç½®
    Top : -16,//å¼¹åºæ¶é´åé çé¡¶é¨è¾¹ä½ç½®
    fuhao : "-",//æ¥æè¿æ¥ç¬¦é»è®¤ä¸º-
    isTime : false,//æ¯å¦å¼å¯æ¶é´å¼é»è®¤ä¸ºfalse
    beginY : 1949,//å¹´ä»½çå¼å§é»è®¤ä¸º1949
    endY :2100//å¹´ä»½çç»æé»è®¤ä¸º2049
  });
});
</script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">é¦é¡µ</a>&nbsp;-&nbsp;<a
					href="#">å¬å±ç®¡ç</a>&nbsp;-</span>&nbsp;æè§ç®¡ç
			</div>
		</div>

		<div class="page">
			<!-- vipé¡µé¢æ ·å¼ -->
			<div class="vip">
				<div class="conform">
					<form>
						<div class="cfD">
							æ¶é´æ®µï¼<input class="vinput mh_date" type="text" readonly="true" />&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;
							<input class="vinput mh_date" type="text" readonly="true" />
						</div>
						<div class="cfD">
							<input class="addUser" type="text" placeholder="è¾å¥ç¨æ·å/ID/ææºå·/åå¸" />
							<button class="button">æç´¢</button>
							<a class="addA addA1" href="vipadd.html">æ°å¢ä¼å+</a> <a
								class="addA addA1 addA2" href="vipadd.html">å¯ç éç½®</a>
						</div>
					</form>
				</div>
				<!-- vip è¡¨æ ¼ æ¾ç¤º -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">åºå·</td>
							<td width="250px" class="tdColor">å¤´å</td>
							<td width="188px" class="tdColor">å§å</td>
							<td width="235px" class="tdColor">ææºå·ç </td>
							<td width="220px" class="tdColor">æå¨åå¸</td>
							<td width="290px" class="tdColor">ä¼åä½é¢</td>
							<td width="282px" class="tdColor">æ³¨åæ¶é´</td>
							<td width="130px" class="tdColor">æä½</td>
						</tr>
						<tr>
							<td>1</td>
							<td><div class="onsImg onsImgv">
									<img src="img/banimg.png">
								</div></td>
							<td>å±±ä¸å°±åª</td>
							<td>13312345678</td>
							<td>åäº¬å¸</td>
							<td>0.00<input class="vipinput" type="text" /><a
								class="vsAdd">å¢å </a></td>
							<td>æ»ç</td>
							<td><a href="connoisseuradd.html"><img class="operation"
									src="img/update.png"></a> <img class="operation delban"
								src="img/delete.png"></td>
						</tr>
					</table>
					<div class="paging">æ­¤å¤æ¯åé¡µ</div>
				</div>
				<!-- vip è¡¨æ ¼ æ¾ç¤º end-->
			</div>
			<!-- vipé¡µé¢æ ·å¼end -->
		</div>

	</div>


	<!-- å é¤å¼¹åºæ¡ -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="img/shanchu.png" /></a>
			</div>
			<p class="delP1">ä½ ç¡®å®è¦å é¤æ­¤æ¡è®°å½åï¼</p>
			<p class="delP2">
				<a href="#" class="ok yes">ç¡®å®</a><a class="ok no">åæ¶</a>
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
// å¹¿åå¼¹åºæ¡ end
</script>
</html>