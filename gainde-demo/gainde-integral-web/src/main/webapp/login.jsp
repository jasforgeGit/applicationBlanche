<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<style type="text/css">
@import url(config/default.css);
</style>

<script type="text/javascript">
	function verifier() {
		var login = document.getElementById('idLogin').value;
		var password = document.getElementById('idPassword').value;

		if (login == '') {
			document.getElementById('idLogin').style.backgroundColor = '';
			document.getElementById('img1').style.visibility = 'visible';
		} else {
			document.getElementById('idLogin').style.backgroundColor = '#BDE5F8';
			document.getElementById('img1').style.visibility = 'hidden';
		}

		if (password == '') {
			document.getElementById('idPassword').style.backgroundColor = '';
			document.getElementById('img2').style.visibility = 'visible';
		} else {
			document.getElementById('idPassword').style.backgroundColor = '#BDE5F8';
			document.getElementById('img2').style.visibility = 'hidden';
		}

	}
</script>

<script src="<%=request.getContextPath()%>/config/Jscript/manifeste.js"
	type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/config/Jscript/functions.js"
	type="text/javascript"></script>
<script
	src="<%=request.getContextPath()%>/config/Jscript/f9_functions.js"
	type="text/javascript"></script>
</head>

<title>Application Demo</title>

<%
	String bgcolorVersionTest = "";
	String bgimageVersionTest = "";

	bgcolorVersionTest = sn.com.douane.web.rc.Session
			.getMessageProperties("bgcolorVersionProd",
					request.getLocale());
%>
<body onload="FirstTimeForLogin();">


<table cellspacing="1" cellpadding="1" border="0" width="800" align="center" >
		<tr>
			<center>
			<td align="center">
				<h2>Application Blanche</h2>
			</td>
			</center>
		</tr>

		<tr>
			<td bgcolor="#FFFFFF" valign="top">
				<table cellspacing="1" cellpadding="1" border="0" width="100%"
					height="300" align="center" 
					bgcolor="<%=bgcolorVersionTest%>">
					<tr>					
					
		<TD width="140"></TD>
			<TD width="10"><img
				src="<%=request.getContextPath()%>/config/login.png"></TD>
			<TD valign="middle" align="center" width="350">

				<TABLE border="0" align="center" width="250" style="float: left;">
					
						<TR>
							<TD align="center" height="28"
								background="<%=request.getContextPath()%>/config/zone_form.jpg"
								style="background-repeat: no-repeat"><s:div
									cssClass="ombrage">
									<table
										style="position: absolute; margin-left: 226px; margin-top: 20px;">
										<tr>
											<td><img
												src="<%=request.getContextPath()%>/config/red_star.png"
												width="10" height="10" id="img1" /></td>
										</tr>
										<tr>
											<td><img
												src="<%=request.getContextPath()%>/config/red_star.png"
												width="10" height="10" id="img2" /></td>
										</tr>
									</table>
									<s:form action="login" method="POST" onsubmit="return (false)">
										<br>
										<tr>
											<s:textfield class="label" name="login" label="Login"
												cssStyle="border-radius: 5px;" id="idLogin"
												onblur="verifier()" />
											<s:password class="label" name="password"
												label="Mot de passe" cssStyle="border-radius: 5px;"
												id="idPassword" onblur="verifier()" />
											<s:submit value="Login" cssClass="buttonBarLogin"
												onclick="submit();verifier()" />
										</tr>
									</s:form>
								</s:div></TD>


						</TR>
						<TR>
							<td>
								<div style="position: absolute;">
									<s:actionerror />
									<s:fielderror />
								</div>
							</td>
						</TR>
					
				</table>
			</td>
			
			
		
		</tr>
		<tr>
		<td colspan="3" height="10"><MARQUEE>
					<b><div id="tick2">
							<%=sn.com.douane.web.rc.Session.getMessageProperties(
					"MsgEntete", request.getLocale())%>
							<div /></b>
				</MARQUEE>
			</td>
		</tr>
	</table>
	</td>
	
	</tr>
	
	</table>
</body>

</html>
