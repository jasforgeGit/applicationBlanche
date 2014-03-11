<%@ taglib prefix="s" uri="/struts-tags"%>

<%
	String onClick = "if (controleRadio('pk')) lister('afficherMatierespremieres','consultationMatierespremieres');"
			+ "else alert ('"
			+ tn.com.tw.java.exception.ConstErrCodRC.radioNotSelected
			+ "');";
%>

<s:form method="post" width="100%" theme="simple" onsubmit="return (false)">
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationRegimeeconomique.Regimeeconomique" /></th>
		</tr>
		<tr>
			<th><s:text name="ConsultationRegimeeconomique.rcanneeregeco" /></th>
			<td><s:textfield name="rcanneeregeco" maxlength="4" readonly="true"
					cssClass="input100" /></td>

			<th><s:text name="ConsultationRegimeeconomique.rcnumregeco" /></th>
			<td><s:textfield name="rcnumregeco" maxlength="6" readonly="true"
					cssClass="input100" /></td>

			<th><s:text name="ConsultationRegimeeconomique.rccodeppm" /></th>
			<td><s:textfield name="rccodeppm" maxlength="5" readonly="true"
					cssClass="input100" /></td>
		</tr>
	</table>

	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationRegimeeconomique.Produitfini" /></th>
		</tr>
		<tr>
			<th><s:text name="ConsultationRegimeeconomique.rccodeprod" /></th>
			<td><s:textfield name="rccodeprod" maxlength="6"
					cssClass="input100" readonly="true" /></td>

			<th><s:text name="ConsultationRegimeeconomique.rcprecuemoa" /></th>
			<td><s:textfield name="rcprecuemoa" readonly="true"
					maxlength="2" cssClass="input100" /></td>
			<th><s:text name="ConsultationRegimeeconomique.rcprecsen" /></th>
			<td><s:textfield name="rcprecsen" readonly="true" maxlength="2"
					cssClass="input100" /></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="doSubmitWithaoutValidate2('rechercherProduitsfinis','rechercheProduitsfinis')"></s:submit>
		</tr>
	</table>
	<table>
		<tr>
			<td><s:submit key="button.ListeMatierespremieres"
					cssClass="buttonBar" disabled="true"
					onclick="if (controleRadio('pk')) lister('afficherMatierespremieres','consultationMatierespremieres');"></s:submit>
		</tr>
	</table>


	<input type="hidden" name="pkSelected">
	<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
			<th class="FORM2"></th>
			<th class="FORM2"><s:label key="listeGammes.rcnumgamme" /></th>
			<th class="FORM2"><s:label key="listeGammes.rcnaturerendement" /></th>
			<th class="FORM2"><s:label key="listeGammes.rcqteunitaire" /></th>
			<th class="FORM2"><s:label key="listeGammes.rcunitemesure" /></th>
			<th class="FORM2"><s:label key="listeGammes.rcnbrematpremieres" /></th>
		</tr>
		<s:iterator value="listeGammes">
			<tr>
				<s:set var="key"
					value="%{rcAnneeRegEco+'~~'+rcNumRegEco+'~~'+rcCodePpm+'~~'+rcCodeProd+'~~'+rcPrecUemoa+'~~'+rcPrecSen+'~~'+rcNumGamme}" />
				<td class="FORM3"><s:radio id="pk" name="pk" list="#{key:''}" /></td>
				<td class="FORM3"><s:property value="rcNumGamme" /></td>
				<td class="FORM3"><s:property value="rcNatureRendement" /></td>
				<td class="FORM3"><s:property value="rcQteUnitaire" /></td>
				<td class="FORM3"><s:property value="rcUniteMesure" /></td>
				<td class="FORM3"><s:property value="rcNbreMatPremieres" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>