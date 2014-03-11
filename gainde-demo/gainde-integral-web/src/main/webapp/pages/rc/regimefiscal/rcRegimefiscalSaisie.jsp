<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/rc/regimefiscal/rcInclude/rcRegimefiscalSaisieInclude.jsp"%>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcRegimefiscal','saisieRcRegimefiscal')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcRegimefiscal','rechercheRcRegimefiscal')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>
