<%
sn.com.douane.web.rc.form.RcPpmForm rcppmForm = 
	(sn.com.douane.web.rc.form.RcPpmForm)pageContext.findAttribute("rcPpmForm");
 %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcPpmFB.SaisiePpm" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCCODEPPM_OB" /></th>
		<td><s:textfield name="numRcCodePPMOB"
				id="TNUM_RCCODEPPM_OB" maxlength="5" 
				cssClass="input200" /></td>
		<td><s:submit cssClass="vide"></s:submit>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCCODEAGREE" /></th>
		<td><s:textfield name="numListRcCodeAgree"
				id="TNUM_LIST_RCCODEAGREE" maxlength="3" 
				cssClass="input200" /></td>
			<%  if(rcppmForm.isAgreerACreer()){ %>
			<td><s:submit key="button.create" cssClass="buttonBar"
					onclick="gotoUrl('','')"></s:submit></td>
			<% } else {%>
				<td><s:submit cssClass="vide"></s:submit>
			<%} %>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCCODECONSIGNATAIRE" /></th>
		<td><s:textfield name="numListRcCodeConsignataire"
				id="TNUM_LIST_RCCODECONSIGNATAIRE" maxlength="3" 
				cssClass="input200" /></td>
			<% if(rcppmForm.isConsignataireACreer()){ %>
			<td><s:submit key="button.create" cssClass="buttonBar"
					onclick="gotoUrl('','')"></s:submit></td>
			<% } else {%>
				<td><s:submit cssClass="vide"></s:submit>
			<%} %>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCCODECONTRIBUABLE" /></th>
		<td><s:textfield name="numRcCodeContribuable"
				id="TNUM_RCCODECONTRIBUABLE" maxlength="7" 
				cssClass="input200" /></td>
		<td><s:submit cssClass="vide"></s:submit>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCCODECREDITAIRE" /></th>
		<td><s:textfield name="numListRcCodeCreditaire"
				id="TNUM_LIST_RCCODECREDITAIRE" maxlength="3" 
				cssClass="input200" /></td>
			<%if(rcppmForm.isCreditaireACreer()){ %>
			<td><s:submit key="button.create" cssClass="buttonBar"
					onclick="gotoUrl('','')"></s:submit></td>
			<% } else {%>
				<td><s:submit cssClass="vide"></s:submit>
			<%} %>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCNINEA" /></th>
		<td><s:textfield name="numRcNinea"
				id="TNUM_RCNINEA" maxlength="11" 
				cssClass="input200" /></td>
		<td><s:submit cssClass="vide"></s:submit>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCNUMIMPORTEXPORT" /></th>
		<td><s:textfield name="numListRcNumImportExport"
				id="TNUM_LIST_RCNUMIMPORTEXPORT" maxlength="10" 
				cssClass="input200" /></td>
			<%if(rcppmForm.isImportExportACreer()){ %>
			<td><s:submit key="button.create" cssClass="buttonBar"
					onclick="gotoUrl('','')"></s:submit></td>
			<% } else {%>
				<td><s:submit cssClass="vide"></s:submit>
			<%} %>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_LIST_RCNUMREGPREFERENTIEL" /></th>
		<td><s:textfield name="numListRcNumRegPreferentiel"
				id="TNUM_LIST_RCNUMREGPREFERENTIEL" maxlength="5" 
				cssClass="input200" /></td>
			<%if(rcppmForm.isRegimePreferentielACreer()) { %>
			<td><s:submit key="button.create" cssClass="buttonBar"
					onclick="gotoUrl('','')"></s:submit></td>
			<% } else {%>
				<td><s:submit cssClass="vide"></s:submit>
			<%} %>
	</tr>
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcPpmFB.Adresseprincipale" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCNOMPPM" /></th>
		<td><s:textfield name="numRcNomPPM"
				id="TNUM_RCNOMPPM" maxlength="12" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCPRENOMPPM" /></th>
		<td><s:textfield name="numRcPrenomPPM"
				id="TNUM_RCPRENOMPPM" maxlength="18" 
				cssClass="input200" /></td>
			
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCRAISONSOCIALE" /></th>
		<td><s:textfield name="numRcRaisonSociale"
				id="TNUM_RCRAISONSOCIALE" maxlength="100" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCTITREPPM" /></th>
		<td><s:textfield name="numRcTitrePPM"
				id="TNUM_RCTITREPPM" maxlength="3" 
				cssClass="input200" /></td>
			
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCTYPEVOIEPPM" /></th>
		<td><s:textfield name="numRcTypeVoiePPM"
				id="TNUM_RCTYPEVOIEPPM" maxlength="10" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCNOMVOIEPPM" /></th>
		<td><s:textfield name="numRcNomVoiePPM"
				id="TNUM_RCNOMVOIEPPM" maxlength="50" 
				cssClass="input200" /></td>
			
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCNUMPPM" /></th>
		<td><s:textfield name="numRcNumPPM"
				id="TNUM_RCNUMPPM" maxlength="5" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCQUARTIERPPM" /></th>
		<td><s:textfield name="numRcQuartierPPM"
				id="TNUM_RCQUARTIERPPM" maxlength="50" 
				cssClass="input200" /></td>
			
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCVILLEPPM" /></th>
		<td><s:textfield name="numRcVillePPM"
				id="TNUM_RCVILLEPPM" maxlength="50" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCBOITEPOSTALEPPM" /></th>
		<td><s:textfield name="numRcBoitePostalePPM"
				id="TNUM_RCBOITEPOSTALEPPM" maxlength="50" 
				cssClass="input200" /></td>	
	</tr>
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcPpmFB.Adressesecondaire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCTYPEVOIEETABLSEC" /></th>
		<td><s:textfield name="numRcTypeVoieEtablsec"
				id="TNUM_RCTYPEVOIEETABLSEC" maxlength="10" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCNOMVOIEETABLSEC" /></th>
		<td><s:textfield name="numRcNomVoieEtablsec"
				id="TNUM_RCNOMVOIEETABLSEC" maxlength="50" 
				cssClass="input200" /></td>	
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCNUMVOIEETABLSEC" /></th>
		<td><s:textfield name="numRcNumVoieEtablsec"
				id="TNUM_RCNUMVOIEETABLSEC" maxlength="5" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCQUARTIERETABLSEC" /></th>
		<td><s:textfield name="numRcQuartierEtablsec"
				id="TNUM_RCQUARTIERETABLSEC" maxlength="50" 
				cssClass="input200" /></td>	
	</tr>
	<tr>
		<th><s:text name="RcPpmFB.TNUM_RCVILLEETABLSEC" /></th>
		<td><s:textfield name="numRcVilleEtablsec"
				id="TNUM_RCVILLEETABLSEC" maxlength="50" 
				cssClass="input200" /></td>
		<th><s:text name="RcPpmFB.TNUM_RCBPETABLSEC" /></th>
		<td><s:textfield name="numRcBpEtablsec"
				id="TNUM_RCBPETABLSEC" maxlength="5" 
				cssClass="input200" /></td>	
	</tr>
