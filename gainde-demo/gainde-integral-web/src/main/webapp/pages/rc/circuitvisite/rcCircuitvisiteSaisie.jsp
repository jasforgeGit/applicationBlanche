<%@ taglib prefix="s" uri="/struts-tags"%>


<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/circuitvisite/rcInclude/rcCircuitvisiteSaisieInclude.jsp"%>
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit2('enregistrerRcCircuitvisite','saisieRcCircuitvisite')"></s:submit></td>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcCircuitvisite','rechercheRcCircuitvisite')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>






