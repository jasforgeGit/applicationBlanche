<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<%
	String onClick = "if (controleRadio('pk')) lister('rechercherProduitsfinis','rechercheProduitsfinis');"
			+ "else alert ('"
			+ tn.com.tw.java.exception.ConstErrCodRC.radioNotSelected
			+ "');";
%>
<s:form method="post" width="100%" theme="simple" onsubmit="return (false)">
<s:hidden name="hidden" id="hidden"></s:hidden>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="ConsultationRegimeeconomique.RechercheRegimeeconomique" /></th>
	</tr>
	<tr>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_RCANNEEREGECORech" /></th>
		<td><s:textfield name="numRcAnneeRegEcoRech"
				id="TNUM_RCANNEEREGECORech" maxlength="4"
				cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_RCNUMREGECORech" /></th>
		<td><s:textfield name="numRcNumRegEcoRech" id="TNUM_RCNUMREGECORech"
				maxlength="6" cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_LIST_RCPPMBENEFICIAIRERech" /></th>
		<td><s:textfield name="numListRcPPMBeneficiaireRech" id="TNUM_LIST_RCPPMBENEFICIAIRERech" onkeyup="f9_PPM1(this,event)"
			required="true"	maxlength="5" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_RCCODECREDITAIRERech" /></th>
		<td><s:textfield name="numRcCodeCreditaireRech"
				id="TNUM_RCCODECREDITAIRERech" maxlength="3"
				cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_LIST_RCCODENATREGECORech" /></th>
		<td><s:textfield name="numListRcCodeNatRegEcoRech" id="TNUM_LIST_RCCODENATREGECORech" onkeyup="f9_NatureRegEco(this,event)"
				maxlength="1" cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.DAT_RCDATEVALIDITEREGECORech" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALIDITEREGECORech" name="datRcDateValiditeRegEcoRech"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></td>
	</tr>
</table>
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit('rechercherRegimeeconomique','cherchesRegimeeconomique')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
	<input type="hidden" name="pkSelected">
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
			<th class="FORM2"><s:label /></th>
			<th class="FORM2"><s:label /></th>
			<th class="FORM2"><s:label key="listeRegimeeconomique.rcanneeregeco" /></th>
			<th class="FORM2"><s:label key="listeRegimeeconomique.rcnumregeco" /></th>
			<th class="FORM2"><s:label key="listeRegimeeconomique.rcrefjuridiqueregeco" /></th>
			<th class="FORM2"><s:label key="listeRegimeeconomique.rcppmbeneficiaire" /></th>
			<th class="FORM2"><s:label key="listeRegimeeconomique.rcraisonsociale" /></th>
		</tr>
		<s:iterator value="listeRegimeeconomique">
			<tr>
				<td class="FORM3"><s:set var="key" value="%{rcanneeregeco+'~~'+rcnumregeco}" /> <s:url
						var="remove" 
						action="supprimerRegEconomique.action?page=cherchesRegimeeconomique">
						<s:param name="pk" value="%{key}" />
					</s:url> <s:a href="%{remove}"
						onclick="return confirm(hidden_message.value)">
						<img src="config/delete.jpg" border="0" />
					</s:a></td>
					<td class="FORM3"><s:set var="key" value="%{rcanneeregeco+'~~'+rcnumregeco}" /> 
					<s:url var="link"
						action="afficherRegimeEconomique.action?page=modificationRegimeEconomique">
						<s:param name="pk" value="%{key}" />
					</s:url> 	
					<s:a href="%{link}">
						<img src="config/edit1.jpg" border="0" />
					</s:a></td>
				<td class="FORM3"><s:property value="rcanneeregeco" /></td>
				<td class="FORM3"><s:property value="rcnumregeco" /></td>
				<td class="FORM3"><s:property value="rcrefjuridiqueregeco" /></td>
				<td class="FORM3"><s:property value="rcppmbeneficiaire" /></td>
				<td class="FORM3"><s:property value="rcraisonsociale" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>
