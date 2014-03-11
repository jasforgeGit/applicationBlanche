<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
<%@ include file="/pages/rc/taux/rcInclude/rcTauxSaisieInclude.jsp"%>
<br/>
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" 
					onclick="doSubmit2('enregistrerRcTaux','saisieRcTaux')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcTaux','rechercheRcTaux')"></s:submit></td>
		</tr>
	</table>
</div>
<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>