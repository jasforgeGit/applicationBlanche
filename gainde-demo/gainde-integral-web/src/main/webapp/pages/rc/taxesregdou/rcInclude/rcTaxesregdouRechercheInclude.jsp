<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTaxesregdouFB.RechercheTaxesregdou" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCCODETAXERech" /></th>
		<td><s:textfield name="numListRcCodeTaxeRech" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXERech" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCCODEREGIMEDOUNIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDounierRech" id="TNUM_LIST_RCCODEREGIMEDOUNIERRech"
		onkeyup="f9_RegimeDouanier(this,TNUM_LIST_RCTYPEREGIMERech,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>

		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" id="TNUM_LIST_RCTYPEREGIMERech"
		onkeyup="f9_TypeRegimeDouane(this,event)"
				maxlength="1" cssClass="input200" /></td>
        <td style="width: 20%"></td>
		<th><s:text name="RcTaxesregdouFB.DAT_RCDATEVALEURRech" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALEURRech" name="datRcDateValeurRech"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
		

	</tr>
</table>
	

