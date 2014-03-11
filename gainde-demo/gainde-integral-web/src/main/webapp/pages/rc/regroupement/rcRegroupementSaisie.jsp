<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/rc/regroupement/rcInclude/rcRegroupementSaisieInclude.jsp"%>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcRegroupement','saisieRcRegroupement')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcRegroupement','rechercheRcRegroupement')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>
