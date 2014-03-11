<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text name="RcPpmFB.ConsultationPpm" /></th>
	</tr>
</table>
		<sx:tabbedpanel id="ppm">
			<sx:div labelposition="top" key="RcPpmFB.Identification"
				cssStyle="margin-bottom: 5px; width:100%;">
				<table class="SECTION">
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCCODEPPM_OB" /></th>
						<td><s:textfield name="numRcCodePPMOB" id="TNUM_RCCODEPPM_OB"
								maxlength="5" readonly="true" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_LIST_RCCODEAGREE" /></th>
						<td><s:textfield name="numListRcCodeAgree"
								id="TNUM_LIST_RCCODEAGREE" onkeyup="f9_Agreeppm(this)" readonly="true"
								maxlength="3" cssClass="input200" /></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_LIST_RCCODECONSIGNATAIRE" /></th>
						<td><s:textfield name="numListRcCodeConsignataire"
								id="TNUM_LIST_RCCODECONSIGNATAIRE"
								onkeyup="f9_Consignatairesppm(this)" maxlength="3" readonly="true"
								cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCCODECONTRIBUABLE" /></th>
						<td><s:textfield name="numRcCodeContribuable"
								id="TNUM_RCCODECONTRIBUABLE" maxlength="7" cssClass="input200" readonly="true"/></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_LIST_RCCODECREDITAIRE" /></th>
						<td><s:textfield name="numListRcCodeCreditaire"
								id="TNUM_LIST_RCCODECREDITAIRE"
								onkeyup="f9_Creditairesppm(this)" maxlength="3" readonly="true"
								cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCNINEA" /></th>
						<td><s:textfield name="numRcNinea" id="TNUM_RCNINEA"
								maxlength="11" cssClass="input200" readonly="true"/></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_LIST_RCNUMIMPORTEXPORT" /></th>
						<td><s:textfield name="numListRcNumImportExport"
								id="TNUM_LIST_RCNUMIMPORTEXPORT"
								onkeyup="f9_Importexportppm(this)" maxlength="10" readonly="true"
								cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_LIST_RCNUMREGPREFERENTIEL" /></th>
						<td><s:textfield name="numListRcNumRegPreferentiel"
								id="TNUM_LIST_RCNUMREGPREFERENTIEL"
								onkeyup="f9_Ambassadeorganismeppm(this)" maxlength="5" readonly="true"
								cssClass="input200" /></td>
					</tr>
				</table>
			</sx:div>
			<sx:div labelposition="top" key="RcPpmFB.Adresseprincipale"
				cssStyle="margin-bottom: 5px; width:100%;">
				<table class="SECTION">
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCNOMPPM" /></th>
						<td><s:textfield name="numRcNomPPM" id="TNUM_RCNOMPPM"
								maxlength="12" cssClass="input200" readonly="true"/></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCPRENOMPPM" /></th>
						<td><s:textfield name="numRcPrenomPPM" id="TNUM_RCPRENOMPPM"
								maxlength="18" cssClass="input200" readonly="true"/></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCRAISONSOCIALE" /></th>
						<td><s:textfield name="numRcRaisonSociale" readonly="true"
								id="TNUM_RCRAISONSOCIALE" maxlength="100" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCTITREPPM" /></th>
						<td><s:textfield name="numRcTitrePPM" id="TNUM_RCTITREPPM" readonly="true"
								maxlength="3" cssClass="input200" /></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCTYPEVOIEPPM" /></th>
						<td><s:textfield name="numRcTypeVoiePPM" readonly="true"
								id="TNUM_RCTYPEVOIEPPM" maxlength="10" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCNOMVOIEPPM" /></th>
						<td><s:textfield name="numRcNomVoiePPM" readonly="true"
								id="TNUM_RCNOMVOIEPPM" maxlength="50" cssClass="input200" /></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCNUMPPM" /></th>
						<td><s:textfield name="numRcNumPPM" id="TNUM_RCNUMPPM" readonly="true"
								maxlength="5" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCQUARTIERPPM" /></th>
						<td><s:textfield name="numRcQuartierPPM" readonly="true"
								id="TNUM_RCQUARTIERPPM" maxlength="50" cssClass="input200" /></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCVILLEPPM" /></th>
						<td><s:textfield name="numRcVillePPM" id="TNUM_RCVILLEPPM" readonly="true"
								maxlength="50" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCBOITEPOSTALEPPM" /></th>
						<td><s:textfield name="numRcBoitePostalePPM" readonly="true"
								id="TNUM_RCBOITEPOSTALEPPM" maxlength="5" cssClass="input200" /></td>
					</tr>
				</table>
			</sx:div>
			<sx:div labelposition="top" key="RcPpmFB.Adressesecondaire"
				cssStyle="margin-bottom: 5px; width:100%;">
				<table class="SECTION">
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCTYPEVOIEETABLSEC" /></th>
						<td><s:textfield name="numRcTypeVoieEtablsec" readonly="true"
								id="TNUM_RCTYPEVOIEETABLSEC" maxlength="10" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCNOMVOIEETABLSEC" /></th>
						<td><s:textfield name="numRcNomVoieEtablsec" readonly="true"
								id="TNUM_RCNOMVOIEETABLSEC" maxlength="5" cssClass="input200" /></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCNUMVOIEETABLSEC" /></th>
						<td><s:textfield name="numRcNumVoieEtablsec" readonly="true"
								id="TNUM_RCNUMVOIEETABLSEC" maxlength="5" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCQUARTIERETABLSEC" /></th>
						<td><s:textfield name="numRcQuartierEtablsec" readonly="true"
								id="TNUM_RCQUARTIERETABLSEC" maxlength="50" cssClass="input200" /></td>
					</tr>
					<tr>
						<th><s:text name="RcPpmFB.TNUM_RCVILLEETABLSEC" /></th>
						<td><s:textfield name="numRcVilleEtablsec" readonly="true"
								id="TNUM_RCVILLEETABLSEC" maxlength="50" cssClass="input200" /></td>
								<td style="width: 10%;"></td>
						<th><s:text name="RcPpmFB.TNUM_RCBPETABLSEC" /></th>
						<td><s:textfield name="numRcBpEtablsec" readonly="true"
								id="TNUM_RCBPETABLSEC" maxlength="5" cssClass="input200" /></td>
					</tr>
				</table>

			</sx:div>
		</sx:tabbedpanel>
	