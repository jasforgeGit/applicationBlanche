<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<sx:tabbedpanel id="declSaisie">
	<sx:div labelposition="top" key="RcProduitsFB.Produits" cssStyle="margin-down: 5px;" >
	<table class="SECTION" colspan="5">
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProd_OB" /></th>
		<td><s:textfield name="numListRcCodeProdOB" readonly="true"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecUemoa_OB" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB" id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2" readonly="true"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecSenegal_OB" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" readonly="true"
				id="TNUM_LIST_RCPRECSENEGAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcLibelleTarif" /></th>
		<td><s:textfield name="numRcLibelleTarif" id="TNUM_rcLibelleTarif" maxlength="255"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCommProd" /></th>
		<td><s:textfield name="numRcCommProd"
				id="TNUM_rcCommProd" maxlength="255"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcIndProdPetrolier" /></th>
		<td><s:textfield name="numRcIndProdPetrolier" id="TNUM_rcIndProdPetrolier" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdCru" /></th>
		<td><s:textfield name="numRcCodeProdCru"
				id="TNUM_rcCodeProdCru" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdArtisanal" /></th>
		<td><s:textfield name="numRcCodeProdArtisanal" id="TNUM_rcCodeProdArtisanal" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcUniteComp" /></th>
		<td><s:textfield name="numRcUniteComp"
				id="TNUM_rcUniteComp" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcSectActProd" /></th>
		<td><s:textfield name="numRcSectActProd" id="TNUM_rcSectActProd" maxlength="2"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeTransit" /></th>
		<td><s:textfield name="numRcCodeTransit"
				id="TNUM_rcCodeTransit" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeBienEquip" /></th>
		<td><s:textfield name="numRcCodeBienEquip" id="TNUM_rcCodeBienEquip" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.NUM_rcValEquipProd" /></th>
		<td><s:textfield name="numRcValEquipProd"
				id="NUM_rcValEquipProd" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeEntrepot" /></th>
		<td><s:textfield name="numRcCodeEntrepot" id="TNUM_rcCodeEntrepot" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdSocial" /></th>
		<td><s:textfield name="numRcCodeProdSocial"
				id="TNUM_rcCodeProdSocial" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.NUM_rcValSpecProd" /></th>
		<td><s:textfield name="numRcValSpecProd" id="NUM_rcValSpecProd" maxlength="8"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.NUM_LIST_rcValChapitre_OB" /></th>
		<td><s:textfield name="numListRcValChapitreOB" readonly="true"
				id="NUM_LIST_rcValChapitre_OB" maxlength="2" 
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_LIST_rcCodeClasse_OB" /></th>
		<td><s:textfield name="numListRcCodeClasseOB" id="TNUM_LIST_rcCodeClasse_OB" maxlength="4" onkeyup="f9_Classe (this,event)"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodePerissable" /></th>
		<td><s:textfield name="numRcCodePerissable"
				id="TNUM_rcCodePerissable" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitsFB.TNUM_rcActif" /></th>
		<td><s:textfield name="numRcActif" id="TNUM_rcActif" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcExonorePVI_OB" /></th>
		<td><s:textfield name="numRcExonorePVIOB"
				id="TNUM_rcExonorePVI_OB" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
        <td></td>
        <td></td>
	</tr>
</table>
</sx:div>


<sx:div labelposition="top" key="RcTarifsFB.Fiscalite" cssStyle="margin-down: 5px;" >
	<table class="SECTION" colspan="5">
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODEPROD_OB" /></th>
		<td><s:textfield name="numListRcCodeProdOB" readonly="true" 
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCPRECUEMOA_OB" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB" id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2" readonly="true" 
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCPRECSENEGAL_OB" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" readonly="true" 
				id="TNUM_LIST_RCPRECSENEGAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB" id="TNUM_LIST_RCCODETAXE_OB" maxlength="2" readonly="true" 
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODETAUX_OB" /></th>
		<td><s:textfield name="numListRcCodeTauxxOB" readonly="true" 
				id="TNUM_LIST_RCCODETAUXX_OB" maxlength="3"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcTarifsFB.DAT_RCDATEVALEUR_OB" /></th>
	    <td><sj:datepicker id="DAT_RCDATEVALEUR_OB" name="datRcDateValeurOB" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;" disabled="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.rCODECIMEX" /></th>
		<td><s:textfield name="numRcCodeCimexOB" readonly="true" 
				id="TNUMRCCODECIMEX_OB" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcTarifsFB.DAT_RCDATECLOTURE" /></th>
		<td><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
	</tr>
</table>
</sx:div>	
	

