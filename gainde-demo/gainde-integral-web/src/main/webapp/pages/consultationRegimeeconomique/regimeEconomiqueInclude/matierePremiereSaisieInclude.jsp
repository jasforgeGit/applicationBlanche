<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="Saisie matière première" /></th>
	</tr>
	<tr>
		<th><s:text name="RegimeEconomique.TNUM_RCPPMBENEFICIAIRE_OB" /></th>
		<td><s:textfield name="numRcPPMBeneficiaireOB"
				id="TNUM_RCPPMBENEFICIAIRE_OB" maxlength="5" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCANNEEREGECO_OB" /></th>
		<td><s:textfield name="numRcAnneeRegEcoOB"
				id="TNUM_RCANNEEREGECO_OB" maxlength="4" cssClass="input200" /></td>
		<th><s:text name="RegimeEconomique.TNUM_RCNUMREGECO_OB" /></th>
		<td><s:textfield name="numRcNumRegEcoOB" id="TNUM_RCNUMREGECO_OB"
				maxlength="6" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="Code produit" /></th>
		<td><s:textfield name="numCodeProduitOB" id="TNUM_CODEPRODUIT_OB"
				maxlength="6" cssClass="input200" /></td>
		<th><s:text name="Précision Senegal" /></th>
		<td><s:textfield name="numPrecisionSenOB"
				id="TNUM_PRECISIONSEN_OB" maxlength="2" cssClass="input200" /></td>
		<th><s:text name="Precision UEMOA" /></th>
		<td><s:textfield name="numPrecisionUemoaOB"
				id="TNUM_PRECISIONUEMOA_OB" maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="Numéro gamme" /></th>
		<td><s:textfield name="numRcNumGammeOB" id="NUM_RCNUMGAMME_OB"
				maxlength="10" cssClass="input200" /></td>
		<th><s:text name="Code Matiere premiere" /></th>
		<td><s:textfield name="numCodeMPOB" id="TNUM_CODEMP_OB"
				maxlength="6" cssClass="input200" /></td>
		<th><s:text name="Précision Senegal M.P." /></th>
		<td><s:textfield name="numPrecisionSENMPOB"
				id="TNUM_PRECISIONSENMP_OB" maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="Precision UEMOA M.P." /></th>
		<td><s:textfield name="numPrecisionUemoaMPOB"
				id="TNUM_PRECISIONUEMOAMP_OB" maxlength="2" cssClass="input200" /></td>
		<th><s:text name="Quantité importé" /></th>
		<td><s:textfield name="numQteImport" id="TNUM_QTEIMPORT"
				maxlength="11" cssClass="input200" /></td>
		<th><s:text name="Unité de masure" /></th>
		<td><s:textfield name="numUniteMesure" id="TNUM_UNITEMESURE"
				maxlength="3" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="Taux rendement" /></th>
		<td><s:textfield name="numTauxRendMNT" id="NUM_TAUXRENDMNT"
				maxlength="11" cssClass="input200" /></td>
		<th><s:text name="Quantité unitaire" /></th>
		<td><s:textfield name="numQteUnitaire" id="NUM_QTEUNITAIRE"
				maxlength="9" cssClass="input200" /></td>
		<th><s:text name="Nature produit" /></th>
		<td><s:textfield name="numRcNatProd" id="TNUM_RCNATPROD"
				maxlength="3" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="Type déchet" /></th>
		<td><s:textfield name="numTypeDechet" id="TNUM_TYPEDECHET"
				maxlength="1" cssClass="input200" /></td>
		<th><s:text name="Taux déchet" /></th>
		<td><s:textfield name="numTauxDechet" id="NUM_TAUXDECHET"
				maxlength="11" cssClass="input200" /></td>
	</tr>
</table>