<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcAmbassadeorganismeFB.ConsultationAmbassadeorganisme" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCNUMREGIMEPREF_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumRegimePref" readonly="true"
				id="TNUM_RCNUMREGIMEPREF_OB" maxlength="5" cssClass="input100" /></div></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_LIST_RCCODEPPM" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPM" id="TNUM_LIST_RCCODEPPM"
				readonly="true" maxlength="5" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCCODESUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeSuspension" readonly="true"
				id="TNUM_RCCODESUSPENSION" maxlength="1" cssClass="input100" /></div></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAmbassadeorganismeFB.DAT_RCDATEREGIMEPREF" /></th>
		<td><div style="float: left;"><s:textfield id="DAT_RCDATEREGIMEPREF" readonly="true"
				name="datRcDateRegimePref" maxlength="10" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.DAT_RCDATESUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield id="datRcDateSuspension" readonly="true"
				name="DAT_RCDATESUSPENSION" maxlength="10" cssClass="input100" /></div></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCNATREGIMEPREF" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNatRegimePref" readonly="true"
				id="TNUM_RCNATREGIMEPREF" maxlength="1" cssClass="input100" /></div></td>

	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.DAT_RCDATERETRAIT" /></th>
		<td><div style="float: left;"><s:textfield id="datRcDateRetrait" name="DAT_RCDATERETRAIT"
				readonly="true" maxlength="10" cssClass="input100" /></div></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCNUMRETRAIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumRetrait" id="TNUM_RCNUMRETRAIT"
				readonly="true" maxlength="6" cssClass="input100" /></div></td>

	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RSNUMSUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRsNumSuspension" readonly="true"
				id="TNUM_RSNUMSUSPENSION" maxlength="6" cssClass="input100" /></div></td>
	</tr>
</table>