<sx:div labelposition="top" key="RcReglementImportFB.ReglementImport" cssStyle="margin-down: 5px;" >
	<table class="SECTION" colspan="5">
	<tr>
		<th><s:text name="RcReglementImportFB.rCCODEPROD" /></th>
		<td><s:textfield name="numListRcCodeProdOB" readonly="true"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCPRECUEMOA" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB" id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2" readonly="true" 
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCPRECSENEGAL" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" readonly="true" 
				id="TNUM_LIST_RCPRECSENEGAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCCODEIMP" /></th>
		<td><s:textfield name="rcCodeImpOB" id="rccodeimp_OB" maxlength="1" readonly="true" 
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCCIRCUITVISITE" /></th>
		<td><s:textfield name="rcCircuitVisite"
				id="rccircuitvisite" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCCODEESCORT" /></th>
		<td><s:textfield name="rcCodeEscort" id="rccodeescort" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCCODEADMISDES" /></th>
		<td><s:textfield name="rcCodeAdmisDes"
				id="rccodeadmisdes" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCCODEADMISDEP" /></th>
		<td><s:textfield name="rcCodeAdmisDep" id="rccodeadmisdep" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCCODEPROHIBITION" /></th>
		<td><s:textfield name="rcCodeProhibition"
				id="rccodeprohibition" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCAGREMENTPROD" /></th>
		<td><s:textfield name="rcAgrementProd" id="rcagrementprod" maxlength="5"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCDATEAGREMENT" /></th>
		<td><sj:datepicker id="DAT_rcdateagrement" name="datRcDateAgrement" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCCATEGPROD" /></th>
		<td><s:textfield name="rcCategProd" id="rccategprod" maxlength="2"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCUNITEMERC" /></th>
		<td><s:textfield name="rcUniteMerc"
				id="rcunitemerc" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCVALEURMERC" /></th>
		<td><s:textfield name="rcValeurMerc" id="rcvaleurmerc" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCDATEMERC" /></th>
		<td><s:textfield name="datRcDateMerc"
				id="DAT_rcdatemerc" maxlength="10"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCBAREMMIN" /></th>
		<td><s:textfield name="rcBaremMin" id="rcbaremmin" maxlength="8"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCBAREMEMED" /></th>
		<td><s:textfield name="rcBaremEmed"
				id="rcbarememed" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCVALEURMINPERC" /></th>
		<td><s:textfield name="rcValeurMinPerc" id="rcvaleurminperc" maxlength="4"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCCODDECONTINGENT" /></th>
		<td><s:textfield name="rcCoddeContingent"
				id="rcbarememed" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCMTCONTINGENT" /></th>
		<td><s:textfield name="rcMtContingent" id="rcmtcontingent" maxlength="8"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCRELCONTING" /></th>
		<td><s:textfield name="rcRelConting"
				id="rcrelconting" maxlength="8"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCDATECONTING" /></th>
		<td><sj:datepicker id="DAT_rcdateconting" name="datRcDateConting" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementImportFB.rCTYPEMERC" /></th>
		<td><s:textfield name="rcTypeMerc"
				id="rctypemerc" maxlength="8"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementImportFB.rCCODEANNEXE4" /></th>
		<td><s:textfield name="rcCodeAnnexe4" id="rccodeannexe4" maxlength="10"
				cssClass="input200"/></td>
	</tr>	
	<tr>
		<th><s:text name="RcReglementImportFB.rCAUTCHANGE" /></th>
		<td><s:textfield name="rcAutChange"
				id="rcautchange" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
        <td></td>
        <td></td>
	</tr>
</table>
</sx:div>


<sx:div labelposition="top" key="RcProduitsFB.ReglementExport" cssStyle="margin-down: 5px;" >
	<table class="SECTION" colspan="5">
	<tr>
		<th><s:text name="RcReglementExportFB.rCCODEPROD" /></th>
		<td><s:textfield name="numListRcCodeProdOB" readonly="true"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCPRECUEMOA" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB" id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2" readonly="true"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementExportFB.rCPRECSENEGAL" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" readonly="true"
				id="TNUM_LIST_RCPRECSENEGAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCCODEEXP" /></th>
		<td><s:textfield name="rccodeexpOB" id="rccodeexp_OB" maxlength="255" readonly="true"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementExportFB.rCCODEPROHIBITION" /></th>
		<td><s:textfield name="rccodeprohibitionExport"
				id="rccodeprohibitionExport" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCUNITEMERC" /></th>
		<td><s:textfield name="rcunitemercExport" id="rcunitemercExport" maxlength="1"
				cssClass="input200"/></td>
	</tr>
	<tr>
		<th><s:text name="RcReglementExportFB.rCVALEURMERC" /></th>
		<td><s:textfield name="rcvaleurmercExport"
				id="rcvaleurmercExport" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCDATEMERC" /></th>
		<td><sj:datepicker id="DAT_rcdatemercExport" name="datrcdatemercExport" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
	</tr>	
	<tr>
		<th><s:text name="RcReglementExportFB.rCBAREMMIN" /></th>
		<td><s:textfield name="rcbaremminExport"
				id="rcbaremminExport" maxlength="8"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCBAREMEMED" /></th>
		<td><s:textfield name="rcbarememedExport" id="rcbarememedExport" maxlength="2"
				cssClass="input200"/></td>
	</tr>	
	<tr>
		<th><s:text name="RcReglementExportFB.rCVALEURMINPERC" /></th>
		<td><s:textfield name="rcvaleurminpercExport"
				id="rcvaleurminpercExport" maxlength="4"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCTYPEMERC" /></th>
		<td><s:textfield name="rctypemercExport" id="rctypemercExport" maxlength="8"
				cssClass="input200"/></td>
	</tr>	
	<tr>
		<th><s:text name="RcReglementExportFB.rCAUTCHANGE" /></th>
		<td><s:textfield name="rcautchangeExport"
				id="rcautchangeExport" maxlength="8"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcReglementExportFB.rCSUBVENTIONEXPORT" /></th>
		<td><s:textfield name="rcsubventionExport" id="rcsubventionExport" maxlength="8"
				cssClass="input200"/></td>
	</tr>	
</table>
</sx:div>
</sx:tabbedpanel>