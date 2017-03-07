<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
<link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" />
</head>
<body topMargin="10">
	<div id="append_parent"></div>
	<table cellSpacing="6" cellPadding="2" width="100%" border="0">
		<tbody>
			<tr>
				<td>
					<table class="guide" cellSpacing="0" cellPadding="0" width="100%"
						border="0">
						<tbody>
							<tr>
								<td>Memory的CRUD</td>
							</tr>
						</tbody>
					</table> 
					<br /> 
					<form id="" action="create" method="post">
						<table class="tableborder" cellSpacing="0" cellPadding="0" width="100%" border="0">
							<tbody>
								<tr class="header">
									<td colSpan="3">添加项目</td>
								</tr>
							</tbody>
							<tbody>
								<tr>
									<td class="altbg1" width="20%"><b>编号:</b></td>
									<td class="altbg2" valign="middle" width="20%">
										<input type="text" name="project.no" />
									</td>
									<td><span style="color: red"> </span></td>
								</tr>
								<tr>
									<td class="altbg1" width="20%"><b>名称:</b></td>
									<td class="altbg2"><input type="text" name="project.name" /></td>
									<td><span style="color: red"> </span></td>
								</tr>
								<tr>
									<td class="altbg1" width="20%"><b>开始时间:</b></td>
									<td class="altbg2"><input type="text" name="project.startDate" />
									</td>
									<td><span style="color: red"></span></td>
								</tr>
								<tr>
									<td class="altbg1" width="20%"><b>结束时间:</b></td>
									<td class="altbg2"><input type="text" name="project.endDate" />
									</td>
									<td><span style="color: red"></span></td>
								</tr>
							</tbody>
						</table>

						<br />
						<center>
							<input class="button" type="button" value="取消" name="settingsubmit" />
							<input class="button" type="reset" value="重置" name="settingsubmit" /> 
							<input class="button" type="submit" value="提 交" name="settingsubmit" />
						</center>
					</form>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
