<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimeproduitFB.RechercheRegimeproduit" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEPRODRech" /></th>
		<td><s:textfield name="numListRcCodeProdRech"
				id="TNUM_LIST_RCCODEPRODRech" maxlength="6"
				onkeyup="f9_Produits(this,TNUM_LIST_RCPRECUEMOA_OB,TNUM_LIST_RCPRECSENEGAL_OB,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierRech" id="TNUM_LIST_RCCODEREGIMEDOUANIERRech" maxlength="1"
				onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,this,TNUM_LIST_RCCODEREGIMEFISCAL_OB,event)"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalRech"
				id="TNUM_LIST_RCCODEREGIMEFISCALRech" maxlength="2"
				onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,TNUM_LIST_RCCODEREGIMEDOUANIER_OB,this,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCPRECSENEGALRech" /></th>
		<td><s:textfield name="numListRcPrecSenegalRech" id="TNUM_LIST_RCPRECSENEGALRech" maxlength="2"
				onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OB,TNUM_LIST_RCPRECUEMOA_OB,this,event)"
				cssClass="input200" /></td>
	</tr>	
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCPRECUEMOARech" /></th>
		<td><s:textfield name="numListRcPrecUemoaRech"
				id="TNUM_LIST_RCPRECUEMOARech" maxlength="2"
				onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OB,this,TNUM_LIST_RCPRECSENEGAL_OB,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" id="TNUM_LIST_RCTYPEREGIMERech" maxlength="1"
				onkeyup="f9_Regime(this,TNUM_LIST_RCCODEREGIMEDOUANIER_OB,TNUM_LIST_RCCODEREGIMEFISCAL_OB,event)"
				cssClass="input200" /></td>
	</tr>	
</table>

