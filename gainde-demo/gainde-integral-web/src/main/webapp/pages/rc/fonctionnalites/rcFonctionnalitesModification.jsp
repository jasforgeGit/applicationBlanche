<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/fonctionnalites/rcInclude/rcFonctionnalitesModificationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.edit" cssClass="buttonBar" validate="true"
					onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcFonctionnalites','modificationRcFonctionnalites');}"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="gotoUrll('rechercherRcFonctionnalites','rechercheRcFonctionnalites')"></s:submit></td>
		</tr>
	</table>
	</div>
	<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>
