<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录-有点</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet" type="text/css" href="css/page.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/public.js"></script>
</head>
<body>

	<!-- 登录页面头部 -->
	<div class="logHead">
		<img src="img/logLOGO.jpg" />
	</div>
	<!-- 登录页面头部结束 -->

	<!-- 登录body -->
	<div class="logDiv">
		<img class="logBanner" src="img/crm.jpg" width="100%" height="500px" />
		<div class="logGet">
			<!-- 头部提示信息 -->
			<div class="logD logDtip">
				<p class="p1">登录</p>
				<p class="p2" style="color: skyblue">企业人员登录</p>
			</div>
			<!-- 输入框 -->
			<form action="${pageContext.request.contextPath }/login.do" method="post">
			<div class="lgD">
				<img class="img1" src="img/logName.png" /><input type="text"
					placeholder="输入用户名" name="account" />
			</div>
			<div class="lgD">
				<img class="img1" src="img/logPwd.png" /><input type="text"
					placeholder="输入用户密码" name="password" />
			</div>
			<div class="lgD logD2">
				<input class="getYZM" type="text" />
				<div class="logYZM">
					<img class="yzm" src="img/logYZM.png" />
				</div>
			</div>
			<div class="logC">
				<button type="submit" style="background-color: skyblue">登 录</button>
			</div>
			</form>
		</div>
	</div>
	<!-- 登录body  end -->

	<!-- 登录页面底部 -->
	<div class="logFoot">
	</div>
	<!-- 登录页面底部end -->
</body>
</html>