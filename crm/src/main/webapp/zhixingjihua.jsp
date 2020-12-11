<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
				<img src="img/coin02.png" /><span><a id="shou"
					onclick="fun()">首页</a>&nbsp;-&nbsp;<a href="zhidingkaifa.jsp">客户开发计划</a>&nbsp;-
					&nbsp;&nbsp;<a href="zhiji.do?sellId=${zhiji[0].sellId}">制定计划</a>&nbsp;-
					&nbsp;&nbsp;<a href="zhixingjihua.jsp?sellId=${zhiji[0].sellId}">执行计划</a>&nbsp;</span>
			</div>&
		</div>

		<form style="width: 100%; position: fixed; left: 200px; top: 110px"
			action="gaixiao.do?" method="post">
			<table style="transform: translate(0, 0); width: 60%" border="1"
				cellspacing="0" cellpadding="0">
				<tr>
					<input type="hidden" name="accountId" value="${userInfo.accountId}">
					<td width="25%" class="tdColor tdC">编号：</td>
					<td width="25%" class="tdColor "><input public
						readonly="readonly" type="text" name="sellId"
						value="${zhiji[0].sellId }"></td>
					<td width="25%" class="tdColor">机会来源：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						type="text" name="opportunitySource"
						value="${zhiji[0].opportunitySource }"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">客户名称：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						type="text" required="required" name="customerName"
						value="${zhiji[0].customerName}"></td>
					<td width="25%" class="tdColor">成功几率：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						required="required" type="text" name="successProbability"
						value="${zhiji[0].successProbability}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC" colspan="1">概要:</td>
					<td width="25%" class="tdColor" colspan="3"><input
						readonly="readonly" required="required"
						style="width: 70%; height: 90%; left: 100px" type="text"
						name="summary" value="${zhiji[0].summary}"></td>


				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">联系人：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						type="text" name="contacts" value="${zhiji[0].contacts}"></td>
					<td width="25%" class="tdColor">联系电话：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						type="text" name="contactsPhone"
						value="${zhiji[0].contactsPhone }"></td>
				</tr>
				<tr>
					<td width="25%" class="tdColor tdC" colspan="1">机会描述：</td>
					<td width="25%" class="tdColor" colspan="3"><textarea
							readonly="readonly" name="opportunityDescrible"
							required="required" rows="5" cols="7"
							style="overflow: scroll; overflow-x: hidden; resize: none; width: 70%">${zhiji[0].opportunityDescrible}</textarea></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">创建人：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						required="required" type="text" name="creator"
						value="${zhiji[0].creator}"></td>
					<td width="25%" class="tdColor">创建时间：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						id="chuangjian" required="required" type="text"
						name="creationTime" value="${zhiji[0].creationTime}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">指派人：</td>
					<td width="25%" class="tdColor"><input type="text"
						readonly="readonly" value="${chaj[0].accountName}"></td>
					<td width="25%" class="tdColor">指派时间：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						id="zhipai" type="text" name="designatedTime"
						value="${zhiji[0].designatedTime}"></td>
					<%-- <div
						style="position: absolute; left: 55%; top: -50px; display: inline-block;">
						<a><a href="kaisuccess.do?sellId=${zhiji[0].sellId }"
							style="border: white; top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1">开发成功</a></a>
					</div> --%>
					&nbsp;&nbsp;
					<div
						style="position: absolute; left: 45%; top: -50px; display: inline-block;">
						<a
							style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
							href="zhidingjihua.jsp?accountId=${userInfo.accountId}&pageNum=1">返回</a>
							<a
							style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
							href="kekai.do?accountId=${userInfo.accountId}&pageNum=1">中止开发</a>
								<a
							style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
							href="kaisuccess.do?sellId=${zhiji[0].sellId}&accountId=${userInfo.accountId}">开发成功</a>
							
					</div>
					<div style="height: 20px"></div>
			</table>
		</form>


		<form style="width: 100%; position: fixed; left: 200px; top: 530px"
			action="jianzhixing.do">
			<table style="width: 60%;" border="1" cellspacing="0" cellpadding="0">
				<tr>
					<td style="background-color: #4390B9; color: white;" colspan="1"
						width="25%" class="tdColor">日期</td>
					<td style="background-color: #4390B9; color: white;" colspan="1"
						width="25%" class="tdColor">计划项</td>
					<td style="background-color: #4390B9; color: white;" colspan="1"
						width=25% "%" class="tdColor">执行效果</td>
					<td style="background-color: #4390B9; color: white;" colspan="1"
						width=25% "%" class="tdColor">状态</td>
				</tr>

				<c:forEach items="${jihuaxiang}" var="jihuaxiang">
					<tr height="85px">

						<td>${jihuaxiang.planDate}</td>
						<td>${jihuaxiang.planProject}</td>
						<td><input type="hidden" name="planId" value="${jihuaxiang.planId}">
						<input type="hidden" name="sellId" value="${zhiji[0].sellId }">
						<input type="text" name="palnImplementationEffect" value="${jihuaxiang.palnImplementationEffect}"><input type="submit" value="保存"></td>
					      <td><input type="text" readonly="readonly"
							value="${zhiji[0].distribution}"></td>
					      </tr>
				</c:forEach>
			</table>
		</form>


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
	window.onload = function() {

		document.getElementById("shou").onclick = function() {
			top.location.href = "index.jsp";
		}

		/* 	document.getElementById("chuangjian").onclick = function() {
				document.getElementById("chuangjian").type="datetime-local";
				
			}
			document.getElementById("zhipai").onclick = function() {
				document.getElementById("zhipai").type="datetime-local";
				
			} */
		document.getElementById("zhipairen").onclick = function() {
			var zi = document.getElementById("zi");
			var z = document.getElementById("zhipairen");
			document.getElementById("zhipairen").removeChild(zi);
			/*  var html='<c:forEach items="${chaaccount}" var="we">' +
			    '<option value="dsd">nihao</option> ' +
			    '</c:forEach>';
			 document.getElementById("zhipairen").append(html);
			 $.parser.parse(z); */
			$.ajax({
				type : "POST",
				dataType : "json",
				url : "acha.do",
				success : function(data) {
					if (data != null && data != "") {
						var html = "";
						for (var i = 0; i < data.length; i++) {
							html += "<option value="+data[i].accountId+">"
									+ data[i].accountName + "</option>"
						}
						$("#zhipairen").html(html);

					}

				}

			})

		}

	}
	// 广告弹出框
	$(".zhan12").click(function() {
		$(".banDel").show();
	});
	$(".close").click(function() {
		$(".banDel").hide();
	});
	$(".no").click(function() {
		$(".banDel").hide();
	});
	// 广告弹出框 end
</script>
</html>