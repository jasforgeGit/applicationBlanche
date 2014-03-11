<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/ambassadeorganisme/rcInclude/rcAmbassadeorganismeModificationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.edit" cssClass="buttonBar" validate="true" 
					onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcAmbassadeorganisme','modificationRcAmbassadeorganisme');}"></sj:submit>
				<sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcAmbassadeorganisme','rechercheRcAmbassadeorganisme')"></sj:submit></td>
		</tr>
	</table>
	</div>
	<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>
