<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>短消息系统-收件箱</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="shortcut icon" href="../images/favicon.ico">
</head>

<%-- 导入网页的头部 --%>
<%@include file="../mail/common/header.jsp" %>

<div style="padding: 30px;">
        <table class="layui-table" lay-data="{height:305, url:'/message/ajax/receive', page:true,
        id:'test2', skin: 'nob', even: true
        ,request: {
            pageName: 'pageNum',
            limitName: 'pageSize'}
        }" lay-filter="receiveTable">
            <thead>
            <tr>
                <th lay-data="{field:'id',hide:true}">ID</th>
                <th lay-data="{field:'status',templet:formatMsgStatus}">状态</th>
                <th lay-data="{field:'subject'}">标题</th>
                <th lay-data="{field:'createTime', sort: true}">时间</th>
                <th lay-data="{fixed: 'right', align:'center', toolbar: '#barDemo'}">操作</th>
            </tr>
            </thead>
        </table>
    </div>

<%-- 导入网页的底部 --%>
<%@include file="../mail/common/footer.jsp" %>

<!-- 加载js文件 -->
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function () {
        var laydate = layui.laydate //日期
            , layer = layui.layer //弹层
            , table = layui.table //表格
            , upload = layui.upload //上传
            , element = layui.element; //元素操作

        //监听行工具事件
        table.on('tool(receiveTable)', function (obj) {
            var data = obj.data;
            if (obj.event === 'del') {
                layer.confirm('真的要删除么？', function (index) {
                    $.getJSON('/delete/message', {id: data.id}, function (json) {
                        if (json.code === 0) {
                            layer.msg("删除成功！")
                            obj.del();
                        } else {
                            layer.msg("删除失败！")
                        }
                    })
                    layer.close(index);
                });
            } else if (obj.event === 'detail') {
                window.location.href = '/message/receive/readMessage?id=' + data.id;
            }
        });
    });

    function formatMsgStatus(obj) {
        if(obj.status == '1') {
            return '<img src="/static/images/sms_readed.png" />';
        } else if(obj.status == '2') {
            return '<img src="/static/images/sms_unReaded.png" />';
        }
    }
</script>

</body>
</html>
