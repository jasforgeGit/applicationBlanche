<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include file="/pages/rc/taxesregime/rcInclude/rcTaxesregimeSaisieInclude.jsp" %>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcTaxesregime','saisieRcTaxesregime')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcTaxesregime','rechercheRcTaxesregime')"></s:submit></td>
		</tr>
	</table>
	</div>
<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>