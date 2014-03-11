<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTarifsFB.RechercheTarifs" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODEPRODRech" /></th>
		<td><s:textfield name="numListRcCodeProdRech"
		onkeyup="f9_Produits(this,TNUM_LIST_RCPRECUEMOARech,TNUM_LIST_RCPRECSENEGALRech,event)"
				id="TNUM_LIST_RCCODEPRODRech" maxlength="6"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCPRECUEMOARech" /></th>
		<td><s:textfield name="numListRcPrecUemoaRech" id="TNUM_LIST_RCPRECUEMOARech" maxlength="2"
		onkeyup="f9_Produits(TNUM_LIST_RCCODEPRODRech,this,TNUM_LIST_RCPRECSENEGALRech,event)"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCPRECSENEGALRech" /></th>
		<td><s:textfield name="numListRcPrecSenegalRech"
		onkeyup="f9_Produits(TNUM_LIST_RCCODEPRODRech,TNUM_LIST_RCPRECUEMOARech,this,event)"
				id="TNUM_LIST_RCPRECSENEGALRech" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODETAXERech" /></th>
		<td><s:textfield name="numListRcCodeTaxeRech" id="TNUM_LIST_RCCODETAXERech" maxlength="2"
		onkeyup="f9_Taux(TNUM_LIST_RCCODETAUXRech,this,event)"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODETAUXRech" /></th>
		<td><s:textfield name="numListRcCodeTauxRech"
		onkeyup="f9_Taux(this,TNUM_LIST_RCCODETAXERech,event)"
				id="TNUM_LIST_RCCODETAUXRech" maxlength="3"
				cssClass="input200" /></td>
	    <td width="20%"></td>
        <th><s:text name="RcTarifsFB.DAT_RCDATEVALEURRech" /></th>
	    <td><sj:datepicker id="DAT_RCDATEVALEURRech" name="datRcDateValeurRech" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
	</tr>		
</table>
