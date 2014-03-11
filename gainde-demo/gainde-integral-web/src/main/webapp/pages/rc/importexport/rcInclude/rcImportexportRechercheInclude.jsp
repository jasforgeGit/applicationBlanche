<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcImportexportFB.RechercheImportexport" /></th>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMIMPORTEXPORTRech" /></th>
		<td><s:textfield name="numRcNumImportExportRech"
				id="TNUM_RCNUMIMPORTEXPORTRech" maxlength="10" cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcImportexportFB.TNUM_LIST_RCCODEPPMRech" /></th>
		<td><s:textfield name="numListRcCodePPMRech"
				onkeyup="f9_PPM1(this,event)" id="TNUM_LIST_RCCODEPPMRech" maxlength="5"
				cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.DAT_RCDATECARTERech" /></th>
		<td><sj:datepicker id="DAT_RCDATECARTERech"
				name="datRcDateCarteRech" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcImportexportFB.DAT_RCDATERETRAITCREDITRech" /></th>
		<td><sj:datepicker id="DAT_RCDATERETRAITCREDITRech"
				name="datRcDateRetraitCreditRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.DAT_RCDATESUSPENSIONRech" /></th>
		<td><sj:datepicker id="DAT_RCDATESUSPENSIONRech"
				name="datRcDateSuspensionRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcImportexportFB.TNUM_RCNINEAIMPEXPRech" /></th>
		<td><s:textfield name="numRcNineaImpExpRech"
				id="TNUM_RCNINEAIMPEXPRech" maxlength="11" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMCARTEIMPEXPRech" /></th>
		<td><s:textfield name="numRcNumCarteImpExpRech"
				id="TNUM_RCNUMCARTEIMPEXPRech" maxlength="6" cssClass="input100" /></td>
	</tr>
</table>
