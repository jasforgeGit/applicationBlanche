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
				id="TNUM_rcCodeProd_OB" maxlength="6" readonly="true"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecUemoa_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcPrecUemoaOB" id="TNUM_rcPrecUemoa_OB"
				maxlength="2" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecSenegal_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcPrecSenegalOB" readonly="true"
				id="TNUM_rcPrecSenegal_OB" maxlength="2"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcLibelleTarif" /></th>
		<td><div style="float: left;"><s:textfield name="numRcLibelleTarif" id="TNUM_rcLibelleTarif"
				maxlength="255" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCommProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCommProd" readonly="true"
				id="TNUM_rcCommProd" maxlength="255"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcIndProdPetrolier" /></th>
		<td><div style="float: left;"><s:textfield name="numRcIndProdPetrolier" id="TNUM_rcIndProdPetrolier"
				maxlength="1" cssClass="input100" readonly="true" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdCru" /></th> 
		<td><div style="float: left;"><s:textfield name="numRcCodeProdCru" readonly="true"
				id="TNUM_rcCodeProdCru" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdArtisanal" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdArtisanal" id="TNUM_rcCodeProdArtisanal"
				maxlength="1" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcUniteComp" /></th>
		<td><div style="float: left;"><s:textfield name="numRcUniteComp" readonly="true"
				id="TNUM_rcUniteComp" maxlength="2"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcSectActProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcSectActProd" id="TNUM_rcSectActProd"
				maxlength="2" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeTransit" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeTransit" readonly="true"
				id="TNUM_rcCodeTransit" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeBienEquip" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeBienEquip" id="TNUM_rcCodeBienEquip"
				maxlength="1" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.NUM_rcValEquipProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcValEquipProd" readonly="true"
				id="NUM_rcValEquipProd" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeEntrepot" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeEntrepot" id="TNUM_rcCodeEntrepot"
				maxlength="1" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdSocial" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdSocial" readonly="true"
				id="TNUM_rcCodeProdSocial" maxlength="1"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.NUM_rcValSpecProd" /></th>
		<td><div style="float: left;"><s:textfield name="numRcValSpecProd" id="NUM_rcValSpecProd"
				maxlength="8" cssClass="input100" readonly="true"/></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.NUM_LIST_rcValChapitre_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcValChapitreOB" readonly="true"
				id="NUM_LIST_rcValChapitre_OB" maxlength="2"
				cssClass="input100" /></div></td>
		<th><s:text name="RcProduitsFB.TNUM_LIST_rcCodeClasse_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeClasseOB" id="TNUM_LIST_rcCodeClasse_OB" readonly="true"
				maxlength="4" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodePerissable" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodePerissable"
				id="TNUM_rcCodePerissable" maxlength="1" readonly="true"
				cssClass="input100" /></div></td>
	</tr>
</table>
