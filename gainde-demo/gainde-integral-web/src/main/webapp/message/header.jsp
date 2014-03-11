<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="sn.com.douane.web.rc.Session"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%!String utilis = "";
	String typeUser = "";%>
<%
	utilis = Session.getUtilisateurSession(request)
			.getRcIdentification();
	typeUser = Session.getUtilisateurSession(request).gettypeUser()
			.getRcTypeUser();
%>

<center>

	<table width="800" border="0" cellspacing="0" cellpadding="0">

		<tr>
			<td align="center" colspan="2" valign="top" height="20"></td>
		</tr>

		<tr>
			<td width="100%" height="80">
				<table border="0" cellspacing="0" cellpadding="0" width="100%">
					<tr>
						<td width="100%">
							<table border="0" height="74" cellspacing="0" cellpadding="0"
								width="100%"
								background="<%=request.getContextPath()%>/config/entete.jpg"
								style="background-repeat: no-repeat">
								<tr>
									<td>
										<table border="0" cellspacing="0" cellpadding="0" width="742"
											height="42">
											<tr>
												<td height="52" width="587"></td>
												<td height="52" width="205"></td>
											</tr>
											<tr>
												<td height="23" width="587"></td>
												<td align="center" height="23" width="205">
													<table width="100%" align="right">
														<tr>
															<td align="center" width="223"><font
																face="Arial, Helvetica, sans-serif" color="#ffffff"
																size="2"><b> <%=Session.getUtilisateurSession(request).getModule1()%></b></font>
															</td>
														</tr>
													</table>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table
					style="border: 0; cellspacing: 0; cellpadding: 0; width: 100%;">
					<tr>

						<%
							if (typeUser.equals("A")) {
						%>
						<td width="20%" align="right"><img src="config/images 1.jpg"
							height="25" width="25" /><small class="barremenu"> <%=utilis%></small></td>
						<%
							} else if (typeUser.equals("C")) {
						%>
						<td width="20%" align="right"><img src="config/images 2.jpg"
							height="25" width="25" /><small class="barremenu"> <%=utilis%></small></td>
						<%
							} else if (typeUser.equals("D")) {
						%>
						<td width="20%" align="right"><img src="config/images 5.png"
							height="25" width="25" /><small class="barremenu"> <%=utilis%></small></td>
						<%
							} else if (typeUser.equals("R")) {
						%>
						<td width="20%" align="right"><img src="config/images 3.jpg"
							height="25" width="25" /><small class="barremenu"> <%=utilis%></small></td>
						<%
							} else if (typeUser.equals("T")) {
						%>
						<td width="20%" align="right"><img src="config/images 4.jpg"
							height="25" width="25" /><small class="barremenu"> <%=utilis%></small></td>
						<%
							} else {
						%>
						<td width="20%" align="right"><small class="barremenu"><%=utilis%></small></td>
						<%
							}
						%>
					</tr>
				</table>
	</table>
</center>
