<%
//Mise � jour du champ code PPM avec la valeur provenant de la page de saisie des PPM
String codePpm = (String) request.getSession().getAttribute("codePpm");
sn.com.douane.web.rc.form.RcAgreeForm rcAgreeForm = (sn.com.douane.web.rc.form.RcAgreeForm)
							pageContext.findAttribute("rcAgreeForm");
rcAgreeForm.setNumListRcCodePPMOB(codePpm);
 %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcAgreeFB.SaisieAgree" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCCODEAGREE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeAgreeOB" id="TNUM_RCCODEAGREE_OB"
				maxlength="3" cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPMOB"
				id="TNUM_LIST_RCCODEPPM_OB" readonly="true" maxlength="5"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.DAT_RCDATEDECISION" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEDECISION"
				name="datRcDateDecisionOB" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_RCETATAGREE" /></th>
		<td><div style="float: left;"><s:textfield name="numRcEtatAgree" id="TNUM_RCETATAGREE"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCNUMDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumDecisionOB"
				id="TNUM_RCNUMDECISION" maxlength="50" cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_RCRETRAIT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcRetrait" id="TNUM_RCRETRAIT"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCSUSPENDU" /></th>
		<td><div style="float: left;"><s:textfield name="numRcSuspendu" id="TNUM_RCSUSPENDU"
				maxlength="1" cssClass="input100" /></div></td>
		<th><s:text name="RcAgreeFB.TNUM_RCTYPEDECISION" /></th>
		<td><div style="float: left;"><s:textfield name="numRcTypeDecision"
				id="TNUM_RCTYPEDECISION" maxlength="1" cssClass="input100" /></div></td>
</table>