<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="sn.com.douane.web.rc.Session"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<center>

	<table width="800" border="0" cellspacing="0" cellpadding="0">

		<tr>
			<td align="center" colspan="2" valign="top" height="20"></td>
		</tr>

		<tr>
		
			<td align="center">
				<h2>Application Blanche</h2>
			</td>

		</tr>
		<tr>
			<td>
				<table
					style="border: 0; cellspacing: 0; cellpadding: 0; width: 100%;">
					<tr>
						<td><a class="menulink"
							href="<%= request.getContextPath()%>/menu.action"> <s:text
									name="Menu General" />
						</a> &nbsp;&nbsp;&nbsp; <a class="menulink"
							href="<%= request.getContextPath()%>/logout.action"> <s:text
									name="menu.logout" />
						</a></td>

					</tr>
				</table>
			</td>
		</tr>
	</table>
</center>
