<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<s:form method="POST" theme="simple">
	<br />
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="5"><s:text name="utilis.changepwd" />
			</th>
		</tr>
		<tr>
			<td colspan="4" class="SPACE"></td>
		</tr>
		<tr>
			<th><s:text name="utilis.password"></s:text></th>
			<td><s:password name="numPassWordOB" maxLength="20" /></td>
            <td style="width: 20%;"></td>
			<th><s:text name="utilis.confpassword"></s:text></th>
			<td><s:password name="numConfPassWordOB" maxlength="20" /></td>
		</tr>
		<tr>
			<td colspan="4" class="SPACE"></td>
		</tr>

	</table>
	<br/>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit value="Valider" cssClass="buttonBar"
					onclick="doSubmit('changePW','')" /></td>

			<td><s:submit value="Retour" cssClass="buttonBar"
					onclick="document.location='login.jsp';return false;" /></td>
		</tr>

		<tr>
			<td colspan="2" width="100%"></td>
		</tr>
	</table>
	</div>
</s:form>
</html>
