<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcUtilisateurFB.ConsultationUtilisateur" /></th>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCCODUSER_OB" /></th>
		<td><s:textfield name="numRcCodUserOB" readonly="true"
				id="TNUM_RCCODUSER_OB" maxlength="7"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_LIST_RCCODEPROFIL_OB" /></th>
		<td><s:textfield name="numListRcCodeProfilOB" readonly="true"
				id="TNUM_LIST_RCCODEPROFIL_OB" maxlength="10"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_LIST_RCTYPEUSER_OB" /></th>
		<td><s:textfield name="numListRcTypeUserOB" readonly="true"
				id="TNUM_LIST_RCTYPEUSER_OB" maxlength="1"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCETATACTIF" /></th>
		<td><s:textfield name="numRcEtatActif" readonly="true"
				id="TNUM_RCETATACTIF" maxlength="1"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCINDCONNECT" /></th>
		<td><s:textfield name="numRcIndConnect" readonly="true"
				id="TNUM_RCINDCONNECT" maxlength="1"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCMODULE" /></th>
		<td><s:textfield name="numRcModule" readonly="true"
				id="TNUM_RCMODULE" maxlength="20"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCIDENTIFICATION_OB" /></th>
		<td><s:textfield name="numRcIdentificationOB" readonly="true"
				id="TNUM_RCIDENTIFICATION_OB" maxlength="255"
				cssClass="input400" /></td>
	</tr>
</table>