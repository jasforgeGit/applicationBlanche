<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="Saisie régime économique" /></th>
	</tr>
	<tr>
		<th><s:text name="RegimeEconomique.TNUM_RCANNEEREGECO_OB" /></th>
		<td><s:textfield name="numRcAnneeRegEcoOB"
				id="TNUM_RCANNEEREGECO_OB" maxlength="4" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCNUMREGECO_OB" /></th>
		<td><s:textfield name="numRcNumRegEcoOB" id="TNUM_RCNUMREGECO_OB"
				maxlength="6" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCCODENATREGECO_OB" /></th>
		<td><s:textfield name="numRcCodeNatRegEco"
				id="TNUM_RCCODENATREGECO" maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RegimeEconomique.DAT_RCDATEDECISIONREGECO_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEDECISIONREGECO_OB"
				name="datRcDateDecisionRegEco" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCREFJURIDIQUEREGECO_OB" /></th>
		<td><s:textfield name="numRcRefJuridiqueRegEco"
				id="TNUM_RCREFJURIDIQUEREGECO" maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.NUM_RCNBREPROROREGECO_OB" /></th>
		<td><s:textfield name="numRcNbreProRoRegEco"
				id="NUM_RCNBREPROROREGECO" maxlength="10" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RegimeEconomique.DAT_RCDATEVALIDITEREGECO_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALIDITEREGECO"
				name="datRcDateValiditeRegEco" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.DAT_RCDATEPROROREGECO_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEPROROREGECO"
				name="datRcDateProRoRegEco" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.NUM_RCDUREEREGECO_OB" /></th>
		<td><s:textfield name="numRcDureeRegEco" id="NUM_RCDUREEREGECO_OB"
				maxlength="10" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RegimeEconomique.NUM_RCDUREEPROROREGECO_OB" /></th>
		<td><s:textfield name="numRcDureeProRoRegEco"
				id="NUM_RCDUREEPROROREGECO" maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCPPMBENEFICIAIRE_OB" /></th>
		<td><s:textfield name="numRcPPMBeneficiaire"
				id="TNUM_RCPPMBENEFICIAIRE" maxlength="5" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCMODEREGECO_OB" /></th>
		<td><s:textfield name="numRcModeRegEco" id="TNUM_RCMODEREGECO"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RegimeEconomique.DAT_RCDATESUSPENSIONREGECO_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATESUSPENSIONREGECO"
				name="datRcDateSuspensionRegEco" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCETATREGECO_OB" /></th>
		<td><s:textfield name="numRcEtatRegEco" id="TNUM_RCETATREGECO"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>