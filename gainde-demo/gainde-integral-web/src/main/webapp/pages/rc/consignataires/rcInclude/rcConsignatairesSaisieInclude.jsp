<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="RcConsignatairesFB.SaisieConsignataires" /></th>
	</tr>
	<tr>
		<th><s:text name="RcConsignatairesFB.TNUM_RCCODECONSIGNATAIRE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeConsignataireOB"
				id="TNUM_RCCODECONSIGNATAIRE_OB" maxlength="3" cssClass="input100"/></div></td>
		<th><s:text name="RcConsignatairesFB.TNUM_RCCODEPARTIEL" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodePartiel" id="TNUM_RCCODEPARTIEL"
				maxlength="1" cssClass="input100"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcConsignatairesFB.TNUM_LIST_RCCODEPPM" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPM" id="TNUM_LIST_RCCODEPPM"
				maxlength="5" cssClass="input100"/></div></td>
		<th><s:text name="RcConsignatairesFB.DAT_RCDATECREATIONCONSIG" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATECREATIONCONSIG" name="datRcDateCreationConsig" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcConsignatairesFB.DAT_RCDATEDECISION" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEDECISION" name="datRcDateDecision" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
		<th><s:text name="RcConsignatairesFB.DAT_RCDATEPARTIEL" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEPARTIEL" name="datRcDatePartiel" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcConsignatairesFB.DAT_RCDATESUSPENSION" /></th>		
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATESUSPENSION" name="datRcDateSuspension" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
		<th><s:text name="RcConsignatairesFB.TNUM_RCINDSUSPENSCREDIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcIndSuspensCredit"
				id="TNUM_RCINDSUSPENSCREDIT" maxlength="1" cssClass="input100"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcConsignatairesFB.TNUM_RCNUMDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumDecision" id="TNUM_RCNUMDECISION"
				maxlength="6" cssClass="input100"/></div></td>
		<th><s:text name="RcConsignatairesFB.TNUM_RCNUMRETRAITCARTEIE" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumRetraitCarteie"
				id="TNUM_RCNUMRETRAITCARTEIE" maxlength="6" cssClass="input100"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcConsignatairesFB.TNUM_RCNUMSUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumSuspension"
				id="TNUM_RCNUMSUSPENSION" maxlength="6" cssClass="input100"/></div></td>
		<th><s:text name="RcConsignatairesFB.DAT_RCRETRAITCREDIT" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCRETRAITCREDIT" name="datRcRetraitCredit" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
	</tr>
</table>