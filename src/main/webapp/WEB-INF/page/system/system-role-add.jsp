<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<%@include file="/WEB-INF/page/common/header.jsp"%>
<title>角色列表</title>
</head>
<body>
<article class="cl pd-20">
	<form action="https://www.baidu.com/" method="post" class="form form-horizontal" id="form-admin-role-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="roleName" name="roleName" datatype="*4-16" nullmsg="用户账户不能为空">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="" name="">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">管理权限：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<dl class="permission-list">
					<dd>
						<dl class="cl permission-list2">
							<dt>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-0" id="user-Character-0-0">
									设备管理</label>
							</dt>
							<dd id="DCheckBoxGroup">
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-0-0" id="user-Character-0-0-0">
									添加</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-0-0" id="user-Character-0-0-1">
									修改</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-0-0" id="user-Character-0-0-2">
									删除</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-0-0" id="user-Character-0-0-3">
									查找</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-0-0" id="user-Character-0-0-4">
									审核</label>
								<label class="c-orange"><input type="checkbox" value="" name="user-Character-0-0-0" id="user-Character-0-0-5"> 只能操作自己发布的</label>
							</dd>
							<input name="DeviceManage" id="DeviceManage" type="text" style="visibility: hidden">
						</dl>
						<dl class="cl permission-list2">
							<dt>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1" id="user-Character-0-1">
									车辆管理</label>
							</dt>
							<dd id="VCheckBoxGroup">
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-0">
									添加</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-1">
									修改</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-2">
									删除</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-3">
									查找</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-4">
									审核</label>
								<label class="c-orange"><input type="checkbox" value="" name="user-Character-0-2-0" id="user-Character-0-2-5"> 只能操作自己发布的</label>
							</dd>
							<input name="VehicleManage" id="VehicleManage" type="text" style="visibility: hidden">
						</dl>
						<dl class="cl permission-list2">
							<dt>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1" id="user-Character-0-1">
									房屋管理</label>
							</dt>
							<dd id="HCheckBoxGroup">
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-0">
									添加</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-1">
									修改</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-2">
									删除</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-3">
									查找</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-4">
									审核</label>
								<label class="c-orange"><input type="checkbox" value="" name="user-Character-0-2-0" id="user-Character-0-2-5"> 只能操作自己发布的</label>
							</dd>
							<input name="HouseManage" id="HouseManage" type="text" style="visibility: hidden">
						</dl>
						<dl class="cl permission-list2">
							<dt>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1" id="user-Character-0-1">
									土地管理</label>
							</dt>
							<dd id="LCheckBoxGroup">
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-0">
									添加</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-1">
									修改</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-2">
									删除</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-3">
									查找</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-4">
									审核</label>
								<label class="c-orange"><input type="checkbox" value="" name="user-Character-0-2-0" id="user-Character-0-2-5"> 只能操作自己发布的</label>
							</dd>
							<input name="LandManage" id="LandManage" type="text" style="visibility: hidden">
						</dl>
						<dl class="cl permission-list2">
							<dt>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1" id="user-Character-0-1">
									家具图书管理</label>
							</dt>
							<dd id="FBCheckBoxGroup">
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-0">
									添加</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-1">
									修改</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-2">
									删除</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-3">
									查找</label>
								<label class="">
									<input type="checkbox" value="" name="user-Character-0-1-0" id="user-Character-0-1-4">
									审核</label>
								<label class="c-orange"><input type="checkbox" value="" name="user-Character-0-2-0" id="user-Character-0-2-5"> 只能操作自己发布的</label>
							</dd>
							<input name="FBManage" id="FBManage" type="text" style="visibility: hidden">
						</dl>
					</dd>
				</dl>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<button onclick="confirm()" class="btn btn-success radius" id="admin-role-save" name="admin-role-save"><i class="icon-ok"></i> 确定</button>
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<%@include file="/WEB-INF/page/common/footer.jsp"%>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function(){
	$(".permission-list dt input:checkbox").click(function(){
		$(this).closest("dl").find("dd input:checkbox").prop("checked",$(this).prop("checked"));
	});
	$(".permission-list2 dd input:checkbox").click(function(){
		var l =$(this).parent().parent().find("input:checked").length;
		var l2=$(this).parents(".permission-list").find(".permission-list2 dd").find("input:checked").length;
		if($(this).prop("checked")){
			$(this).closest("dl").find("dt input:checkbox").prop("checked",true);
			$(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",true);
		}
		else{
			if(l==0){
				$(this).closest("dl").find("dt input:checkbox").prop("checked",false);
			}
			if(l2==0){
				$(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",false);
			}
		}
	});
	
	$("#form-admin-role-add").validate({
		rules:{
			roleName:{
				required:true,
			},
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);
		}
	});
});
function confirm(){
	var inputArr=$("#DCheckBoxGroup input");
	var DeviceManage="";
	inputArr.each(function(){
		if($(this).is(":checked")){
			DeviceManage+='1';
		}else{
			DeviceManage+='0';
		}
		$(this).attr("disabled","disabled");
	});
	$("#DeviceManage").attr("value",DeviceManage);

	inputArr=$("#VCheckBoxGroup input");
	var VehicleManage="";
	inputArr.each(function(){
		if($(this).is(":checked")){
			VehicleManage+='1';
		}else{
			VehicleManage+='0';
		}
		$(this).attr("disabled","disabled");
	});
	$("#VehicleManage").attr("value",VehicleManage);

	inputArr=$("#HCheckBoxGroup input");
	var HouseManage="";
	inputArr.each(function(){
		if($(this).is(":checked")){
			HouseManage+='1';
		}else{
			HouseManage+='0';
		}
		$(this).attr("disabled","disabled");
	});
	$("#HouseManage").attr("value",HouseManage);

	inputArr=$("#LCheckBoxGroup input");
	var LandManage="";
	inputArr.each(function(){
		if($(this).is(":checked")){
			LandManage+='1';
		}else{
			LandManage+='0';
		}
		$(this).attr("disabled","disabled");
	});
	$("#LandManage").attr("value",LandManage);

	inputArr=$("#FBCheckBoxGroup input");
	var FBManage="";
	inputArr.each(function(){
		if($(this).is(":checked")){
			FBManage+='1';
		}else{
			FBManage+='0';
		}
		$(this).attr("disabled","disabled");
	});
	$("#FBManage").attr("value",FBManage);

	$("form").submit();
}
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
