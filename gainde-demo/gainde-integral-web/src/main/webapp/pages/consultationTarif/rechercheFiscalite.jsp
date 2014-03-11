<%@ taglib prefix="s" uri="/struts-tags"%>



<s:form  method="post" width="100%" theme="simple">

	<table class="SECTION">

		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationTarif.RechercheProduit" />
			</th>
		</tr>
		<tr>
			<td>


				<table class="PANEL">
					<tr>
						<th><s:label id="TNUM_RCCODEPRODRechL"
								key="ConsultationTarif.TNUM_RCCODEPRODRech">
							</s:label></th>
						<td><s:textfield name="numRcCodeProdRech"
								styleClass="input200" maxlength="6" /></td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCPRECUEMOARechL"
								key="ConsultationTarif.TNUM_RCPRECUEMOARech">
							</s:label></th>
						<td><s:textfield name="numRcPrecUemoaRech"
								styleClass="input200" maxlength="2" /></td>
					</tr>

					<tr>
						<th><s:label id="TNUM_RCPRECSENEGALRechL"
								key="ConsultationTarif.TNUM_RCPRECSENEGALRech">
							</s:label></th>
						<td><s:textfield name="numRcPrecSenegalRech"
								styleClass="input200" maxlength="2" /></td>
					</tr>

				</table>
			</td>
		</tr>


		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="Réglementation Générale" />
			</th>
		</tr>
		<tr>
			<td>
				<table class="PANEL">

					<tr>
						<th><s:label id="rcindprodpetrolierL"
								key="Produit pétrolier:">
							</s:label></th>
						<td><s:textfield name="rcIndProdPetrolier" readonly="true" />
						</td>
					
						<th><s:label id="rccodeprodcruL" key="Produit du cru:">
							</s:label></th>
						<td><s:textfield name="rcCodeProdCru" readonly="true" /></td>
					</tr>

					<tr>
						<th><s:label id="rccodeprodartisanalL"
								key="Produit artisanal:">
							</s:label></th>
						<td><s:textfield name="rcCodeProdArtisanal" readonly="true" />
						</td>
					
						<th><s:label id="rcunitecompL" key="Unité complémentaire:">
							</s:label></th>
						<td><s:textfield name="rcUniteComp" readonly="true" /></td>
					</tr>
					<tr>
						<th><s:label id="rccodetransitL"
								key="produit exclu du transit:">
							</s:label></th>
						<td><s:textfield name="rcCodeTransit" readonly="true" /></td>
					
						<th><s:label id="rccodebienequipL" key="Bien d'équipement:">
							</s:label></th>
						<td><s:textfield name="rcCodebienEquip" readonly="true" /></td>
					</tr>
					<tr>
						<th><s:label id="rccodeentrepotL"
								key="Produit admis entrepôt:">
							</s:label></th>
						<td><s:textfield name="rcCodeEntrepot" readonly="true" /></td>
					
						<th><s:label id="rccodeprodsocialL" key="Produit social:">
							</s:label></th>
						<td><s:textfield name="rcCodeProdSocial" readonly="true" />
						</td>
					</tr>
					<tr>
						<th><s:label id="rccodeperissableL" key="Produit périssable:">
							</s:label></th>
						<td><s:textfield name="rcCodePerissable" readonly="true" />
						</td>
					
						<th><s:label id="rcexonorepviL" key="Exonoration PVI:">
							</s:label></th>
						<td><s:textfield name="rcExonorePvi" readonly="true" />
						</td>
					</tr>

				</table>
			</td>
		</tr>

		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="Réglementation Import du Produit" />
			</th>
		</tr>
		<tr>
			<td>
				<table class="PANEL">
					<tr>
						<th><s:label id="visiteImpL" key="Visite:">
							</s:label></th>
						<td><s:textfield name="visiteImp" readonly="true" />
						</td>
					
						<th><s:label id="escorteL" key="Escorte:">
							</s:label></th>
						<td><s:textfield name="escorte" readonly="true" />
						</td>
					</tr>
					<tr>
						<th><s:label id="prohibitionImpL" key="Prohibition:">
							</s:label></th>
						<td><s:textfield name="prohibitionImp" readonly="true" />
						</td>
					
						<th><s:label id="timbreDouaneL" key="Timbre douanier 12%:">
							</s:label></th>
						<td><s:textfield name="timbreDouane" readonly="true" />
						</td>
					</tr>
					<tr>
						<th><s:label id="valeurPerImpL" key="Valeur min perception:">
							</s:label></th>
						<td><s:textfield name="valeurPerImp" readonly="true" />
						</td>
					
						<th><s:label id="uniteMercurialeImpL" key="Unité mercuriale:">
							</s:label></th>
						<td><s:textfield name="uniteMercurialeImp" readonly="true" />
						</td>
					</tr>
					<tr>
						<th><s:label id="valeurMercurialeImpL"
								key="Valeur mercuriale:">
							</s:label></th>
						<td><s:textfield name="valeurMercurialeImp" readonly="true" />
						</td>
					
						<th><s:label id="baseCalculImpL" key="Base de calcul:">
							</s:label></th>
						<td><s:textfield name="baseCalculImp" readonly="true" />
						</td>
					</tr>

					<tr>
						<th><s:label id="valeurMinimalImpL" key="Valeur minimale:">
							</s:label></th>
						<td><s:textfield name="valeurMinimalImp" readonly="true" />
						</td>
					
						<th><s:label id="valeurMedianeImpL" key="Valeur médiane">
							</s:label></th>
						<td><s:textfield name="valeurMedianeImp" readonly="true" />
						</td>
					</tr>

					<tr>
						<th><s:label id="classeProduitL" key="Classe du produit">
							</s:label></th>
						<td><s:textfield name="classeProduit" readonly="true" />
						</td>
					</tr>
				</table>
			</td>
		</tr>

		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="Réglementation Export du Produit" />
			</th>
		</tr>
		<tr>
			<td>
				<table class="PANEL">

					<tr>
						<th><s:label id="visiteExpL" key="Visite:">
							</s:label></th>
						<td><s:textfield name="visiteExp" readonly="true" />
						</td>
					
						<th><s:label id="subventionL" key="Subvention:">
							</s:label></th>
						<td><s:textfield name="subvention" readonly="true" /></td>
					</tr>
					<tr>
						<th><s:label id="prohibitionExpL" key="Prohibition:">
							</s:label></th>
						<td><s:textfield name="prohibitionExp" readonly="true" /></td>
					
					<th><s:label id="valeurPerExpL"
								key="Valeur minimale de perception:">
							</s:label></th>
						<td><s:textfield name="valeurPerExp" readonly="true" /></td>
					</tr>

					<tr>
						<th><s:label id="uniteMercurialeExpL" key="Unité mercuriale:">
							</s:label></th>
						<td><s:textfield name="uniteMercurialeExp" readonly="true" />
						</td>
					
						<th><s:label id="valeurMercurialeExpL"
								key="Valeur mercuriale:">
							</s:label></th>
						<td><s:textfield name="valeurMercurialeExp" readonly="true" />
						</td>
					</tr>

					<tr>
						<th><s:label id="baseCalculExpL" key="Base de calcul:">
							</s:label></th>
						<td><s:textfield name="baseCalculExp" readonly="true" /></td>
					
						<th><s:label id="valeurMinimalExpL" key="Valeur minimale:">
							</s:label></th>
						<td><s:textfield name="valeurMinimalExp" readonly="true" />
						</td>
					</tr>

					<tr>
						<th><s:label id="valeurMedianeExpL" key="Valeur médiane">
							</s:label></th>
						<td><s:textfield name="valeurMedianeExp" readonly="true" />
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

	<div style="float:left; margin-top:5px;">
		<s:submit key="button.retour" cssClass="buttonBar"
			onclick="doReturnUrl('returnPrecedentConsultationTarif','rechercheProduit')">
		</s:submit>
	</div>
	
	<tr>
	<td colspan="2" valign="top">
	<p class="FORM2">Liste des fiscalités Imports</p>
	
	<div style="width:100%;overflow-x:auto;">
	<table class="FORM2" style="width:100%; margin-top: 5px;">	

		<tr>
			<th class="FORM2" align="center"><s:text name="Code taxe" /></th>
			<th class="FORM2" align="center"><s:text name="Code taux" /></th>
			<th class="FORM2" align="center"><s:text name="Libellé taux" />
			</th>
			<th class="FORM2" align="center"><s:text name="Quotité" /></th>
			<th class="FORM2" align="center"><s:text
					name="Date d'application" /></th>
		</tr>

		<s:iterator value="listeFiscaliteImp" id="pk">

			<tr>
				<td class="FORM3"><s:property value="rcCodeTaxe" /></td>
				<td class="FORM3"><s:property value="rcCodeTaux" /></td>
				<td class="FORM3"><s:property value="libelleTaux" /></td>
				<td class="FORM3"><s:property value="rcValeurTaux" /></td>
				<td class="FORM3"><s:property value="dateValeurTaux" /></td>

			</tr>
		</s:iterator>
	</table>
	</div>
	</td>
	</tr>


	<tr>
	<td colspan="2" valign="top">
	<p class="FORM2">Liste des fiscalités exports</p>
	
	<div style="width:100%;overflow-x:auto;">

	<table class="FORM2" style="width:100%; margin-top: 5px;">		

		<tr>
			<th class="FORM2" align="center"><s:text name="Code taxe" /></th>
			<th class="FORM2" align="center"><s:text name="Code taux" /></th>
			<th class="FORM2" align="center"><s:text name="Libellé taux" />
			</th>
			<th class="FORM2" align="center"><s:text name="Quotité" /></th>
			<th class="FORM2" align="center"><s:text
					name="Date d'application" /></th>
		</tr>

		<s:iterator value="listeFiscaliteExp" id="pk">

			<tr>
				<td class="FORM3"><s:property value="rcCodeTaxe" /></td>
				<td class="FORM3"><s:property value="rcCodeTaux" /></td>
				<td class="FORM3"><s:property value="libelleTaux" /></td>
				<td class="FORM3"><s:property value="rcValeurTaux" /></td>
				<td class="FORM3"><s:property value="dateValeurTaux" /></td>

			</tr>
		</s:iterator>
	</table>
	</div>
	</td>
	</tr>

	<tr>
	<td colspan="2" valign="top">
	<p class="FORM2">Liste des pieces jointes import</p>
	
	<div style="width:100%;overflow-x:auto;">
	
	<table class="FORM2" style="width:100%; margin-top: 5px;">

		<tr>
			<th class="FORM2" align="center"><s:text name="Code" /></th>
			<th class="FORM2" align="center"><s:text
					name="Libellé Piece jointe" /></th>
			<th class="FORM2" align="center"><s:text name="Date valeur" />
			</th>
		</tr>

		<s:iterator value="listePieceJointe" id="pk">

			<tr>
				<td class="FORM3"><s:property value="rccodepj" /></td>
				<td class="FORM3"><s:property value="libellePj" /></td>
				<td class="FORM3"><s:property value="datepiecejointe" /></td>
			</tr>
		</s:iterator>
	</table>
	
	</div>
	</td>
	</tr>

	
	<tr>
	<td colspan="2" valign="top">
	<p class="FORM2">Liste des pieces jointes Export</p>
	
	<div style="width:100%;overflow-x:auto;">
	
	<table class="FORM2" style="width:100%; margin-top: 5px;">		

		<tr>
			<th class="FORM2" align="center"><s:text name="Code" /></th>
			<th class="FORM2" align="center"><s:text
					name="Libellé Piece jointe" /></th>
			<th class="FORM2" align="center"><s:text name="Date valeur" />
			</th>
		</tr>

		<s:iterator value="listePieceJointeExp" id="pk">

			<tr>
				<td class="FORM3"><s:property value="rccodepj" /></td>
				<td class="FORM3"><s:property value="libellePj" /></td>
				<td class="FORM3"><s:property value="datepiecejointe" /></td>
			</tr>
		</s:iterator>
	</table>
	
	</div>
	</td>
	</tr>

</s:form>