</table>

	<% /*
	<layout:text property="TNUM_RCSUSPENSIONADM" styleClass="input200" 
		key="RcPpmFB.TNUM_RCSUSPENSIONADM" maxlength="1" />
	<layout:text property="TNUM_RCCIRCUITVISITE"  styleClass="input200" 
		key="RcPpmFB.TNUM_RCCIRCUITVISITE" maxlength="1" />
	<layout:text property="TNUM_RCINDSHIPSANDLER"  styleClass="input200" 
		key="RcPpmFB.TNUM_RCINDSHIPSANDLER" maxlength="1" />
	<layout:cell />
	<layout:text property="TNUM_RCINDUSINEEXERCEE" styleClass="input200" 
		key="RcPpmFB.TNUM_RCINDUSINEEXERCEE" maxlength="1" />

	<layout:text property="TNUM_RCINDZONEFRINDUST"  styleClass="input200" 
		key="RcPpmFB.TNUM_RCINDZONEFRINDUST" maxlength="1" />
	<layout:text property="TNUM_RCCODEAMBORG"  styleClass="input200" 
		key="RcPpmFB.TNUM_RCCODEAMBORG" maxlength="5" />
	<layout:text property="DAT_RCDATESUSPENSIONADM" styleClass="input200" 
		key="RcPpmFB.DAT_RCDATESUSPENSIONADM" maxlength="10" />
	*/ %>

