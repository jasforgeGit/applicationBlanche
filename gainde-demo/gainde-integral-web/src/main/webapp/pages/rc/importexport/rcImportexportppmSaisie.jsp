<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/importexport/rcInclude/rcImportexportppmSaisieInclude.jsp "%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit2('enregistrerRcImportexport','saisieRcPpm')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('unspecified','saisieRcPpm')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>

