<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="RcBasestaxablesFB.SaisieBasestaxables" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBasestaxablesFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcBasestaxablesFB.TNUM_LIST_RCCODETAXEBASE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeBaseOB" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXEBASE_OB" maxlength="2"
				cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcBasestaxablesFB.NUM_RCORDRECALCUL_OB" /></th>
		<td><s:textfield name="numRcOrdreCalculOB"
				id="NUM_RCORDRECALCUL_OB" maxlength="4"
				cssClass="input100" /></td>
	</tr>
</table>

