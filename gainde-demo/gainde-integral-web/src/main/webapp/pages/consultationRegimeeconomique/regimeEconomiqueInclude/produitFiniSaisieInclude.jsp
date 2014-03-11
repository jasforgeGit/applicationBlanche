<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="Saisie produits finis" /></th>
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
		<th><s:text name="Nature rendement" /></th>
		<td><s:textfield name="numNatureRendMT" id="TNUM_NATURERENDMT"
				maxlength="2" cssClass="input200" /></td>
		<th><s:text name="Quantité unitaire" /></th>
		<td><s:textfield name="numQteUnitaire" id="NUM_QTEUNITAIRE"
				maxlength="9" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="Unité de masure" /></th>
		<td><s:textfield name="numUniteMesure" id="TNUM_UNITEMESURE"
				maxlength="3" cssClass="input200" /></td>
		<th><s:text name="Nombre Matiere Premiere" /></th>
		<td><s:textfield name="numRcNbreMatPremieres"
				id="TNUM_RCNBREMATPREMIERES" maxlength="10" cssClass="input200" /></td>
	</tr>
</table>
