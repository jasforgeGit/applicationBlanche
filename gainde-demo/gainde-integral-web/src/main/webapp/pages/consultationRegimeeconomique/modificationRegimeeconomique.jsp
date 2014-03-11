<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/consultationRegimeeconomique/regimeEconomiqueInclude/regimeEconomiqueModificationInclude.jsp"%>
	<table>
		<tr>
			<td><s:submit key="button.edit" cssClass="buttonBar"
					onclick="if (confirmRcUpdate()!=false) {doSubmit('modifierRegimeEconomique','modificationRegimeEconomique');}"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('rechercherRegimeeconomique','cherchesRegimeeconomique')"></s:submit></td>
		</tr>
	</table>
</s:form>
