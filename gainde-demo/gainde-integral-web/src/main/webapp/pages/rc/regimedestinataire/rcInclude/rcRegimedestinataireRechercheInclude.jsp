<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimedestinataireFB.RechercheRegimedestinataire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEPPMRech" /></th>
		<td><s:textfield name="numListRcCodePpmRech" onkeyup="f9_PPM1(this, event)"
				id="TNUM_LIST_RCCODEPPMRech" maxlength="5"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierRech" id="TNUM_LIST_RCCODEREGIMEDOUANIERRech" 
		onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIMERech,this,TNUM_LIST_RCCODEREGIMEFISCALRech,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalRech" 
		onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIMERech,TNUM_LIST_RCCODEREGIMEDOUANIERRech,this,event)"
				id="TNUM_LIST_RCCODEREGIMEFISCALRech" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" id="TNUM_LIST_RCTYPEREGIMERech" 
		onkeyup="f9_Regime(this,TNUM_LIST_RCCODEREGIMEDOUANIERRech,TNUM_LIST_RCCODEREGIMEFISCALRech,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>


