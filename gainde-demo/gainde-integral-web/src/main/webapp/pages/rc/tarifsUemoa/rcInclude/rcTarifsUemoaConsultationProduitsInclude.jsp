<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcAgrementEntrepriseFB.Produits" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODEPAYS_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePaysOB" readonly="true" 
				id="TNUM_LIST_RCCODEPAYS_OB" maxlength="3" onkeyup="f9_pays(this)"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCNUMENTREPRISE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumEntrepriseOB" id="TNUM_RCNUMENTREPRISE_OB"
				maxlength="4" cssClass="input100" readonly="true" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODEPROD_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeProdOB"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6" onkeyup="f9_Produits(this,TNUM_LIST_RCPRECUEMOAPROD_OB,TNUM_LIST_RCPRECSENPROD_OB)"
				cssClass="input100" readonly="true"/></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCPRECUEMOAPROD_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcPrecuemoaProdOB" id="TNUM_LIST_RCPRECUEMOAPROD_OB" onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OB,this,TNUM_LIST_RCPRECSENPROD_OB)"
				maxlength="2" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCPRECSENPROD_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcPrecsenProdOB" 
				id="TNUM_LIST_RCPRECSENPROD_OB" maxlength="2" onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OB,TNUM_LIST_RCPRECUEMOAPROD_OB,this)"
				cssClass="input100" readonly="true"/></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODEIMPEXP_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeImpExpOB" id="TNUM_RCCODEIMPEXP_OB"
				maxlength="1" cssClass="input100"  readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODEREGROUPEMENT_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeRegroupementOB" readonly="true" 
				id="TNUM_RCCODEREGROUPEMENT_OB" maxlength="10" 
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODETAXE" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaxe" id="TNUM_LIST_RCCODETAXE"
				maxlength="2" cssClass="input100" onkeyup="f9_Taux(TNUM_LIST_RCCODETAUX,this)" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.DAT_RCDATEAPPLICATION" /></th>
		<td><div style="float: left;"><s:textfield id="DAT_RCDATEAPPLICATION" name="datRcDateApplication"
				 maxlength="10"
				cssClass="input100" readonly="true"/></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODETAUX" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaux" id="TNUM_LIST_RCCODETAUX"
				maxlength="3" cssClass="input100" onkeyup="f9_Taux(this,TNUM_LIST_RCCODETAXE)" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCVALQUOTITE" /></th>
		<td><div style="float: left;"><s:textfield name="numRcValquotite" id="TNUM_RCVALQUOTITE"
				maxlength="4" cssClass="input100" readonly="true"/></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.DAT_RCDATECLOTUREProd" /></th>
		<td><div style="float: left;"><s:textfield id="DAT_RCDATECLOTUREProd" name="datRcDateClotureProd"
				 maxlength="10"
				cssClass="input100" readonly="true"/></div></td>
	</tr>
</table>