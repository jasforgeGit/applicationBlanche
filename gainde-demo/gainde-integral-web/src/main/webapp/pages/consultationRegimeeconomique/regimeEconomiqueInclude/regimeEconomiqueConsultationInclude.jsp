<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="DouaneExclusionFB.ConsultationExclusionProduit" /></th>
	</tr>
	<tr>
		<th><s:text name="DouaneExclusionFB.TNUM_DOUANECODEBUREAU_OB" /></th>
		<td><s:textfield name="numDouaneCodeBureauOB" readonly="true"
				id="TNUM_DOUANECODEBUREAU_OB" maxlength="3" cssClass="input200" /></td>
		<th><s:text name="DouaneExclusionFB.TNUM_DOUANECODEPRODUIT_OB" /></th>
		<td><s:textfield name="numDouaneCodeProduitOB"
				id="TNUM_DOUANECODEPRODUIT_OB" readonly="true" maxlength="6"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="DouaneExclusionFB.TNUM_DOUANEPRECISIONUEMOA_OB" /></th>
		<td><s:textfield name="numDouanePrecisionUemoaOB" readonly="true"
				id="TNUM_DOUANEPRECISIONUEMOA_OB" maxlength="2" cssClass="input200" /></td>
		<th><s:text
				name="DouaneExclusionFB.TNUM_DOUANEPRECISIONSENEGAL_OB" /></th>
		<td><s:textfield name="numDouanePrecisionSenegalOB"
				id="TNUM_DOUANEPRECISIONSENEGAL_OB" readonly="true" maxlength="2"
				cssClass="input200" /></td>
	</tr>
</table>
