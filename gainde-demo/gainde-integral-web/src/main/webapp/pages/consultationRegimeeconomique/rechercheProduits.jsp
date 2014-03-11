<%@ taglib prefix="s" uri="/struts-tags"%>

<%
	String onClickBur = "if (controleRadio('pk')) lister('rechercherBureaux','consultationBureaux');"+
					"else alert ('"+tn.com.tw.java.exception.ConstErrCodRC.radioNotSelected+"');";
	
	String onClickGam = "if (controleRadio('pk')) lister('rechercherGammes','rechercheGammes');"+
					"else alert ('"+tn.com.tw.java.exception.ConstErrCodRC.radioNotSelected+"');";

 %>

<s:form method="post" width="100%" theme="simple" onsubmit="return (false)">
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="ConsultationRegimeeconomique.Regimeeconomique" /></th>
	</tr>
	<tr>
		<th><s:text name="ConsultationRegimeeconomique.rcanneeregeco" /></th>
		<td><s:textfield name="rcanneeregeco" maxlength="4" cssClass="input100" readonly="true"/></td>
		
		<th><s:text name="ConsultationRegimeeconomique.rcnumregeco" /></th>
		<td><s:textfield name="rcnumregeco" readonly="true"
				maxlength="6" cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.rccodeppm" /></th>
		<td><s:textfield name="rccodeppm" 
			readonly="true"	maxlength="5" cssClass="input100" /></td>
	</tr>
</table>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="ConsultationRegimeeconomique.RechercheProduitsfinis" /></th>
	</tr>
	<tr>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_RCCODEPRODRech" /></th>
		<td><s:textfield name="numRcCodeProdRech"
				id="TNUM_RCCODEPRODRech" maxlength="6"
				cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_RCPRECUEMOARech" /></th>
		<td><s:textfield name="numRcPrecuemoaRech" id="TNUM_RCPRECUEMOARech"
				maxlength="2" cssClass="input100" /></td>
		<th><s:text name="ConsultationRegimeeconomique.TNUM_RCPRECSENRech" /></th>
		<td><s:textfield name="numRcPrecsenRech" id="TNUM_RCPRECSENRech" 
				maxlength="2" cssClass="input100" /></td>
	</tr>
</table>
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherProduitsfinis','rechercheProduitsfinis')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doSubmitWithaoutValidate2('returnPrecedentProduitsfinis','rechercheRegimeeconomique')"></s:submit></td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td><s:submit key="button.ListeBureaux" cssClass="buttonBar"
					onclick="if (controleRadio('pk')) lister2('rechercherBureaux','consultationBureaux');"></s:submit>
				<s:submit key="button.ListeGammes" cssClass="buttonBar"
					onclick="if (controleRadio('pk')) lister2('rechercherGammes','rechercheGammes');"></s:submit></td>
		</tr>
	</table>
<input type="hidden" name="pkSelected"/>
<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
            <th class="FORM2"></th>
			<th class="FORM2"><s:label key="listeProduitsfinis.rccodeprod" /></th>
			<th class="FORM2"><s:label key="listeProduitsfinis.rcprecuemoa" /></th>
			<th class="FORM2"><s:label key="listeProduitsfinis.rcprecsen" /></th>
		</tr>
		<s:iterator value="listeProduitsfinis">
			<tr>
				<s:set var="key" value ="%{rcAnneeRegEco+'~~'+rcNumRegEco+'~~'+rcCodePpm+'~~'+rcCodeProd+'~~'+rcPrecUemoa+'~~'+rcPrecSen+'~~'+rcNumGamme}"/>					
				<td class="FORM3"> <s:radio id="pk" name="pk" list="#{key:''}" /></td>
				<td class="FORM3"><s:property value="rcCodeProd" /></td>
				<td class="FORM3"><s:property value="rcPrecUemoa" /></td>
				<td class="FORM3"><s:property value="rcPrecSen" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>
