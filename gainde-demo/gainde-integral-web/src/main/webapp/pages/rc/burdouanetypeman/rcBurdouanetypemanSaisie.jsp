<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple"> 
	<%@ include
		file="/pages/rc/burdouanetypeman/rcInclude/rcBurdouanetypemanSaisieInclude.jsp"%>
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcBurdouanetypeman','saisieRcBurdouanetypeman')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcBurdouanetypeman','rechercheRcBurdouanetypeman')"></s:submit></td>
		</tr>
	</table>
	</div>	
	<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>

