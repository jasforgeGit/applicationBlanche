<%@taglib uri="/struts-tags" prefix="s"%>

<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/ambassadeorganisme/rcInclude/rcAmbassadeorganismeConsultationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRcAmbassadeorganisme','rechercheRcAmbassadeorganisme')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>

