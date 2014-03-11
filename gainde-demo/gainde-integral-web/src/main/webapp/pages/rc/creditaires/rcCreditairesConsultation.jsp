<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/creditaires/rcInclude/rcCreditairesConsultationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRcCreditaires','rechercheRcCreditaires')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>
