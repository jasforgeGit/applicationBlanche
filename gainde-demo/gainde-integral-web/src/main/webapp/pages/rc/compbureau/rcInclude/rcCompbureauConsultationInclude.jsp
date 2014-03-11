<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcCompbureauFB.ConsultationCompbureau" /></th>
	</tr>
	<tr>
		<th><s:text name="RcCompbureauFB.TNUM_RCCODECOMPETENCE_OB" /></th>
		<td><s:textfield name="numRcCodeCompetenceOB" readonly="true"
				id="TNUM_RCCODECOMPETENCE_OB" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcCompbureauFB.TNUM_RCDESCOMPETENCES_OB" /></th>
		<td><s:textfield name="numRcDesCompetencesOB" readonly="true"
				id="TNUM_RCDESCOMPETENCES_OB" maxlength="100"
				cssClass="input500" /></td>
		<td style="width: 60%"></td>
	</tr>
</table>