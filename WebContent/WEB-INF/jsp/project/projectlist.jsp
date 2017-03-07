<%@page contentType="text/html; charset=utf-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
		<%-- <script type="text/javascript" src="js/jquery-1.4.2.js"></script>  --%>
		<script type="text/javascript" src="../js/jquery-1.5.1.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#create").click(function(){
					location="form.action";
				});
			});
		</script>
	</head>
	<body topMargin="10">
		<div id="append_parent"></div>
		<table cellSpacing=6 cellPadding=2 width="100%" border="0">
		<tbody>
		<tr>
		<td>
		<table class="guide" cellSpacing="0" cellPadding="0" width="100%"
			border="0">
			<tbody>
				<tr>
					<td>
						Memory的CRUD
					</td>
				</tr>
			</tbody>
		</table>
		<br/>
		<form action="delete.action" method="post">
			<table class="tableborder" cellSpacing="0" cellPadding="0"
			width="100%" border="0">
				<tbody>
					<tr class="header">
						<td class="altbg1">
							<b>&nbsp;</b>
						</td>
						<td class="altbg1">
							<b>编号</B>
						</td>
						<td class="altbg1">
							<b>名称</B>
						<td class="altbg1">
							<b>开始时间</B>
						</td>
						<td class="altbg1">
							<b>结束时间</B>
						</td>
					</tr>
				</tbody>
				<tbody>
					<s:iterator value="projectList">
						<tr>
							<td class="altbg2">
								<input type="checkbox" name="ids" value="${ id }" />
							</td>
							<td class="altbg2" width="20%">
								<a href="load.action?project.id=${ id }"><b><s:property value="no"/> </b> </a>
							</td>
							<td class="altbg2">
								<b><s:property value="name" /></b>
							<td class="altbg2">
								<b><s:property value="startDate" /></b>
							</td>
							<td class="altbg2">
								<b><s:property value="endDate" /></b>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<br />
			<center>
				<input id="delete" class="button" type="submit" value="删除项目" />
				<input id="create" class="button" type="button" value="新建项目"/>
			</center>
		</form>
		</td>
		</tr>
		</tbody>
		</table>
	</body>
</html>