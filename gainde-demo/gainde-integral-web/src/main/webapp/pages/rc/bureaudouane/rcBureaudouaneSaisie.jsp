<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/bureaudouane/rcInclude/rcBureaudouaneSaisieInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr height="25px">
				<td><s:submit cssClass="buttonBar" key="button.save"
						onclick="return doSubmit2('enregistrerRcBureaudouane','saisieRcBureaudouane')">
					</s:submit></td>
				<td><s:submit cssClass="buttonBar" key="button.retour"
						onclick="gotoUrll('rechercherRcBureaudouane','rechercheRcBureaudouane')">
					</s:submit></td>
			</tr>
		</table>
	</div>
	<input type="hidden" name="hidden">
</s:form>