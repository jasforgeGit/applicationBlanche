<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcProduitspjtFB.RechercheProduitspjt" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProduitspjtFB.TNUM_LIST_RCCODEPIECEJOINTERech" /></th>
		<td><s:textfield name="numListRcCodePieceJointeRech" onkeyup="f9_PiecesJointes(this, event)"
				id="TNUM_LIST_RCCODEPIECEJOINTERech" maxlength="3"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitspjtFB.TNUM_RCCODEPRODUITRech" /></th>
		<td><s:textfield name="numRcCodeProduitRech" id="TNUM_RCCODEPRODUITRech"
				maxlength="6" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitspjtFB.TNUM_RCPRECSENPRODRech" /></th>
		<td><s:textfield name="numRcPrecSenProdRech" 
				id="TNUM_RCPRECSENPRODRech" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitspjtFB.TNUM_RCPRECUEMOAPRODRech" /></th>
		<td><s:textfield name="numRcPrecUemoaProdRech" id="TNUM_RCPRECUEMOAPRODRech"
				maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitspjtFB.DAT_RCDATEPIECEJOINTERech" /></th>
		<td><sj:datepicker id="DAT_RCDATEPIECEJOINTERech" name="datRcDatePieceJointeRech"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>

	</tr>
</table>

