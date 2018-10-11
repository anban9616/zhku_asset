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
<title>设备领取类型列表</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 设备领取类型管理 <span class="c-gray en">&gt;</span> 用户管理 <a
			class="btn btn-success radius r" style="line-height: 1.6em; margin-top: 3px" href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont" id="shuaxin">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<div class="text-c">
			<input type="text" class="input-text" style="width: 250px" placeholder="输入设备领取类型名称" id="" name="">
			<button type="submit" class="btn btn-success" id="" name="">
				<i class="Hui-iconfont">&#xe665;</i> 搜设备领取类型
			</button>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"> <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a
				href="javascript:;" onclick="admin_add('添加设备领取类型','${path}/deviceReceive/add','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i>
					添加用户</a>
			</span> <span class="r">共有数据：<strong>${requestScope.count }</strong> 条
			</span>
		</div>
		<table class="table table-border table-bordered table-bg">
			<thead>
				<tr>
					<th scope="col" colspan="15">用户列表</th>
				</tr>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="40">序号</th>
					<th width="100">设备流水号</th>
					<th width="100">单据号</th>
					<th width="100">领取人</th>
					<th width="100">领取日期</th>
					<th width="100">归还日期</th>
					<th width="100">状态</th>
					<th width="100">领取备注</th>
					<th width="100">归还备注</th>
					<th width="100">创建时间</th>
					<th width="100">修改时间</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.list }" var="item" varStatus="status">
					<tr class="text-c">
						<td><input type="checkbox" value="" name=""><input type="hidden" name="id" value="${item.id }" /></td>
						<td>${status.index+1 }</td>
						<td>${item.dcode }</td>
						<td>${item.drcode }</td>
						<td>${item.username }</td>
						<td><fmt:formatDate value="${item.receiveDate }" pattern="yyyy-MM-dd hh:mm:ss" /></td>
						<td><fmt:formatDate value="${item.returnDate }" pattern="yyyy-MM-dd hh:mm:ss" /></td>
						<td>
							<c:if test="${item.status ==1}">领用</c:if>
							<c:if test="${item.status ==2}">归还</c:if>
						</td>
						<td>${item.rcRemarks }</td>
						<td>${item.rtRemarks }</td>
						<td><fmt:formatDate value="${item.crtm }" pattern="yyyy-MM-dd hh:mm:ss" /></td>
						<td><fmt:formatDate value="${item.mdtm }" pattern="yyyy-MM-dd hh:mm:ss" /></td>
						<td class="td-manage">
							<a title="编辑" href="javascript:;" onclick="admin_edit('设备领取类型编辑','${path}/deviceReceive/edit?id=${item.id }','800','500')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6df;</i></a> 
							<a title="删除" href="javascript:;" onclick="admin_del(this,${item.id})" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<%@include file="/WEB-INF/page/common/footer.jsp"%>
	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript" src="${applicationScope.path }/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript" src="${applicationScope.path }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="${applicationScope.path }/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*设备领取类型-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
	
}

/*设备领取类型-删除*/
function admin_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '${path}/deviceReceive/deleteOne?id='+id,
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*设备领取类型-编辑*/
function admin_edit(title,url,w,h){
	layer_show(title,url,w,h);
}
</script>
</body>
</html>