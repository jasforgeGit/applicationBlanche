<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/importexport/rcInclude/rcImportexportModificationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.edit" cssClass="buttonBar"
					onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcImportexport','modificationRcImportexport');}"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('rechercherRcImportexport','rechercheRcImportexport')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>
