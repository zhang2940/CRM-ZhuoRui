<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<base href="${pageContext.request.contextPath}/" />
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/input.css" />
	<script src="js/jquery.min.js"></script>
	<script src="js/send.js"></script>
	<script src="layui/layui.js"></script>
	<link rel="stylesheet" href="layui/css/layui.css" media="all">
</head>
<body>
	<header>
		<a href="javascript:history.back()"><i class="glyphicon glyphicon-chevron-left" title="返回"></i></a>
	</header>
	<article>
		<form id="form1" method="post" action="${pageContext.request.contextPath}/mail/sendmessage.do" class="form-inline">
			<dl>
				<dt>写邮件</dt>
				<dd>
				<label>收件人:</label> <select name="mailfrom" >
                        <option value="">直接选择或搜索选择</option>
                        <c:forEach items="${list}" var="user">
                            <option value="${user.accountId}">${user.accountName}</option>
                        </c:forEach>
                    </select></dd>
				<dd> <div class="layui-inline">
                <label class="layui-form-label">消息标题：</label>
                <div class="layui-input-block">
                    <input type="text" name="mailSubject" lay-verify="title" autocomplete="off" placeholder="请输入标题"
                           class="layui-input">
                </div>
            	</div>
            	</dd>
				<dd> 
				<div class="layui-form-item">
	            <div class="layui-form-item layui-form-text">
	                <label class="layui-form-label">消息内容：</label>
	                <div class="layui-input-block">
	                    <textarea class="layui-textarea layui-hide" name="mailContent" lay-verify="content"
	                              id="edit_message_content"></textarea>
	                </div>
	            </div>
	           </div>
              </dd>
				<dd class="btn-groups"><input type="submit" value="确定" class="btn btn-primary" />
					<input type="reset" value="重置" class="btn btn-success" /> 
				</dd>
			</dl>
		</form>
	</article>
</body>
</html>