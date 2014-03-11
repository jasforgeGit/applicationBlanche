<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/classe/rcInclude/rcClasseSaisieInclude.jsp"%>

	<div style="float: left;">
		<table>
			<tr>
				<td><s:submit key="button.save" cssClass="buttonBar"
						onclick="doSubmit2('enregistrerRcClasse','saisieRcClasse')"></s:submit>
					<s:submit key="button.retour" cssClass="buttonBar"
						onclick="gotoUrll('rechercherRcClasse','rechercheRcClasse')"></s:submit></td>
			</tr>
		</table>
	</div>
</s:form>
