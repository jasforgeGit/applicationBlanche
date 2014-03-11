<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form theme="simple">


	<table style="border-width: 1px; border-style: solid;margin-top:10px;width: 100%;">

		<tr align="center">
			<td width="100%" bgcolor="#008294" align="center">

				<div align="center">
					<font face="Arial" color="#ffffff" size="2"> <b> <s:text
								name="Messagerie Gainde" />
					</b>
					</font>
				</div>
			</td>

		</tr>

		<tr>
			<td align="left"><s:textarea name="messageToAccept"
					style="width: 70%;height:70px;margin-top:12px;margin-bottom:8px;"></s:textarea></td>
		</tr>
		
		<tr>
			<td>
				<table style="float: left;">

					<tr>
						<td align="left"><s:text name="lu et approuvé"></s:text></td>
						<td align="left"><s:checkbox name="messageChecked" /></td>
					</tr>

				</table>
			</td>
		</tr>
	</table>

	<div style="float: left;">
		<table>
			<tr>
				<td><s:submit key="Continuer" cssClass="buttonBar"
						onclick="doSubmit('accepterMessageAction','index')" /></td>
				<td><s:submit key="Deconnecter" cssClass="buttonBar"
						onclick="doSubmit('logout','login')" /></td>
			</tr>
		</table>
	</div>

</s:form>
