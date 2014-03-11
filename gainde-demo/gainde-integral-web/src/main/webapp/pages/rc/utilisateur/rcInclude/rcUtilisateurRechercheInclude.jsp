<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcUtilisateurFB.RechercheUtilisateur" /></th>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCCODUSERRech" /></th>
		<td><s:textfield name="numRcCodUserRech"
				id="TNUM_RCCODUSERRech" maxlength="7"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_LIST_RCCODEPROFILRech" /></th>
		<td><s:textfield name="numListRcCodeProfilRech" onkeyup="f9_Profil(this,event)"
				id="TNUM_LIST_RCCODEPROFILRech" maxlength="10"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_LIST_RCTYPEUSERRech" /></th>
		<td><s:textfield name="numListRcTypeUserRech" onkeyup="f9_Typeutilisateur(this,event)"
				id="TNUM_LIST_RCTYPEUSERRech" maxlength="1"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcUtilisateurFB.TNUM_RCIDENTIFICATIONRech" /></th>
		<td><s:textfield name="numRcIdentificationRech" 
				id="TNUM_RCIDENTIFICATIONRech" maxlength="255"
				cssClass="input400" /></td>
	</tr>
</table>
	