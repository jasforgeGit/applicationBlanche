<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/soumissioncreditaire/rcInclude/rcSoumissioncreditaireConsultationInclude.jsp" %>
	<div style="float:left; margin-top:10px;">
	<table>
		<tr>
			<td><sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentSoumissioncreditaire','rechercheRcSoumissioncreditaire')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>
