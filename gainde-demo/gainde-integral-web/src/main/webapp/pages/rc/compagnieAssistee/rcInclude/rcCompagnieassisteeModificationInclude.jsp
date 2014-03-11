<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcCompagnieassisteeFB.ModificationCompagnieassistee" /></th>
	</tr>
	<tr>
				<th><s:text name="RcCompagnieassisteeFB.NUM_CODECIEASSISTEE_OB" /></th>
				<td><div style="float: left;"><s:textfield name="numCodeCieAssisteeOB" readonly="true"
						maxlength="4" cssClass="input200" /></div></td>
	</tr>
	<tr>
				<th><s:text name="RcCompagnieassisteeFB.TNUM_NOMCIEASSISTEE_OB" /></th>
				<td><div style="float: left;"><s:textfield name="numNomCieAssisteeOB" maxlength="100"
						cssClass="input300" /></div></td>
	</tr>
</table>

