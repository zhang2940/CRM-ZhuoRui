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
					onclick="fun()">首页</a>&nbsp;-&nbsp;<a
					href="kexin.do?accountId=${userInfo.accountId}">客户信息管理</a>&nbsp;-
					&nbsp;&nbsp;<a href="kehuxinxi.jsp">客户信息</a>&nbsp;-</span>
			</div>
		</div>
		<form style="width: 100%; position: fixed; left: 200px; top: 160px"
			action="gaikexin.do?" method="post">
			<table style="transform: translate(0, 0); width: 60%" border="1"
				cellspacing="0" cellpadding="0">
				<tr>
					<input type="hidden" name="accountId" value="${userInfo.accountId}">
					<td width="25%" class="tdColor tdC">客户编号：</td>
					<td width="25%" class="tdColor "><input public
						readonly="readonly" type="text" name="clientId"
						value="${xiangxin.clientId}"></td>
					<td width="25%" class="tdColor">名称：</td>
					<td width="25%" class="tdColor"><input type="text"
						name="clientName" value="${xiangxin.clientName}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">地区：</td>
					<td width="25%" class="tdColor"><input type="text"
						required="required" name="clientArea"
						value="${xiangxin.clientArea}"></td>
					<td width="25%" class="tdColor">客户经理：</td>
					<td width="25%" class="tdColor"><input readonly="readonly"
						required="required" type="text" name="manager"
						value="${xiangxin.manager}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC" colspan="1">客户等级:</td>
					<td width="25%" class="tdColor" colspan="1"><select
						style="width: 170px" name="clientGrade">
							<option value="战略合作伙伴" <c:if test="${xiangxin.clientGrade eq '战略合作伙伴'}">selected</c:if> >战略合作伙伴</option>
							<option value="VIP客户" <c:if test="${xiangxin.clientGrade eq 'VIP客户'}">selected</c:if>>VIP客户</option>

							<option value="重点客户" <c:if test="${xiangxin.clientGrade eq '重点用户'}">selected</c:if>>重点客户</option>
							<option value="普通客户" <c:if test="${xiangxin.clientGrade eq '普通用户'}">selected</c:if>>普通客户</option>
					</select></td>
					<td class="tdColor" colspan="2"></td>
				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">客户满意度：</td>
					<td width="25%" class="tdColor"><select style="width: 170px"
						name="clientSatisfaction">
							<option value="很满意" <c:if test="${xiangxin.clientSatisfaction eq '很满意'}">selected</c:if> >很满意</option>
							<option value="满意" <c:if test="${xiangxin.clientSatisfaction eq '满意'}">selected</c:if> >满意</option>
							<option value="一般" <c:if test="${xiangxin.clientSatisfaction eq '一般'}">selected</c:if> >一般</option>
							<option value="不满意" <c:if test="${xiangxin.clientSatisfaction eq '不满意'}">selected</c:if> >不满意</option>
							<option value="很不满意" <c:if test="${xiangxin.clientSatisfaction eq '很不满意'}">selected</c:if> >很不满意</option>
					</select></td>
					<td width="25%" class="tdColor">客户信用度：</td>
					<td width="25%" class="tdColor"><select style="width: 170px"
						 name="clientCreditStatus">
							<option value="诚信" <c:if test="${xiangxin.clientCreditStatus eq '诚信'}">selected</c:if>>诚信</option>
							<option value="守信" <c:if test="${xiangxin.clientCreditStatus eq '守信'}">selected</c:if>>守信</option>
							<option value="信用警示" <c:if test="${xiangxin.clientCreditStatus eq '信用警示'}">selected</c:if>> >信用警示</option>
							<option value="黑名单" <c:if test="${xiangxin.clientCreditStatus eq '黑名单'}">selected</c:if>>>黑名单</option>
					</select></td>
				</tr>

				<tr>
					<td width="25%" class="tdColor tdC">地址：</td> 
					<td width="25%" class="tdColor"><input type="text" required="required"
						name="clientAddress" value="${xiangxin.clientAddress}"></td>
					<td width="25%" class="tdColor">邮政编码：</td> 
					<td width="25%" class="tdColor"><input type="text" required="required"
						name="clientPostalCode" value="${xiangxin.clientPostalCode}"></td>
				</tr>

				<tr>
					<td width="25%" class="tdColor tdC">电话：</td>
					<td width="25%" class="tdColor"><input required="required"
						type="text" name="clientPhoneNumber" value="${xiangxin.clientPhoneNumber}"></td>
					<td width="25%" class="tdColor">传真：</td>
					<td width="25%" class="tdColor"><input required="required" type="text" name="clientFaxes"
						value="${xiangxin.clientFaxes}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">网址：</td>
					<td width="25%" class="tdColor"><input type="text"
						name="clientWebsite" value="${xiangxin.clientWebsite}"></td>
					<td width="25%" class="tdColor" colspan="2"></td>

				</tr>

				<tr>
					<td width="25%" class="tdColor tdC">营业执照注册号：</td>
					<td width="25%" class="tdColor"><input type="text"
						name="clientBusinessLicense" value="${xiangxin.clientBusinessLicense}"></td>
					<td width="25%" class="tdColor">法人：</td>
					<td width="25%" class="tdColor"><input type="text" required="required"
						name="clientLegalPerson" value="${xiangxin.clientLegalPerson}"></td>
				</tr>



				<tr>
					<td width="25%" class="tdColor tdC">注册资金(万元)：</td>
					<td width="25%" class="tdColor"><input required="required"
						type="text" name="clientRegisteredFund"
						value="${xiangxin.clientRegisteredFund}"></td>
					<td width="25%" class="tdColor">年营业额(万元)：</td>
					<td width="25%" class="tdColor"><input
						required="required" type="text" name="clientYearSalesVolume"
						value="${xiangxin.clientYearSalesVolume}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">开户银行：</td>
					<td width="25%" class="tdColor"><input required="required"
						type="text" name="clientBankDeposit" value="${xiangxin.clientBankDeposit}"></td>
					<td width="25%" class="tdColor">银行账号：</td>
					<td width="25%" class="tdColor"><input
						required="required" type="text" name="clientBankAccount"
						value="${xiangxin.clientBankAccount}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">地税登记号：</td>
					<td width="25%" class="tdColor"><input required="required"
						type="text" name="clientLocalNumber" value="${xiangxin.clientLocalNumber}"></td>
					<td width="25%" class="tdColor">国税登记号：</td>
					<td width="25%" class="tdColor"><input
						required="required" type="text" name="clientNationalNumber"
						value="${xiangxin.clientNationalNumber}"></td>

				</tr>



				
				&nbsp;&nbsp;
				<div
					style="position: absolute; left: 35%; top: -50px; display: inline-block;">
					<a style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="kexinguan.do?accountId=${userInfo.accountId}&pageNum=1">返回</a>
					
					
					<a style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1">
					<input style="background-color: #47A4E1;border: 0px;color: white;" type="submit" value="修改"></a>
					
					
					<a style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="lianxiren.do?clientId=${xiangxin.clientId}">联系人</a>
						<a style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="jiaowangjl.do?">交往记录</a> <a
						style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
						href="showlishidd.do?clientId=${xiangxin.clientId}">历史订单</a>

				</div>
				<div style="height: 20px"></div>
			</table>
		</form>

		<!-- balance 表格 显示 end-->
	</div>
	<!-- balance页面样式end -->
	</div>

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

		document.getElementById("chuangjian").onclick = function() {
			document.getElementById("chuangjian").type = "datetime-local";

		}
		document.getElementById("zhipai").onclick = function() {
			document.getElementById("zhipai").type = "datetime-local";

		}
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