<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcAgrementEntrepriseFB.Entreprise" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCAGRENT_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcAgrentOB"
				id="TNUM_RCAGRENT_OB" maxlength="4" readonly="true"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCRGRPAYS_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcRgrPaysOB" id="TNUM_RCRGRPAYS_OB"
				maxlength="10" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODPAYS_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodPaysOB"
				id="TNUM_LIST_RCCODPAYS_OB" maxlength="3" onkeyup="f9_pays(this)"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCTITREENT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcTitreEnt" id="TNUM_RCTITREENT"
				maxlength="3" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCRSOCIALECENT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcrSocialeCent"
				id="TNUM_RCRSOCIALECENT" maxlength="30"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCADRESSEENT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcAdresseEnt" id="TNUM_RCADRESSEENT"
				maxlength="60" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.DAT_RCDATEAGREMENT" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEAGREMENT" name="datRcDateAgrement"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
        <th><s:text name="RcAgrementEntrepriseFB.DAT_RCDATCLOTURE" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATCLOTURE" name="datRcDatCloture"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
	</tr>	
</table>
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" 
					onclick="doSubmit2('modifierRcTarifsUemoa','modificationRcTarifsUemoa')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcTarifsUemoa','rechercheRcTarifsUemoa')"></s:submit></td>
		</tr>
	</table>
</div>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcAgrementEntrepriseFB.rechercheProduit" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCAGRENT_OBrech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcAgrentOB"
				id="TNUM_RCAGRENT_OB" maxlength="4" readonly="true"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODEPROD_OBrech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeProdOBrech" id="TNUM_LIST_RCCODEPROD_OBrech"
				onkeyup="f9_Produits(this,TNUM_LIST_RCPRECUEMOAPROD_OBrech,TNUM_LIST_RCPRECSENPROD_OBrech)"
				maxlength="6" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCPRECUEMOAPROD_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcPrecuemoaProdOBrech"
		     	onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OBrech,this,TNUM_LIST_RCPRECSENPROD_OBrech)"
				id="TNUM_LIST_RCPRECUEMOAPROD_OBrech" maxlength="2" 
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCPRECSENPROD_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcPrecsenProdOBrech" id="TNUM_LIST_RCPRECSENPROD_OBrech"
				onkeyup="f9_Produits(TNUM_LIST_RCCODEPROD_OBrech,TNUM_LIST_RCPRECUEMOAPROD_OBrech,this)" 
				maxlength="2" cssClass="input100" /></div></td>
	</tr>
</table>
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcAgrementProduit','modificationRcTarifsUemoa')"></s:submit></td>
		</tr>
	</table>
</div>
