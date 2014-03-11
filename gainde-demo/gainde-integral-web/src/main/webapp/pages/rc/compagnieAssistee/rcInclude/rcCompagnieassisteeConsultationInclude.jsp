<%@ taglib prefix="s" uri="/struts-tags"%>


<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcCompagnieassisteeFB.ConsultationCompagnieassistee" /></th>
	</tr>
	<tr>
		<table class="SECTION2">
			<tr>
				<th><s:text name="RcCompagnieassisteeFB.NUM_CODECIEASSISTEE_OB" /></th>
				<td><s:textfield name="numCodeCieAssisteeOB" readonly="true"
						maxlength="4" cssClass="input200" /></td>

				<th><s:text name="RcCompagnieassisteeFB.TNUM_NOMCIEASSISTEE_OB" /></th>
				<td><s:textfield name="numNomCieAssisteeOB" readonly="true"
						maxlength="100" cssClass="input500" /></td>
			</tr>
		</table>
	</tr>
</table>

