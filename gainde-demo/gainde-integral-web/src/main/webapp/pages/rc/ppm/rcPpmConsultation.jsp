<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/ppm/rcInclude/rcPpmConsultationInclude.jsp"%>
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRcPpm','rechercheRcPpm')"></s:submit></td>
		</tr>
	</table>
</s:form>
