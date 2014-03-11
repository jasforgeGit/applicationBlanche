<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/bureaudouane/rcInclude/rcBureaudouaneModificationInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr height="25px">
				<td><s:submit cssClass="buttonBar" key="button.edit"
						onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcBureaudouane','modificationRcBureaudouane');}else{return false;}">
					</s:submit></td>
				<td><s:submit cssClass="buttonBar" key="button.retour"
						onclick="gotoUrll('rechercherRcBureaudouane','rechercheRcBureaudouane')">
					</s:submit></td>
			</tr>
		</table>
	</div>
	<input type="hidden" name="hidden">
</s:form>
