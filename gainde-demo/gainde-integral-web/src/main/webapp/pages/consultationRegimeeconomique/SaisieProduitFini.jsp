<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/consultationRegimeeconomique/regimeEconomiqueInclude/produitFiniSaisieInclude.jsp"%>
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit('ajouterProduitFini','saisieRegimeEconomique')"></s:submit>
			<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit>
			<s:submit key="Saisie mati�re premi�re" cssClass="buttonBar"
				onclick="gotoUrl('unspecifiedrecherchesRegEco','saisieMatierePremiere')"></s:submit>
			</td>
		</tr>
	</table>
</s:form>