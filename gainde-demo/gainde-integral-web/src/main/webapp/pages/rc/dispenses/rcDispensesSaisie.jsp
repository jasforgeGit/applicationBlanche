<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/rc/dispenses/rcInclude/rcDispensesSaisieInclude.jsp"%>
	
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcDispenses','saisieRcDispenses')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcDispenses','rechercheRcDispenses')"></s:submit></td>
		</tr>
	</table>
	</div>
		<input type="hidden" name="hidden">
</s:form>
