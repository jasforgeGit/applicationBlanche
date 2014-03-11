<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/creditaires/rcInclude/rcCreditairesppmSaisieInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit2('enregistrerRcCreditaires','saisieRcPpm')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('unspecified','saisieRcPpm')"></s:submit></td>
		</tr>
	</table>
    </div>
</s:form>

