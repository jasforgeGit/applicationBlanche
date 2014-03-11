<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcProduitsFB.Produits" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProd_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdOB"
				id="TNUM_rcCodeProd_OB" maxlength="6"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecUemoa_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcPrecUemoaOB" id="TNUM_rcPrecUemoa_OB"
				maxlength="2" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecSenegal_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcPrecSenegalOB"
				id="TNUM_rcPrecSenegal_OB" maxlength="2"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcLibelleTarif" /></th>
		<td><div style="float: left;"><s:textfield name="numRcLibelleTarif" id="TNUM_rcLibelleTarif"
				maxlength="255" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCommProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCommProd"
				id="TNUM_rcCommProd" maxlength="255"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcIndProdPetrolier" /></th>
		<td><div style="float: left;"><s:textfield name="numRcIndProdPetrolier" id="TNUM_rcIndProdPetrolier"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdCru" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdCru"
				id="TNUM_rcCodeProdCru" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdArtisanal" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdArtisanal" id="TNUM_rcCodeProdArtisanal"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcUniteComp" /></th>
		<td><div style="float: left;"><s:textfield name="numRcUniteComp"
				id="TNUM_rcUniteComp" maxlength="2"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcSectActProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcSectActProd" id="TNUM_rcSectActProd"
				maxlength="2" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeTransit" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeTransit"
				id="TNUM_rcCodeTransit" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeBienEquip" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeBienEquip" id="TNUM_rcCodeBienEquip"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.NUM_rcValEquipProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcValEquipProd"
				id="NUM_rcValEquipProd" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeEntrepot" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeEntrepot" id="TNUM_rcCodeEntrepot"
				maxlength="1" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdSocial" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdSocial"
				id="TNUM_rcCodeProdSocial" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.NUM_rcValSpecProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcValSpecProd" id="NUM_rcValSpecProd"
				maxlength="8" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.NUM_LIST_rcValChapitre_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcValChapitreOB" onkeyup="f9_ChapitreSection(this,event)"
				id="NUM_LIST_rcValChapitre_OB" maxlength="2"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_LIST_rcCodeClasse_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeClasseOB" id="TNUM_LIST_rcCodeClasse_OB" onkeyup="f9_Classe(this,event)"
				maxlength="4" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodePerissable" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodePerissable"
				id="TNUM_rcCodePerissable" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="Exonoration PVI" /></th>
		<td><div style="float: left;"><s:textfield name="numRcExonorePvi"
				id="TNUM_rcRcExonorePvi_OB" maxlength="1"
				cssClass="input100" /></div></td>
	</tr>
	
</table>
