<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/agree/rcInclude/rcAgreeppmSaisieInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr> 
			<td><sj:submit key="button.save" cssClass="buttonBar" button="true" validate="true" indicator="indicator"
					onclick="doSubmit2('enregistrerRcAgree','saisieRcPpm')"></sj:submit>
				<sj:submit key="button.retour" cssClass="buttonBar" button="true" indicator="indicator"
					onclick="gotoUrl('unspecified','saisieRcPpm')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>