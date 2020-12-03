<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>短消息系统-读消息</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/read.css">
    <link rel="shortcut icon" href="../images/favicon.ico">
</head>

<%-- 导入网页的头部 --%>
<%@include file="../mail/common/header.jsp" %>


<div style="padding: 15px;">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">
                    <c:if test="${from_page == 'send'}">
                        接收人：
                    </c:if>
                    <c:if test="${from_page == 'receive'}">
                        发送人：
                    </c:if>
                </label>
                <div class="layui-input-inline">
                    <label class="layui-form-label font">
                        <c:if test="${from_page == 'send'}">
                            ${toUser.nickName}
                        </c:if>
                        <c:if test="${from_page == 'receive'}">
                            ${fromUser.nickName}
                        </c:if>
                    </label>
                </div>
            </div>

            <div class="layui-inline">
                <div class="layui-form-label subject font">${message.subject}</div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">消息内容：</label>
                <div class="layui-input-block">
                    <pre class="layui-textarea" lay-verify="content">${message.content}</pre>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">附件：</label>
                <div class="layui-form-label attachment">
                    <a download href="${message.attachment}">${attachmentName}</a>
                </div>
            </div>
        </div>
        <a href="/user/getContact?id=${message.id}" style="position: relative;top: 100px; left: 45%;">
            <button type="button" class="layui-btn layui-btn-danger">
                <i class="layui-icon layui-icon-edit"></i>
                回信
            </button>
        </a>
    </div>

<%-- 导入网页的底部 --%>
<%@include file="../mail/common/footer.jsp" %>

<!-- 加载js文件 -->
<script type="text/javascript" src="/static/js/main.js"></script>
<script>

    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function () {
        var laydate = layui.laydate //日期
            , layer = layui.layer //弹层
            , table = layui.table //表格
            , upload = layui.upload //上传
            , element = layui.element; //元素操作
    });

</script>
</body>
</html>
