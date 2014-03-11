<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTaxesregimeFB.RechercheTaxesregime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCCODETAXERech" /></th>
		<td><s:textfield name="numListRcCodeTaxeRech" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXERech" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcRegimeDouanierRech" id="TNUM_LIST_RCREGIMEDOUANIERRech"
		onkeyup="f9_RegimeDouanier(this,TNUM_LIST_RCTYPEREGIMEDOUANIER_OB,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
		<tr>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCTYPEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcTypeRegimeDouanierRech" onkeyup="f9_TypeRegimeDouane(this,event)"
				id="TNUM_LIST_RCTYPEREGIMEDOUANIERRech" maxlength="1"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregimeFB.TNUM_LIST_RCREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcRegimeFiscalRech" id="TNUM_LIST_RCREGIMEFISCALRech"
		onkeyup="f9_RegimeFiscal(this,event)"
				maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregimeFB.DAT_RCDATEVALEURRech" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALEURRech" name="datRcDateValeurRech"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
	</tr>
</table>
		
