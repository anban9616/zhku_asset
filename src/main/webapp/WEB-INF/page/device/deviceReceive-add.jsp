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
<title>添加设备领取 - 设备领取管理 - H-ui.admin v3.1</title>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-deviceReceive-add">
	<!-- 部门 -->
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">设备流水号：</label>
		<div class="formControls col-xs-8 col-sm-9"> 
			<span class="select-box" style="width:150px;">
			<select class="select" name="did" size="1">
				<c:forEach var="item" items="${requestScope.deviceList }">
					<option value="${item.id }" >${item.code }</option>
				</c:forEach>
			</select>
			</span> 
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>领取备注：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="" placeholder="" id="rcRemarks" name="rcRemarks">
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
	$("#form-deviceReceive-add").validate({
		rules:{
			rcRemarks:{
				required:true,
				minlength: 1,
				maxlength: 200
			},
			did:{
				required: true,
			}
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				async:false,
				type: 'post',
				url: "${applicationScope.path }/deviceReceive/addAfter",
				success: function(data){
					if(data){
						layer.msg('添加成功!',{icon:1,time:1000});
					}else{
						layer.msg('添加失败!',{icon: 2,time:1000});
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