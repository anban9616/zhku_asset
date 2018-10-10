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
<title>添加设备类型 - 设备类型管理 - H-ui.admin v3.1</title>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-deviceType-edit">
	<input name="id" type="hidden" value="${requestScope.deviceType.id }">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>设备类型名：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.name }" placeholder="" id="name" name="name">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>品牌：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.brand }" placeholder="" id="brand" name="brand">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>国际编码：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.intlcode }" placeholder="" id="intlcode" name="intlcode">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>型号：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.model }" placeholder="" id="model" name="model">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>备注：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.remarks }" placeholder="" id="remarks" name="remarks">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>使用年限：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.asl }" placeholder="" id="asl" name="asl">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>预计残净值：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${requestScope.deviceType.anrv }" placeholder="" id="anrv" name="anrv">
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
	$("#form-deviceType-edit").validate({
		rules:{
			name:{
				required:true,
				minlength: 1,
				maxlength: 50
			},
			brand:{
				required:true,
				minlength: 1,
				maxlength: 100
			},
			remarks:{
				maxlength: 200
			},
			intlcode:{
				required:true,
				minlength: 5,
				maxlength: 100
			},
			model:{
				required:true,
				minlength: 5,
				maxlength: 100
			},
			asl:{
				required:true,
				minlength: 1,
				maxlength: 3,
				digits:true,
			},
			anrv:{
				required:true,
				number:true,
				minlength: 1,
				maxlength: 10
			},	
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				async:false,
				type: 'post',
				url: "${applicationScope.path }/deviceType/editAfter",
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