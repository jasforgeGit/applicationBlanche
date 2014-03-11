<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcCreditairesFB.SaisieCreditaires" /></th>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.TNUM_RCCODECREDITAIRE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeCreditaireOB"
				id="TNUM_RCCODECREDITAIRE_OB" maxlength="3" 
				cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_LIST_RCCODEPPM" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPMOB" id="TNUM_LIST_RCCODEPPM" onkeyup="f9_PPM1(this,event)"
				maxlength="5" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.DAT_RCDATECREDIT" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATECREDIT" name="datRcDateCredit"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.DAT_RCDATEDECISION" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEDECISION"
				name="datRcDateDecision" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.DAT_RCDATEEXTENSION" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEEXTENSION"
				name="datRcDateExtension" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.DAT_RCDATERETRAIT" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATERETRAIT" name="datRcDateRetrait"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.DAT_RCDATESUSPENSION" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATESUSPENSION"
				name="datRcDateSuspension" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_RCETATCREDIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcEtatCredit" id="TNUM_RCETATCREDIT"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.NUM_RCMONTANTAVOIR" /></th>
		<td><div style="float: left;"><s:textfield name="numRcMontantAvoir" id="NUM_RCMONTANTAVOIR"
				maxlength="19" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.NUM_RCMONTANTMINI" /></th>
		<td><div style="float: left;"><s:textfield name="numRcMontantMiniOB" id="NUM_RCMONTANTMINI"
				maxlength="13" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.NUM_RCMONTANTRESIDUEL" /></th>
		<td><div style="float: left;"><s:textfield name="numRcMontantResiduel"
				id="NUM_RCMONTANTRESIDUEL" maxlength="11"
				cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_RCNUMDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumDecision" id="TNUM_RCNUMDECISION"
				maxlength="50" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.TNUM_RCNUMERODOSSIER" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumeroDossier"
				id="TNUM_RCNUMERODOSSIER" maxlength="50"
				cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_RCNUMERORETRAIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumeroRetrait"
				id="TNUM_RCNUMERORETRAIT" maxlength="15"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.TNUM_RCNUMSUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumSuspension"
				id="TNUM_RCNUMSUSPENSION" maxlength="15"
				cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_LIST_RCTYPECREDITAIRE" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcTypeCreditaire" onkeyup="f9_Typecredit(this,event)"
				id="TNUM_LIST_RCTYPECREDITAIRE" maxlength="1"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.NUM_RCBONAVOIR" /></th>
		<td><div style="float: left;"><s:textfield name="numRcBonAvoir" id="NUM_RCBONAVOIR"
				maxlength="19" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_RCCODESUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeSuspension"
				id="TNUM_RCCODESUSPENSION" maxlength="1"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.TNUM_RCTYPEDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcTypeDecision"
				id="TNUM_RCTYPEDECISION" maxlength="1"
				cssClass="input100" /></div></td>
	</tr>
</table>