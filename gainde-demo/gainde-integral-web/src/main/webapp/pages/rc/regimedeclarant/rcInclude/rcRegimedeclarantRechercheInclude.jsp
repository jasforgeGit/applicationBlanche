<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcRegimedeclarantFB.RechercheRegimedeclarant" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCCODEPPMRech" /></th>
		<td><s:textfield name="numListRcCodePpmRech" onkeyup="f9_PPM1(this,event)"
				id="TNUM_LIST_RCCODEPPMRech" maxlength="5"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcRegimeDouanierRech" id="TNUM_LIST_RCREGIMEDOUANIERRech"
		onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIMERech,this,TNUM_LIST_RCREGIMEFISCALRech,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcRegimeFiscalRech"
				id="TNUM_LIST_RCREGIMEFISCALRech" maxlength="2"
				onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIMERech,TNUM_LIST_RCREGIMEDOUANIERRech,this,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" id="TNUM_LIST_RCTYPEREGIMERech"
		onkeyup="f9_Regime(this,TNUM_LIST_RCREGIMEDOUANIERRech,TNUM_LIST_RCREGIMEFISCALRech,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>




