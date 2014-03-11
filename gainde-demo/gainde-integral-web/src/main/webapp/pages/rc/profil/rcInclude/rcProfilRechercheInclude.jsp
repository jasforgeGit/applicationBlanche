<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcProfilFB.RechercheProfil" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProfilFB.TNUM_RCCODEPROFILRech" /></th>
		<td><s:textfield name="numListRcCodeProfilRech" id="TNUM_RCCODEPROFILRech" maxlength="10" cssClass="input200" onkeyup="f9_Profil(this,event)"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProfilFB.TNUM_RCLIBPROFILRech" /></th>
		<td><s:textfield name="numRcLibProfilRech" id="TNUM_RCLIBPROFILRech" maxlength="100" cssClass="input400" /></td>
	</tr>
</table>
		
