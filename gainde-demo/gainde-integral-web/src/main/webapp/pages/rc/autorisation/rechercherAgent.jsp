<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/autorisation/autorisationInclude/rechercherAgentInclude.jsp"%>

	<script type="text/javascript">
    function consultAutoristaionLink(cellvalue, options, rowObject) {
    return "<a href='unspecifiedAutorisationAction?pk="+cellvalue+
    "&pageContext=majAutorisationAgent'><img src='config/edit1.jpg' border='0' /></a>";
}
</script>

	<div style="float: left;">
		<table>
			<tr height="25px">
				<td><s:submit cssClass="buttonBar" key="button.search"
						onclick="doSubmit2('rechercherMesAgents','rechercheAgent')">
					</s:submit></td>
				<td><s:submit cssClass="buttonBar" key="button.retour"
						onclick="doReturn()">
					</s:submit></td>
			</tr>
		</table>
	</div>

	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties(
						"message.confirmDelete", request.getLocale())%>" />

	<div style="float: left; margin-top: 5px; margin-down: 10px;">
		<s:url id="remoteurl" action="autorisationGrid" />
		<sjg:grid id="gridtable" dataType="json" href="%{remoteurl}"
			pager="true" rowNum="5" rowList="5,10,15" gridModel="listeAgents"
			sortable="true" width="800">
			<sjg:gridColumn name="pk" title="pk" key="true" hidden="true" />
			<sjg:gridColumn name="editCell" title=" " width="10" formatter="consultAutoristaionLink" />
			<sjg:gridColumn name="rccoduser" title="%{getText('listeAgents.codeuser')}" />
			<sjg:gridColumn name="rcidentification" title="%{getText('listeAgents.identification')}" />
			<sjg:gridColumn name="rctypeuser" width="100" title="%{getText('listeAgents.typeUser')}" />
		</sjg:grid>
	</div>

</s:form>