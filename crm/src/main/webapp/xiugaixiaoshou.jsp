<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
					onclick="fun()">首页</a>&nbsp;-&nbsp;<a href="xiaoshoujihui.jsp">销售机会管理</a>&nbsp;-
					&nbsp;&nbsp;<a href="chaxiuxiao.do?sellId=${chaxiu[0].sellId}">修改销售机会</a>&nbsp;-</span>
			</div>
		</div>
		<form style="width: 100%; position: fixed; left: 200px; top: 160px"
			action="gaixiao.do?" method="post">
			<table style="transform: translate(0, 0); width: 60%" border="1"
				cellspacing="0" cellpadding="0">
				<tr><input type="hidden" name="accountId" value="${userInfo.accountId}">
					<td width="25%" class="tdColor tdC">编号：</td>
					<td width="25%" class="tdColor "><input public  readonly="readonly" type="text" name="sellId"
						value="${chaxiu[0].sellId }"></td>
					<td width="25%" class="tdColor">机会来源：</td>
					<td width="25%" class="tdColor"><input type="text" name="opportunitySource"
						value="${chaxiu[0].opportunitySource }"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">客户名称：</td>
					<td width="25%" class="tdColor"><input type="text"
						required="required" name="customerName" value="${chaxiu[0].customerName}"></td>
					<td width="25%" class="tdColor">成功几率：</td>
					<td width="25%" class="tdColor"><input required="required"
						type="text" name="successProbability" value="${chaxiu[0].successProbability}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC" colspan="1">概要:</td>
					<td width="25%" class="tdColor" colspan="3"><input
						required="required" style="width: 70%; height: 90%; left: 100px"
						type="text" name="summary" value="${chaxiu[0].summary}"></td>


				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">联系人：</td>
					<td width="25%" class="tdColor"><input type="text" name="contacts"
						value="${chaxiu[0].contacts}"></td>
					<td width="25%" class="tdColor">联系电话：</td>
					<td width="25%" class="tdColor"><input type="text" name="contactsPhone"
						value="${chaxiu[0].contactsPhone }"></td>
				</tr>
				<tr>
					<td width="25%" class="tdColor tdC" colspan="1">机会描述：</td>
					<td width="25%" class="tdColor" colspan="3"><textarea name="opportunityDescrible"
							required="required" rows="5" cols="7"
							style="overflow: scroll; overflow-x: hidden; resize: none; width: 70%">${chaxiu[0].opportunityDescrible}</textarea></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">创建人：</td>
					<td width="25%" class="tdColor"><input required="required"
						type="text" name="creator" value="${chaxiu[0].creator}"></td>
					<td width="25%" class="tdColor">创建时间：</td>
					<td width="25%" class="tdColor"><input id="chuangjian" required="required"
						type="text" name="creationTime" value="${chaxiu[0].creationTime}"></td>

				</tr>
				<tr>
					<td width="25%" class="tdColor tdC">指派人：</td>
					<td width="25%" class="tdColor">
					<select id="zhipairen" name="designatedPerson" style="width: 162px">
									<option id="zi" value="${chaxiuaccount[0].accountId}">${chaxiuaccount[0].accountName}</option>
							
						</select></td>
					<td width="25%" class="tdColor">指派时间：</td>
					<td width="25%" class="tdColor"><input id="zhipai" type="text" name="designatedTime"
						value="${chaxiu[0].designatedTime}"></td>
					<div
						style="position: absolute; left: 55%; top: -50px; display: inline-block;">
						<a><input
							style="border: white; top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
							type="submit" value="修改"></a>
					</div>
					&nbsp;&nbsp;
					<div style="position: absolute; left: 48%; top: -50px; display: inline-block;">
						<a
							style="top: 160px; display: inline-block; width: 80px; height: 27px; text-decoration: none; text-align: center; line-height: 25px; color: white; background-color: #47A4E1"
							href="show.do?accountId=${userInfo.accountId}&pageNum=1">返回</a>
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
			document.getElementById("chuangjian").type="datetime-local";
			
		}
		document.getElementById("zhipai").onclick = function() {
			document.getElementById("zhipai").type="datetime-local";
			
		}
		document.getElementById("zhipairen").onclick = function() {
			var zi=document.getElementById("zi");
			var z=document.getElementById("zhipairen");
			document.getElementById("zhipairen").removeChild(zi);
		   /*  var html='<c:forEach items="${chaaccount}" var="we">' +
		       '<option value="dsd">nihao</option> ' +
		       '</c:forEach>';
		    document.getElementById("zhipairen").append(html);
		    $.parser.parse(z); */
		    $.ajax({
		    	  type: "POST",
		             dataType:"json",
		             url: "acha.do",
		             success: function(data){
		            	 if (data != null && data != "") {
		            		   var html="";
		            		   for (var i = 0; i < data.length; i++) { 
		            			   html+="<option value="+data[i].accountId+">"
		            			   +data[i].accountName+
		            			   "</option>"
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