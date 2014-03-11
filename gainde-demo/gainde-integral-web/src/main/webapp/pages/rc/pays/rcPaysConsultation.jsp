<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/pays/rcInclude/rcPaysConsultationInclude.jsp"%>
		
	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.retour" cssClass="buttonBar"
					onclick="doSubmitWithaoutValidate2('unspecifiedPays','rechercheRcPays')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>
