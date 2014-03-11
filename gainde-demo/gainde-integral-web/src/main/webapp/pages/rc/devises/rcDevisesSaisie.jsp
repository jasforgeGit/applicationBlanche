<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/rc/devises/rcInclude/rcDevisesSaisieInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr>
				<td><s:submit key="button.save" cssClass="buttonBar"
						validate="true"
						onclick="doSubmit2('enregistrerRcDevises','saisieRcDevises')"></s:submit>
					<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcDevises','rechercheRcDevises')"></s:submit></td>
			</tr>
		</table>
	</div>
</s:form>