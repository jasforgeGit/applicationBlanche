<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTaxesregimeFB.ConsultationTaxesregime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB" readonly="true"
				id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcRegimeDouanierOB" id="TNUM_LIST_RCREGIMEDOUANIER_OB"
		readonly="true" maxlength="1" cssClass="input200" /></td>
	</tr>
		<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCTYPEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeDouanierOB" readonly="true"
				id="TNUM_LIST_RCTYPEREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcRegimeFiscalOB" id="TNUM_LIST_RCREGIMEFISCAL_OB"
		readonly="true" maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCCODETAUX_OB" /></th>
		<td><s:textfield name="numListRcCodeTxOB" readonly="true"
				id="TNUM_LIST_RCCODETX_OB" maxlength="3"
				cssClass="input200" /></td>
	    <td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALEUR_OB" name="datRcDateValeurOB" disabled="true"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.DAT_RCDATECLOTURE" /></th>
		<td><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture" disabled="true"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
	</tr>
</table>