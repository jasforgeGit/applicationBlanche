<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcFonctionnalitesFB.RechercheFonctionnalites" /></th>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_RCCODEFONCTIONRech" /></th>
		<td><s:textfield name="numRcCodeFonctionRech" id="TNUM_RCCODEFONCTIONRech" maxlength="15" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_LIST_RCCODEPROFILRech" /></th>
		<td><s:textfield name="numListRcCodeProfilRech" id="TNUM_LIST_RCCODEPROFILRech" maxlength="10" cssClass="input200" onkeyup="f9_Profil(this,event)"/></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_RCLIBFONCTIONRech" /></th>
		<td><s:textfield name="numRcLibFonctionRech" id="TNUM_RCLIBFONCTIONRech" maxlength="100" cssClass="input400" /></td>
	</tr>
</table>



