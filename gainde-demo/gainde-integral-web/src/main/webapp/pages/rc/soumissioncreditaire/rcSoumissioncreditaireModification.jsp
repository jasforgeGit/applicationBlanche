<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/soumissioncreditaire/rcInclude/rcSoumissioncreditaireModificationInclude.jsp" %>
	<div style="float:left; margin-top:10px;">
	<table>
		<tr>
			<td>
<%-- 			<sj:submit key="button.edit" cssClass="buttonBar" validate="true" --%>
<%-- 					onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcSoumissioncreditaire','modificationRcSoumissioncreditaire');}"></sj:submit> --%>
				
				<sj:submit key="button.retour" cssClass="buttonBar" 
					onclick="gotoUrll('rechercherRcSoumissioncreditaire','rechercheRcSoumissioncreditaire')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>
