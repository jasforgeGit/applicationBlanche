<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/ppm/rcInclude/rcPpmModificationInclude.jsp" %>
	<table>
		<tr>
			<td><s:submit key="button.edit" cssClass="buttonBar"
					onclick="if (confirmRcUpdate()!=false) {doSubmit('modifierRcPpm','modificationRcPpm');}"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('unspecified','rechercheRcPpm')"></s:submit></td>
		</tr>
	</table>
</s:form>
