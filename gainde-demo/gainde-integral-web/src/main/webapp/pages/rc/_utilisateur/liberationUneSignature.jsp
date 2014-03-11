<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="POST" theme="simple" onsubmit="return (false)">


	<table class="SECTION" >
		<tr>
			<th class="ENTETE" colspan="3"><s:text name="bl7600.Recherche" /></th>
		</tr>
		<tr>
			<th><s:text name="user.codeuser" /></th>
			<td><s:textfield name="abonne" maxlength="7" cssClass="input200" /></td>
			<td><s:submit key="button.search" cssClass="buttonBar" cssStyle="height: 20px;"
					onclick="doSubmit('libererUneSignature','liberationUneSignature')"></s:submit></td>
		</tr>
	</table>

	<%@ include
		file="/pages/rc/_utilisateur/liberationUneSignatureInclude.jsp"%>
<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:submit key="button.retour" cssClass="buttonBar"
		onclick="javascript:history.go(-1);return false;"></s:submit>
		</div>
</s:form>
