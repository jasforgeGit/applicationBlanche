<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/consignataires/rcInclude/rcConsignatairesSaisieInclude.jsp"%>
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" 
					onclick="doSubmit2('enregistrerRcConsignataires','saisieRcConsignataires')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcConsignataires','rechercheRcConsignataires')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>