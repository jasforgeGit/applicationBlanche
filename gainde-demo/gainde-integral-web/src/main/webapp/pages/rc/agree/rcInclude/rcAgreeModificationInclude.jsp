<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcAgreeFB.ModificationAgree" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCCODEAGREE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeAgreeOB"
				id="TNUM_RCCODEAGREE_OB" maxlength="3" readonly="true"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPMOB" id="TNUM_LIST_RCCODEPPM_OB"
				maxlength="5" cssClass="input100" onkeyup="f9_PPM1(this,event)"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.DAT_RCDATEDECISION" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEDECISION" name="datRcDateDecisionOB"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_RCETATAGREE" /></th>
		<td><div style="float: left;"><s:textfield name="numRcEtatAgree" id="TNUM_RCETATAGREE"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCNUMDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumDecisionOB"
				id="TNUM_RCNUMDECISION" maxlength="50"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_RCRETRAIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcRetrait" id="TNUM_RCRETRAIT"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCSUSPENDU" /></th>
		<td><div style="float: left;"><s:textfield name="numRcSuspendu"
				id="TNUM_RCSUSPENDU" maxlength="1" 
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_RCTYPEDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcTypeDecision" id="TNUM_RCTYPEDECISION"
				maxlength="1" cssClass="input100" /></div></td>
</table>