<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcFonctionnalitesFB.ModificationFonctionnalites" /></th>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_RCCODEFONCTION_OB" /></th>
		<td><s:textfield name="numRcCodeFonctionOB" id="TNUM_RCCODEAGREE_OB" maxlength="15" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_LIST_RCCODEPROFIL" /></th>
		<td><s:textfield name="numListRcCodeProfil" id="TNUM_LIST_RCCODEPROFIL" maxlength="10" cssClass="input200" onkeyup="f9_Profil(this,event)"/></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.NUM_RCORDREAFFICHAGE_OB" /></th>
		<td><s:textfield name="numRcOrdreAffichageOB" id="NUM_RCORDREAFFICHAGE_OB" maxlength="4" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_RCDESCRIPTION" /></th>
		<td><s:textfield name="numRcDescription" id="TNUM_RCDESCRIPTION" maxlength="255" cssClass="input400" /></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_RCLIBFONCTION_OB" /></th>
		<td><s:textfield name="numRcLibFonctionOB" id="TNUM_RCLIBFONCTION_OB" maxlength="100" cssClass="input400" /></td>
	</tr>
	<tr>
		<th><s:text name="RcFonctionnalitesFB.TNUM_RCURLFONCTION" /></th>
		<td><s:textfield name="numRcUrlFonction" id="TNUM_RCURLFONCTION" maxlength="255" cssClass="input400" readonly="true"/></td>
	</tr>
</table>