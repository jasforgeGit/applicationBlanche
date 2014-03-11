<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="sn.com.douane.ejb.rc.model.entities.Utilisateur"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:head />
<style type="text/css">
@import url(config/default.css);
</style>
<script src="<%=request.getContextPath()%>/config/Jscript/manifeste.js"
	type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/config/Jscript/functions.js"
	type="text/javascript"></script>
<script
	src="<%=request.getContextPath()%>/config/Jscript/f9_functions.js"
	type="text/javascript"></script>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gainde Integral</title>
<meta name="description" content="Projet de la douane sénégalaise">


</head>
<%
	boolean expiredSession = false;
	HttpSession requestSession = request.getSession();
	if (requestSession != null) {
		Utilisateur utilisateur = (Utilisateur) requestSession
				.getAttribute("user");
		if (utilisateur == null) {
			expiredSession = true;
		}
	} else {
		expiredSession = true;
	}
%>
<body>

	<%
		if (!expiredSession) {
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
									width="100%" background="/gainde/config/entete.jpg"
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
													<td height="23" width="587" class="barremenu"></td>
													<td align="center" height="23" width="205">
														<TABLE width="100%" align="right">
															<tr>
																<td align="center" width="223"><font
																	face="Arial, Helvetica, sans-serif" color="#ffffff"
																	size="2"><b> </b> </font></td>
															</tr>
														</TABLE>
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
							<td><a class="menulink" href="<%=request.getContextPath()%>/menu.action"> <s:text
										name="Menu General" />
							</a> &nbsp;&nbsp;&nbsp; <a class="menulink"
								href="<%=request.getContextPath()%>/logout.action"> <s:text name="menu.logout" />
							</a></td>
						</tr>
					</table>
		</table>
	</center>


	<table cellspacing="1" cellpadding="0" border="0" width="800"
		align="center" bgcolor="#336699">

		<tr>
			<td align="left" bgcolor="#fffbff" valign="top" height="15"><s:property
					value="%{exception.message}" /></td>
		</tr>
		<tr align="center">
			<td width="100%" bgcolor="#004142" align="center">
				<div align="center">
					<font face="Arial" color="#ffffff" size="2"> <b> </b>
					</font>
				</div>
			</td>
		</tr>

		<tr align="center">
			<td width="100%" bgcolor="#008294" align="center">
				<div align="center">
					<font face="Arial" color="#ffffff" size="2"> <b> </b>
					</font>
				</div>
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFFFFF" valign="top">
				<table cellspacing="1" cellpadding="1" border="0" width="100%"
					align="center" bgcolor="#E5F2F4">
					<tr valign="top">
						<td align="left">:<font face="Arial" color="#6D071A" size="1"><B>
									&nbsp;</B> </font>
						</td>
						<td align="center"><SPAN></SPAN></td>
						<td align="center"><font face="Arial" color="#6D071A"
							size="1"><B> </B> </font></td>
					</tr>
				</table>
			</td>
		</tr>

		<tr>
			<td bgcolor="#FFFFFF" valign="top">
				<table cellspacing="1" cellpadding="1" border="0" width="100%"
					height="400" align="center" bgcolor="" background="">
					<tr valign="top" bgcolor="#E5F2F4">
						<td >
							<h4>Exception Details</h4><br/>
							<s:property value="%{exceptionStack}" />
							
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<%
		} else {
	%>


	<table border="0" width="800" cellspacing="0" cellpadding="1"
		height="550" border="0" align="center"
		background="<%=request.getContextPath()%>/config/connexion.jpg">

		<TBODY>
			<TR>
				<TD align="center" colspan="2" valign="top" height="250"></TD>
			</TR>
			<TR>				
				<TD valign="middle" align="center" width="426">
					<div style="float:center; margin-top:5px; margin-down: 10px;">
					<TABLE border="0" align="center" width="250">
					
						<TBODY>
							<TR>
								<ul class="errorMessage">
									<li><span>Votre session a expirée </span></li>
								</ul>

							</TR>
							<TR>
								<TD align="center" height="28"><s:form
										action="login" method="POST" onsubmit="return (false)">
										<br></br>
										<tr>
											<td><s:submit key="Veuillez vous reconnecter !" id="login"
											cssClass="buttonBar" style="width:220px;"
													onclick="alert('cliquer sur OK pour se reconnecter');doSubmitWithaoutValidate('welcomePage','');" />
											</td>
										</tr>
									</s:form></TD>
							</TR>

						</TBODY>
						
					</TABLE>
					</div>
				</TD>
			</TR>

		</TBODY>
	</TABLE>



	<%
		}
	%>
</body>
</html>
