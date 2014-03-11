<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcImportexportFB.ConsultationImportexport" /></th>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMIMPORTEXPORT_OB" /></th>
		<td><s:textfield name="numRcNumImportExportOB" readonly="true"
				id="TNUM_RCNUMIMPORTEXPORT_OB" maxlength="10" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.TNUM_LIST_RCCODEPPM" /></th>
		<td><s:textfield name="numListRcCodePPM" id="TNUM_LIST_RCCODEPPM"
				readonly="true" maxlength="5" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.DAT_RCDATECARTE" /></th>
		<td><s:textfield id="DAT_RCDATECARTE" name="datRcDateCarte"
				maxlength="10" readonly="true" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.DAT_RCDATERETRAITCREDIT" /></th>
		<td><s:textfield id="DAT_RCDATERETRAITCREDIT" readonly="true"
				name="datRcDateRetraitCredit" maxlength="10" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.DAT_RCDATESUSPENSION" /></th>
		<td><s:textfield id="DAT_RCDATESUSPENSION" readonly="true"
				name="datRcDateSuspension" maxlength="10" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.TNUM_RCNINEAIMPEXP" /></th>
		<td><s:textfield name="numRcNineaImpExp" id="TNUM_RCNINEAIMPEXP"
				readonly="true" maxlength="11" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMCARTEIMPEXP" /></th>
		<td><s:textfield name="numRcNumCarteImpExp" readonly="true"
				id="TNUM_RCNUMCARTEIMPEXP" maxlength="6" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMDECISION" /></th>
		<td><s:textfield name="numRcNumDecision" id="TNUM_RCNUMDECISION"
				readonly="true" onkeyup="f9_PPM1(this)" maxlength="6"
				cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMSUSPENSION" /></th>
		<td><s:textfield name="numRcNumSuspension" readonly="true"
				id="TNUM_RCNUMSUSPENSION" maxlength="6" cssClass="input100" /></td>
	</tr>
</table>