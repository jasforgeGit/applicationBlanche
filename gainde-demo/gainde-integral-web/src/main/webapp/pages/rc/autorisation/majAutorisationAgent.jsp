<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/autorisation/autorisationInclude/majAutorisationAgentInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr height="25px">
				<td><s:submit cssClass="buttonBar" key="button.edit"
						onclick="if (confirmRcUpdate()!=false) {doSubmit2('majAutorisation','majAutorisationAgent');}else{return false;}">
					</s:submit></td>
				<td><s:submit cssClass="buttonBar" key="button.retour"
						onclick="gotoUrll('rechercherMesAgents','rechercheAgent')">
					</s:submit></td>
			</tr>
		</table>
	</div>
</s:form>
