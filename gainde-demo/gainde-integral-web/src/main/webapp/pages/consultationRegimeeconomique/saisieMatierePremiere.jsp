<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/consultationRegimeeconomique/regimeEconomiqueInclude/matierePremiereSaisieInclude.jsp"%>
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit('ajouterMatierePremiere','saisieRegimeEconomique')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</s:form>