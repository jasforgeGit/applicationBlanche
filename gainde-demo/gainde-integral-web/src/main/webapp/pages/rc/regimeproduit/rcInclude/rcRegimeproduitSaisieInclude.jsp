<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimeproduitFB.SaisieRegimeproduit" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEPROD_OB" /></th>
		<td><s:textfield name="numListRcCodeProdOB"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6"
				onkeyup="f9_Produits(this,TNUM_LIST_RCPRECUEMOA_OB,TNUM_LIST_RCPRECSENEGAL_OB,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" maxlength="1"
				onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,this,TNUM_LIST_RCCODEREGIMEFISCAL_OB,event)"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalOB"
				id="TNUM_LIST_RCCODEREGIMEFISCAL_OB" maxlength="2"
				onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,TNUM_LIST_RCCODEREGIMEDOUANIER_OB,this,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCPRECSENEGAL_OB" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" id="TNUM_LIST_RCPRECSENEGAL_OB" maxlength="2"
				onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OB,TNUM_LIST_RCPRECUEMOA_OB,this,event)"
				cssClass="input200" /></td>
	</tr>	
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCPRECUEMOA_OB" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB"
				id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2"
				onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OB,this,TNUM_LIST_RCPRECSENEGAL_OB,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				onkeyup="f9_Regime(this,TNUM_LIST_RCCODEREGIMEDOUANIER_OB,TNUM_LIST_RCCODEREGIMEFISCAL_OB,event)"
				cssClass="input200" /></td>
	</tr>	
</table>

