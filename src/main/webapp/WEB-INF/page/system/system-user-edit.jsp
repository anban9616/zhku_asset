<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<%@include file="/WEB-INF/page/common/header.jsp" %>
<title>编辑管理员 - 管理员管理 - H-ui.admin v3.1</title>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-admin-add">
	<input name="id" type="hidden" value="${userPage.id }">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>管理员：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${userPage.name}" placeholder="" id="adminName" name="name">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>初始密码：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="password" class="input-text" autocomplete="off" value="${userPage.pwd }" placeholder="密码" id="password" name="pwd">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>确认密码：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="password" class="input-text" autocomplete="off" value="${userPage.pwd }"  placeholder="确认新密码" id="password2" name="pwd2">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性别：</label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<c:if test="${userPage.sex==1 }">
					<input type="radio" id="sex-1" name="sex" value="1" checked="checked">
				</c:if>
				<c:if test="${userPage.sex!=1 }">
					<input type="radio" id="sex-1" name="sex" value="1">
				</c:if>
				<label for="sex-1">男</label>
			</div>
			<div class="radio-box">
				<c:if test="${userPage.sex==2 }">
					<input type="radio" id="sex-2" name="sex" value="2" checked="checked">
				</c:if>
				<c:if test="${userPage.sex!=2 }">
					<input type="radio" id="sex-2" name="sex" value="2">
				</c:if>
				<label for="sex-2">女</label>
			</div>
			<div class="radio-box">
				<c:if test="${userPage.sex==3 }">
					<input type="radio" id="sex-3" name="sex" value="3" checked="checked">
				</c:if>
				<c:if test="${userPage.sex!=3 }">
					<input type="radio" id="sex-3" name="sex" value="3">
				</c:if>
				<label for="sex-3">保密</label>
			</div>
		</div>
	</div>
	<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>生日：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value='<fmt:formatDate value="${userPage.birth }"/>' placeholder="" id="birth" name="birthStr">
			</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>手机：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${userPage.phone }" placeholder="" id="phone" name="phone">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>邮箱：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" placeholder="@" name="email" id="email" value="${userPage.email }">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">角色：</label>
		<div class="formControls col-xs-8 col-sm-9"> 
			<span class="select-box" style="width:150px;">
			<select class="select" name="rid" size="1">
				<c:forEach var="item" items="${requestScope.roleList }">
					<option value="${item.id }" ${(userPage.role eq item.name)?'selected':'' }>${item.name }</option>
				</c:forEach>
			</select>
			</span> 
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">部门：</label>
		<div class="formControls col-xs-8 col-sm-9"> 
			<span class="select-box" style="width:150px;">
			<select class="select" name="ogid" size="1">
				<c:forEach var="item" items="${requestScope.organizationList }">
					<option value="${item.id }" ${(userPage.organization eq item.name)?'selected':'' }>${item.name }</option>
				</c:forEach>
			</select>
			</span> 
		</div>
	</div>
	
	
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		</div>
	</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去--> 
<%@include file="/WEB-INF/page/common/footer.jsp" %>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript" src="${applicationScope.path }/lib/laydate/laydate.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	laydate.render({
		  elem: '#birth'
		  ,type: 'date'
		});
	$("#form-admin-add").validate({
		rules:{
			name:{
				required:true,
				minlength:4,
				maxlength:16
			},
			pwd:{
				required:true,
			},
			pwd2:{
				required:true,
				equalTo: "#password"
			},
			sex:{
				required:true,
			},
			birthStr:{
				required:true,
			},
			phone:{
				required:true,
				isPhone:true,
			},
			email:{
				required:true,
				email:true,
			},
			rid:{
				required:true,
			},
			ogid:{
				required:true,
			},
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				async:false,
				type: 'post',
				url: "${applicationScope.path }/user/editAfter",
				success: function(data){
					if(data){
						layer.msg('修改成功!',{icon:1,time:1000});
					}else{
						layer.msg('修改失败!',{icon: 2,time:1000});
					}
				},
                error: function(XmlHttpRequest, textStatus, errorThrown){
					layer.msg('error!',{icon:2,time:1000});
				}
			});
			setTimeout(function() {
				var index = parent.layer.getFrameIndex(window.name);
				parent.$('#shuaxin').click();
				parent.layer.close(index);
			}, "1000");
			
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>