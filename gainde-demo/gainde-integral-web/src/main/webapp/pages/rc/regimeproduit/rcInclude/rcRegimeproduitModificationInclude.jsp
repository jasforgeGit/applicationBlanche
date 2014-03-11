<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimeproduitFB.ModificationRegimeproduit" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEPROD_OB" /></th>
		<td><s:textfield name="numListRcCodeProdOB" readonly="true"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalOB" readonly="true"
				id="TNUM_LIST_RCCODEREGIMEFISCAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCPRECSENEGAL_OB" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" id="TNUM_LIST_RCPRECSENEGAL_OB" maxlength="2"
				cssClass="input200" readonly="true"/></td>
	</tr>	
	<tr>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCPRECUEMOA_OB" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB" readonly="true"
				id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeproduitFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" readonly="true"/></td>
	</tr>	
</table>