<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<%@include file="/WEB-INF/page/common/header.jsp"%>
<title>编辑角色 - 角色管理 - H-ui.admin v3.1</title>
</head>
<body>
	<article class="page-container">
		<form class="form form-horizontal" id="form-admin-add">
			<input name="id" type="hidden" value="${requestScope.role.id }">
			<input name="systemPower" type="hidden" value="${requestScope.role.systemPower }"/>
			<input name="devicePower" type="hidden" value="${requestScope.role.devicePower }"/>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色名称：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${requestScope.role.name }" placeholder="" id="roleName" name="name">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">备注：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="${requestScope.role.remarks }" placeholder="" id="remarks" name="remarks">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">网站角色：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<dl class="permission-list">
						<dt>
							<label>系统管理</label>
						</dt>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">用户管理</label>
								</dt>
								<dd id="userList">
									<label class=""> <input type="radio" value="0" name="userPower" id="user0" > 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="userPower" id="user1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="userPower" id="user2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="userPower" id="user3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="userPower" id="role4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">角色管理</label>
								</dt>
								<dd id="roleList">
									<label class=""> <input type="radio" value="0" name="rolePower" id="role0" > 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="rolePower" id="role1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="rolePower" id="role2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="rolePower" id="role3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="rolePower" id="role4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">部门管理</label>
								</dt>
								<dd id="organizationList">
									<label class=""> <input type="radio" value="0" name="organizationPower" id="organization0" > 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="organizationPower" id="organization1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="organizationPower" id="organization2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="organizationPower" id="organization3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="organizationPower" id="organization4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
					</dl>
					<dl class="permission-list">
						<dt>
							<label>设备管理</label>
						</dt>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">设备登记</label>
								</dt>
								<dd id="deviceInList">
									<label class=""> <input type="radio" value="0" name="deviceInPower" id="deviceIn0" > 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="deviceInPower" id="deviceIn1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="deviceInPower" id="deviceIn2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="deviceInPower" id="deviceIn3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="deviceInPower" id="deviceIn4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">设备领取</label>
								</dt>
								<dd id="deviceReceiveList">
									<label class=""> <input type="radio" value="0" name="deviceReceivePower" id="deviceReceive0"> 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="deviceReceivePower" id="deviceReceive1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="deviceReceivePower" id="deviceReceive2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="deviceReceivePower" id="deviceReceive3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="deviceReceivePower" id="deviceReceive4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">设备报修</label>
								</dt>
								<dd id="deviceRepairList">
									<label class=""> <input type="radio" value="0" name="deviceRepairPower" id="deviceRepair0"> 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="deviceRepairPower" id="deviceRepair1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="deviceRepairPower" id="deviceRepair2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="deviceRepairPower" id="deviceRepair3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="deviceRepairPower" id="deviceRepair4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">设备类型</label>
								</dt>
								<dd id="deviceTypeList">
									<label class=""> <input type="radio" value="0" name="deviceTypePower" id="deviceType0" > 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="deviceTypePower" id="deviceType1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="deviceTypePower" id="deviceType2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="deviceTypePower" id="deviceType3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="deviceTypePower" id="deviceType4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
						<dd>
							<dl class="cl permission-list2">
								<dt>
									<label class="">设备报废</label>
								</dt>
								<dd id="deviceOutList">
									<label class=""> <input type="radio" value="0" name="deviceOutPower" id="deviceOut0"> 无权限  </label> 
									<label class=""> <input type="radio" value="1" name="deviceOutPower" id="deviceOut1"> 查看  </label> 
									<label class=""> <input type="radio" value="2" name="deviceOutPower" id="deviceOut2"> 查看增加  </label> 
									<label class=""> <input type="radio" value="3" name="deviceOutPower" id="deviceOut3"> 查看增加修改  </label> 
									<label class=""> <input type="radio" value="4" name="deviceOutPower" id="deviceOut4"> 查看增加修改删除  </label> 
								</dd>
							</dl>
						</dd>
					</dl>
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
	<%@include file="/WEB-INF/page/common/footer.jsp"%>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript" src="${applicationScope.path }/lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript" src="${applicationScope.path }/lib/laydate/laydate.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
			function check(){
				var systemVal = Number($(":input[name='systemPower']").val());
				$(":input[name='userPower']").eq(Math.floor((systemVal/100))%10).attr("checked","checked");
				$(":input[name='rolePower']").eq(Math.floor((systemVal/10))%10).attr("checked","checked");
				$(":input[name='organizationPower']").eq(systemVal%10).attr("checked","checked");
				
				var deviceVal = Number($(":input[name='devicePower']").val());
				$(":input[name='deviceInPower']").eq(Math.floor((deviceVal/10000))%10).attr("checked","checked");
				$(":input[name='deviceReceivePower']").eq(Math.floor((deviceVal/1000))%10).attr("checked","checked");
				$(":input[name='deviceRepairPower']").eq(Math.floor((deviceVal/100))%10).attr("checked","checked");
				$(":input[name='deviceTypePower']").eq(Math.floor((deviceVal/10))%10).attr("checked","checked");
				$(":input[name='deviceOutPower']").eq(deviceVal%10).attr("checked","checked");
			}
			check();
			function confirm(){
				//系统管理值
				var roleVal = $(":input[name='rolePower']:checked").val();
				var userVal = $(":input[name='userPower']:checked").val();
				var organizationVal = $(":input[name='organizationPower']:checked").val();
				var systemPowerVal = $(":input[name='systemPower']").val(userVal+roleVal+organizationVal).val();
				//设备管理值
				var deviceInVal = $(":input[name='deviceInPower']:checked").val();
				var deviceOutVal = $(":input[name='deviceOutPower']:checked").val();
				var deviceReceiveVal = $(":input[name='deviceReceivePower']:checked").val();
				var deviceRepairVal = $(":input[name='deviceRepairPower']:checked").val();
				var deviceTypeVal = $(":input[name='deviceTypePower']:checked").val();
				var devicePowerVal = $(":input[name='devicePower']").val(deviceInVal+deviceReceiveVal+deviceRepairVal+deviceTypeVal+deviceOutVal).val();
			};
			$("#form-admin-add").validate({
				rules:{
					name:{
						required:true,
						minlength:1,
						maxlength:16
					},
					remarks:{
						maxlength:200
					},
				},
				onkeyup:false,
				focusCleanup:true,
				success:"valid",
				submitHandler:function(form){
					confirm();
					$(form).ajaxSubmit({
						async:false,
						type: 'post',
						url: "${applicationScope.path }/role/editAfter",
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