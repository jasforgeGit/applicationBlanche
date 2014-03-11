<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/soumissiondoc/rcInclude/rcSoumissiondocConsultationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentSoumissionDoc','rechercheRcSoumissiondoc')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>

