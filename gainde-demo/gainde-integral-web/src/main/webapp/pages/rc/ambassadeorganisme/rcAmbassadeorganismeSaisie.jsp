<%@taglib uri="/struts-tags" prefix="s"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/ambassadeorganisme/rcInclude/rcAmbassadeorganismeSaisieInclude.jsp"%>
<div style="float: left;">
		<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit2('enregistrerRcAmbassadeorganisme','saisieRcAmbassadeorganisme')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcAmbassadeorganisme','rechercheRcAmbassadeorganisme')"></s:submit></td>
		</tr>
	</table>
	</div>
	<s:hidden name="hidden" id="hidden"></s:hidden>
	</s:form>

