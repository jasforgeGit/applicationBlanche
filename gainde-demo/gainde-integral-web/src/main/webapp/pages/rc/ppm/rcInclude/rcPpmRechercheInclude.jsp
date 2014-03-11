<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcPpmFB.RecherchePpm" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCCODEPPMRech" /></th>
		<td><s:textfield name="numRcCodePPMRech"
				id="TNUM_RCCODEPPMRech" maxlength="5" cssClass="input200" /></td>
				<td style="width: 10%;"></td>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCCODEAGREERech" /></th>
		<td><s:textfield name="numListRcCodeAgreeRech" id="TNUM_LIST_RCCODEAGREERech" maxlength="3"
				cssClass="input200" onkeyup="f9_Agree(this,event)"/></td>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCNOMPPM" /></th>
		<td><s:textfield name="numRcNomPPM"
				id="TNUM_RCNOMPPM" cssClass="input200" /></td>
				<td style="width: 10%;"></td>
		<th><s:text name="RcPpmFB.TNUM_RCPRENOMPPM" /></th>
		<td><s:textfield name="numRcPrenomPPM" id="TNUM_RCPRENOMPPM"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCNUMREGPREFERENTIELRech" /></th>
		<td><s:textfield name="numListRcNumRegPreferentielRech" onkeyup="f9_Ambassadeorganisme(this,event)"
				id="TNUM_LIST_RCNUMREGPREFERENTIELRech" maxlength="5" cssClass="input200" /></td>
				<td style="width: 10%;"></td>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCCODECONSIGNATAIRERech" /></th>
		<td><s:textfield name="numListRcCodeConsignataireRech" onkeyup="f9_Consignataires(this,event)"
				 id="TNUM_LIST_RCCODECONSIGNATAIRERech" maxlength="3"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCCODECONTRIBUABLERech" /></th>
		<td><s:textfield name="numRcCodeContribuableRech"
				id="TNUM_RCCODECONTRIBUABLERech" maxlength="7" cssClass="input200" /></td>
				<td style="width: 10%;"></td>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCCODECREDITAIRERech" /></th>
		<td><s:textfield name="numListRcCodeCreditaireRech" onkeyup="f9_Creditaires(this,event)"
				 id="TNUM_LIST_RCCODECREDITAIRERech" maxlength="3"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCNUMIMPORTEXPORTRech" /></th>
		<td><s:textfield name="numListRcNumImportExportRech" onkeyup="f9_Importexport(this,event)"
				id="TNUM_LIST_RCNUMIMPORTEXPORTRech" maxlength="10" cssClass="input200" /></td>
				<td style="width: 10%;"></td>
		<th><s:text name="RcPpmFB.TNUM_RCNINEARech" /></th>
		<td><s:textfield name="numRcNineaRech"
				 id="TNUM_RCNINEARech" maxlength="11"
				cssClass="input200" /></td>
	</tr>
</table>