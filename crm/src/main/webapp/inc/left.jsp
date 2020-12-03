<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="../js/jquery.min.js"></script>
<title>首页左侧导航</title>
<!--  <link rel="stylesheet" href="../css/index.css">-->
<script type="text/javascript" src="../js/jquery.min.js"></script>
<link rel="stylesheet" href="../font-awesome-4.7.0/css/font-awesome.css">
<script type="text/javascript" src="../js/public.js"></script>
</head>
<script type="text/javascript">
//页面加载完毕后执行
$(function() {
	var ul = $(self.parent.frames[2].document).find("#sections").children('ul');
	var li = $(self.parent.frames[2].document).find("#sections").children('ul').children('li');
	//alert(self.parent.frames[2].document.getElementById("sections").childNodes);
	//console.log($(self.parent.frames[2].document).find("#sections").children('ul').children('li'));
	// $(self.parent.frames[2].document).find("#sections")
	//父级菜单节点绑定事件
	$('aside ul li.active').on('click', function() {
		//获得父节点ID
		var parentId = $(this).attr('id');
		//获得所有子节点
		var subNodes = $('aside ul li[data-parentId="'+parentId+'"]');
		//打开或关闭子菜单
		subNodes.slideToggle();
	});
	//标签页首页节点绑定单击事件
	li.on('click', function() {
		li.removeClass('active');
		$(this).addClass('active');
	});
	//子级父级节点绑定事件
	$('aside ul li[data-url]').on('click', function() {
		//获得当前子节点
		var subNode = $(this);
		//获得ID
		var id = subNode.attr("id");
		//获得URL
		var url = subNode.attr("data-url");
		url = "${pageContext.request.contextPath }/"+url;
		
		//判断是否是禁用连接
		if(url == 'javascript:void(0);') {
			return;
		}
		//获得名称
		var name = subNode.children("a").text();
		//标签栏中追加标签
		//获得标签栏
		var tabs = ul;
		//通过当前ID属性选取子元素，获得当前子节点
		var currentNode = tabs.children('li[id="'+id+'"]');
		//判断当前子元素是否不存在
		if(currentNode.length == 0) {
			//添加标签
			tabs.append('<li id="'+id+'" class="active"><a href="'+url+'" target="main">'
					+name+'</a>'+'<i class="glyphicon glyphicon-remove"></i></li>');
			//获取当前子节点
			var currentNode = tabs.children('li[id="'+id+'"]');
			//当前子节点绑定事件
			currentNode.on('click', function() {
				li.removeClass('active');
				$(this).addClass('active');
			});
			//标签关闭按钮绑定事件
			currentNode.children('i').on('click', function() {
				//获得父级节点
				var parentNode = $(this).parent();
				//判断是否是激活状态
				if(parentNode.attr('class') == 'active') {
					//获得兄弟级元素
					var siblingNode = parentNode.next();
					if(siblingNode.length == 0) {
						siblingNode = parentNode.prev();
					}
					//设置激活状态
					li.removeClass('active');
					siblingNode.addClass('active');
					//单击节点中超链接
					siblingNode.children('a').get(0).click();
				}
				//删除父级节点
				parentNode.remove();
			});
		}
		//清除所有子节点的激活状态
		tabs.children('li').removeClass('active');
		//当前子节点设置激活状态
		currentNode.addClass('active');
		//主页面区域显示新的网页
		self.parent.frames[3].document.location.href = url;
	});
});
</script>
<style>
	ul li{
		list-style: none;
	}
	.active{
		text-align: center;
		height:30px;
		width:200px;
		margin-left:0;
		background-color: rgba(0,25,125,0.8);
		padding:0;
		
	}
	ul li a{
		text-decoration: none;
		display:block;
		width:200px;
		height:30px;
		color:black;
		text-align: center;
	}
	.fathermnue{
		color:white;
		text-align: center;
	}
	.childmnue{
		color:skyblue;
		text-align: center;
	}
</style>

<body id="bg">
	<!-- 左边节点 -->
	<div class="container">

		<div class="leftsidebar_box">
		<aside>
				<ul style="padding:0">
				<c:forEach var="perm" items="${sessionScope.userInfo.crmRole.crmPermissions }">
					<li ${perm.permParentId==null ? "class='active'" : ""} id="${perm.permId}" 
						data-parentId="${perm.permParentId}" ${perm.permUrl==null ? "" : "data-url=\"".concat(perm.permUrl).concat("\"")}>
						
					    <a href="${pageContext.request.contextPath }/${perm.permUrl == null ? 'javascript:void(0)' : perm.permUrl }"
					     class="${perm.permUrl == null ? 'fathermnue' :'childmnue'}" 
					    target="main"><i class="${perm.permUrl==null ? perm.permImg : ' '}  fa-lg" aria-hidden="true"></i>&nbsp;${perm.permName }</a></li>
				</c:forEach>
			</ul>
			</aside>
		</div>

	</div>

</body>
</html>
