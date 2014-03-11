<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcAgreeFB.ConsultationAgree" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCCODEAGREE_OB" /></th>
		<td><s:textfield name="numRcCodeAgreeOB"
				id="TNUM_RCCODEAGREE_OB" maxlength="3" readonly="true"
				cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAgreeFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><s:textfield name="numListRcCodePPMOB" id="TNUM_LIST_RCCODEPPM_OB"
				maxlength="5" readonly="true" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.DAT_RCDATEDECISION" /></th>
		<td><s:textfield name="datRcDateDecisionOB"
				id="DAT_RCDATEDECISION" maxlength="10" readonly="true"
				cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAgreeFB.TNUM_RCETATAGREE" /></th>
		<td><s:textfield name="numRcEtatAgree" id="TNUM_RCETATAGREE"
				maxlength="1" readonly="true" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCNUMDECISION" /></th>
		<td><s:textfield name="numRcNumDecisionOB"
				id="TNUM_RCNUMDECISION" maxlength="50" readonly="true"
				cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAgreeFB.TNUM_RCRETRAIT" /></th>
		<td><s:textfield name="numRcRetrait" id="TNUM_RCRETRAIT"
				maxlength="1" readonly="true" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCSUSPENDU" /></th>
		<td><s:textfield name="numRcSuspendu"
				id="TNUM_RCSUSPENDU" maxlength="1" readonly="true"
				cssClass="input100" /></td>
				<td style="width: 30%;"></td>
		<th><s:text name="RcAgreeFB.TNUM_RCTYPEDECISION" /></th>
		<td><s:textfield name="numRcTypeDecision" id="TNUM_RCTYPEDECISION"
				maxlength="1" readonly="true" cssClass="input100" /></td>
</table>
