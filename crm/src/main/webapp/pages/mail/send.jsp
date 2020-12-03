<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>短消息系统-收件箱</title>
    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
    <link rel="shortcut icon" href="../images/favicon.ico">
</head>

<%-- 导入网页的头部 --%>
<%@include file="../mail/common/header.jsp" %>

<!-- 内容主体区域 -->

    <form id="send" class="layui-form" method="post" enctype="multipart/form-data" action="/message/sendMessage"
          style="margin-top: 20px;">
        <div class="layui-form-item" >
            <div class="layui-inline" >
                <label class="layui-form-label">接收人：</label>
                <div class="layui-input-inline">
                    <select name="toId" lay-verify="" lay-search>
                        <option value="">直接选择或搜索选择</option>
                        <c:forEach items="${userList}" var="user">
                            <option value="${user.id}">${user.nickName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="layui-inline">
                <label class="layui-form-label">消息标题：</label>
                <div class="layui-input-block">
                    <input type="text" name="subject" lay-verify="title" autocomplete="off" placeholder="请输入标题"
                           class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">消息内容：</label>
                <div class="layui-input-block">
                    <textarea class="layui-textarea layui-hide" name="content" lay-verify="content"
                              id="edit_message_content"></textarea>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">附件：</label>
                <div class="layui-upload-drag" id="file">
                    <i class="layui-icon"></i>
                    <p>点击上传，或将文件拖拽到此处</p>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button id="submitBtn" class="layui-btn" lay-filter="demo1">发&nbsp;&nbsp;送</button>
            </div>
        </div>
    </form>

<jsp:include page="../mail/common/footer.jsp"/>

<script src="../js/send.js"></script>

</body>
</html>