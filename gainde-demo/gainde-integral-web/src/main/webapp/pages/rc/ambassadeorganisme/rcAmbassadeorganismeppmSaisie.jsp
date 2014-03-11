<%@taglib uri="/struts-tags" prefix="s"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/ambassadeorganisme/rcInclude/rcAmbassadeorganismeppmSaisieInclude.jsp"%>
		<div style="float: left;">
		<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit2('enregistrerRcAmbassadeorganisme','saisieRcPpm')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('unspecified','saisieRcPpm')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>