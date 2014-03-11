<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/classe/rcInclude/rcClasseModificationInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr>
				<td><sj:submit key="button.edit" cssClass="buttonBar"
						validate="true"
						onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcClasse','modificationRcClasse');}"></sj:submit>
					<sj:submit key="button.retour" cssClass="buttonBar"
						onclick="gotoUrll('rechercherRcClasse','rechercheRcClasse')"></sj:submit></td>
			</tr>
		</table>
	</div>
</s:form>
