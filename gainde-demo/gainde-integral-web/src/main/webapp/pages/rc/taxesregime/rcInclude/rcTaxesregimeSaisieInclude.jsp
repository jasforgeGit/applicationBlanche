<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTaxesregimeFB.SaisieTaxesregime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcRegimeDouanierOB" id="TNUM_LIST_RCREGIMEDOUANIER_OB"
		onkeyup="f9_RegimeDouanier(this,TNUM_LIST_RCTYPEREGIMEDOUANIER_OB,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
		<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCTYPEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeDouanierOB" onkeyup="f9_TypeRegimeDouane(this,event)"
				id="TNUM_LIST_RCTYPEREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcRegimeFiscalOB" id="TNUM_LIST_RCREGIMEFISCAL_OB"
		onkeyup="f9_RegimeFiscal(this,event)"
				maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCCODETAUX_OB" /></th>
		<td><s:textfield name="numListRcCodeTxOB" onkeyup="f9_Taux(this,TNUM_LIST_RCCODETAXE_OB,event)"
				id="TNUM_LIST_RCCODETX_OB" maxlength="3"
				cssClass="input200" /></td>
	    <td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALEUR_OB" name="datRcDateValeurOB"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.DAT_RCDATECLOTURE" /></th>
		<td><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
	</tr>
</table>


