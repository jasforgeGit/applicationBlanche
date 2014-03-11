<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcAmbassadeorganismeFB.SaisieAmbassadeorganisme" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCNUMREGIMEPREF_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumRegimePrefOB"
				id="TNUM_RCNUMREGIMEPREF_OB" maxlength="5" cssClass="input100" /></div></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_LIST_RCCODEPPM" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPM" id="TNUM_LIST_RCCODEPPM"
				onkeyup="f9_PPM1(this,event)" maxlength="5" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCCODESUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeSuspension"
				id="TNUM_RCCODESUSPENSION" maxlength="1" cssClass="input100" /></div></td>
		<th><s:text name="RcAmbassadeorganismeFB.DAT_RCDATEREGIMEPREF" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEREGIMEPREF"
				name="datRcDateRegimePref" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.DAT_RCDATESUSPENSION" /></th>
		<td><div style="float: left;"><sj:datepicker id="datRcDateSuspension"
				name="DAT_RCDATESUSPENSION" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCNATREGIMEPREF" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNatRegimePref"
				id="TNUM_RCNATREGIMEPREF" maxlength="1" cssClass="input100" /></div></td>

	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.DAT_RCDATERETRAIT" /></th>
		<td><div style="float: left;"><sj:datepicker id="datRcDateRetrait" name="DAT_RCDATERETRAIT"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RCNUMRETRAIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumRetrait" id="TNUM_RCNUMRETRAIT"
				maxlength="6" cssClass="input100" /></div></td>

	</tr>
	<tr>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_RSNUMSUSPENSION" /></th>
		<td><div style="float: left;"><s:textfield name="numRsNumSuspension"
				id="TNUM_RSNUMSUSPENSION" maxlength="6" cssClass="input100" /></div></td>
	</tr>
</table>
