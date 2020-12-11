<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>头部-有点</title>
<link rel="stylesheet" type="text/css" href="../css/public.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/public.js"></script>
</head>

<body>
	<!-- 头部 -->
	<div class="head">
		<div class="headL">
			<img class="headLogo" src="../img/headLogo.png" />
		</div>
		<div class="headR">
			<p class="p1">
				欢迎，
				${sessionScope.userInfo.accountName}
			</p>
			<p class="p2">
				<a href="#" class="resetPWD">重置密码</a>&nbsp;&nbsp;<a
					href="${pageContext.request.contextPath}/logout.do" class="goOut" target='_top'>退出</a>
			</p>
		</div>
		<!-- onclick="{if(confirm(&quot;确定退出吗&quot;)){return true;}return false;}" -->
	</div>

	<div class="closeOut">
		<div class="coDiv">
			<p class="p1">
				<span>X</span>
			</p>
			<p class="p2">确定退出当前用户？</p>
			<P class="p3">
				<a class="ok yes" href="logout.do">确定</a><a class="ok no" href="#">取消</a>
			</p>
		</div>
	</div>
</body>
</html>