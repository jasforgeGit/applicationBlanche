<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/dispensespj/rcInclude/rcDispensespjModificationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.edit" cssClass="buttonBar" validate="true"
					onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcDispensespj','modificationRcDispensespj');}"></sj:submit>
				<sj:submit key="button.retour" cssClass="buttonBar" 
					onclick="doSubmitWithaoutValidate2('unspecifiedDispensespj','rechercheRcDispensespj')"></sj:submit></td>
		</tr>
	</table>
	</div>
	<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>
