<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include 
 	file="/pages/rc/regime/rcInclude/rcRegimeSaisieInclude.jsp"%>
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcRegime','saisieRcRegime')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcRegime','rechercheRcRegime')"></s:submit></td>
		</tr>
	</table>
	</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
    </s:form>
