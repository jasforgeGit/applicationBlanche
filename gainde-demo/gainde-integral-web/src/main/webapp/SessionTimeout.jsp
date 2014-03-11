<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<style type="text/css">
@import url(config/default.css);
</style>
<script src="<%= request.getContextPath()%>/config/Jscript/manifeste.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/functions.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/f9_functions.js" type="text/javascript"></script>
</head>
<title>GAINDE INTEGRAL</title>

<body onload="FirstTimeForLogin();">

	<table border="0" width="800" cellspacing="0" cellpadding="1" height="550" border="0" align="center" background="<%= request.getContextPath()%>/config/connexion.jpg">
	
		<TBODY>
			<TR>
				<TD align="center" colspan="2" valign="top" height="250"></TD>
			</TR>
			<TR>
				<TD width="374"></TD>
				<TD valign="middle" align="center" width="426">
				
					<TABLE border="0" align="center" width="250">
						<TBODY>
							<TR>
								<ul class="errorMessage">
            						<li><span>Votre session a expirée </span></li>
            					</ul>

							</TR>
							<TR>
								<TD align="center" height="28" background="<%= request.getContextPath()%>/config/zone_form.jpg" style="background-repeat:no-repeat">
									<s:form action="login"	method="POST" onsubmit="return (false)">
										<br></br>
										<tr>
											<s:textfield class="label" name="login" label="Login"/>
											<s:password class="label" name="password" label="Mot de passe" />
											<s:submit value="Login" cssClass="buttonBarLogin" onclick="submit()" />
										</tr>
									</s:form>
								</TD>
							</TR>
							
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			<tr>
				<td colspan="2" height="10">
				 	<MARQUEE>
		        		<b><div id="tick2">
		        		<%=sn.com.douane.web.rc.Session.getMessageProperties("MsgEntete", request.getLocale())%>
		        		<div /></b>
					</MARQUEE>
				</td>
			</tr>
		</TBODY>
	</TABLE>
</body>

</html>
