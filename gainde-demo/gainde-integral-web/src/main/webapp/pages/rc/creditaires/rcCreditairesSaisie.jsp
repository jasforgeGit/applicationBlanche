<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/creditaires/rcInclude/rcCreditairesSaisieInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit2('enregistrerRcCreditaires','saisieRcCreditaires')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcCreditaires','rechercheRcCreditaires')"></s:submit></td>
		</tr>
	</table>
    </div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>