<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/utilisateur/rcInclude/rcUtilisateurSaisieInclude.jsp"%>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcUtilisateur','saisieRcUtilisateur')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcUtilisateur','rechercheRcUtilisateur')"></s:submit></td>
		</tr>
	</table>
	</div>
	<s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>
