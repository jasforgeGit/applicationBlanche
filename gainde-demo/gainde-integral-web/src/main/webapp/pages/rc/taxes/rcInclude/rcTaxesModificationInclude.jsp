<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTaxesFB.ModificationTaxes" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numRcCodeTaxeOB" readonly="true"
				id="TNUM_RCCODETAXE_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%""></td>
		<th><s:text name="RcTaxesFB.TNUM_RCBASETAXE1" /></th>
		<td><s:textfield name="numRcBaseTaxe1" id="TNUM_RCBASETAXE1"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCCODEIMPBUDGET" /></th>
		<td><s:textfield name="numRcCodeImpBudget"
				id="TNUM_RCCODEIMPBUDGET" maxlength="8"
				cssClass="input200" /></td>
		<td width="20%""></td>
		<th><s:text name="RcTaxesFB.TNUM_RCCODEIMPTRESOR" /></th>
		<td><s:textfield name="numRcCodeImpTresor" id="TNUM_RCCODEIMPTRESOR"
				maxlength="8" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCINDCOMPTANT_OB" /></th>
		<td><s:textfield name="numRcIndComptantOB"
				id="TNUM_RCINDCOMPTANT_OB" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%""></td>
		<th><s:text name="RcTaxesFB.NUM_RCMINPERCEPTIONTAXE" /></th>
		<td><s:textfield name="numRcMinPerceptionTaxe" id="NUM_RCMINPERCEPTIONTAXE"
				maxlength="9" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCNATURETAXE" /></th>
		<td><s:textfield name="numRcNatureTaxe"
				id="TNUM_RCNATURETAXE" maxlength="3"
				cssClass="input200" /></td>
		<td width="20%""></td>
		<th><s:text name="RcTaxesFB.NUM_RCORDREEVALTAXE_OB" /></th>
		<td><s:textfield name="numRcOrdreEvalTaxeOB" id="NUM_RCORDREEVALTAXE_OB"
				maxlength="4" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCUNITELIQUIDATION" /></th>
		<td><s:textfield name="numRcUniteLiquidation"
				id="TNUM_RCUNITELIQUIDATION" maxlength="1"
				cssClass="input200" /></td>
		<td></td>
        <td width="20%""></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCLIBELLETAXE_OB" /></th>
		<td><s:textfield name="numRcLibelleTaxeOB" readonly="true"
				id="TNUM_RCLIBELLETAXE_OB" maxlength="255"
				cssClass="input700" /></td>
		<td></td>
        <td width="20%""></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCFORMULETAXE_OB" /></th>
		<td><s:textfield name="numRcFormuleTaxeOB"
				id="TNUM_RCFORMULETAXE_OB" maxlength="255"
				cssClass="input700" /></td>
		<td></td>
        <td width="20%""></td>
	</tr>	
</table>