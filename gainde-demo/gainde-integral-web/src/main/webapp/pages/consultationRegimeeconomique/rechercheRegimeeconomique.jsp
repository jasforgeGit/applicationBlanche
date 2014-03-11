<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<script type="text/javascript">
controleRadio=false;
$.subscribe('rowselect', function(event, data) {
	 document.forms.item(0).pkSelected.value=event.originalEvent.id;
	 controleRadio=true;});
</script>

<s:form method="post" width="100%" theme="simple"  onsubmit="return (false)">
	<s:hidden name="hidden" id="hidden"></s:hidden>
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="8"><s:text
					name="ConsultationRegimeeconomique.RechercheRegimeeconomique" /></th>
		</tr>
		<tr>
			<th><s:text
					name="ConsultationRegimeeconomique.TNUM_RCANNEEREGECORech" /></th>
			<td><s:textfield name="numRcAnneeRegEcoRech"
					id="TNUM_RCANNEEREGECORech" maxlength="4" cssClass="input100" /></td>
			<th><s:text
					name="ConsultationRegimeeconomique.TNUM_RCNUMREGECORech" /></th>
			<td><s:textfield name="numRcNumRegEcoRech"
					id="TNUM_RCNUMREGECORech" maxlength="6" cssClass="input100" /></td>
			<th><s:text
					name="ConsultationRegimeeconomique.TNUM_LIST_RCPPMBENEFICIAIRERech" /></th>
			<td><s:textfield name="numListRcPPMBeneficiaireRech"
					id="TNUM_LIST_RCPPMBENEFICIAIRERech" onkeyup="f9_PPM1(this,event)"
					required="true" maxlength="5" cssClass="input100" /></td>
		</tr>
		<tr>
			<th><s:text
					name="ConsultationRegimeeconomique.TNUM_RCCODECREDITAIRERech" /></th>
			<td><s:textfield name="numRcCodeCreditaireRech"
					id="TNUM_RCCODECREDITAIRERech" maxlength="3" cssClass="input100" /></td>
			<th><s:text
					name="ConsultationRegimeeconomique.TNUM_LIST_RCCODENATREGECORech" /></th>
			<td><s:textfield name="numListRcCodeNatRegEcoRech"
					id="TNUM_LIST_RCCODENATREGECORech" onkeyup="f9_NatureRegEco(this,event)"
					maxlength="1" cssClass="input100" /></td>
			<th><s:text
					name="ConsultationRegimeeconomique.DAT_RCDATEVALIDITEREGECORech" /></th>
			<td><sj:datepicker id="datRcDateValiditeRegEcoRech"
					name="DAT_RCDATEVALIDITEREGECORech" showOn="focus"
					displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRegimeeconomique','rechercheRegimeeconomique')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><s:submit key="button.ListeProduitFinis"
					cssClass="buttonBar"
					onclick="if (controleRadio) lister2('rechercherProduitsfinis','rechercheProduitsfinis');else alert ('Sélectionnez un élement de la liste !');
					"></s:submit>
			</td>
		</tr>
	</table>
	<input type="hidden" name="pkSelected">

	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="regimeEconomiqueGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRegimeeconomique" sortable="true"
	         onSelectRowTopics="rowselect"
	        width="800">
	            <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
		    	<sjg:gridColumn name="rcanneeregeco" title="%{getText('listeRegimeeconomique.rcanneeregeco')}" />
		    	<sjg:gridColumn name="rcnumregeco"  title="%{getText('listeRegimeeconomique.rcnumregeco')}" />
		    	<sjg:gridColumn name="rcrefjuridiqueregeco"  title="%{getText('listeRegimeeconomique.rcrefjuridiqueregeco')}" />
		        <sjg:gridColumn name="rcppmbeneficiaire"  title="%{getText('listeRegimeeconomique.rcppmbeneficiaire')}" />
		    	<sjg:gridColumn name="rcraisonsociale"  title="%{getText('listeRegimeeconomique.rcraisonsociale')}" />
	    </sjg:grid>
	 </div>	



<!-- 	<table class="FORM2" style="width: 100%; margin-top: 0px;"> -->

<!-- 		<tr> -->
<!-- 			<th class="FORM2"></th> -->
<%-- 			<th class="FORM2"><s:label --%>
<%-- 					key="listeRegimeeconomique.rcanneeregeco" /></th> --%>
<%-- 			<th class="FORM2"><s:label --%>
<%-- 					key="listeRegimeeconomique.rcnumregeco" /></th> --%>
<%-- 			<th class="FORM2"><s:label --%>
<%-- 					key="listeRegimeeconomique.rcrefjuridiqueregeco" /></th> --%>
<%-- 			<th class="FORM2"><s:label --%>
<%-- 					key="listeRegimeeconomique.rcppmbeneficiaire" /></th> --%>
<%-- 			<th class="FORM2"><s:label --%>
<%-- 					key="listeRegimeeconomique.rcraisonsociale" /></th> --%>
<!-- 		</tr> -->
<%-- 		<s:iterator value="listeRegimeeconomique"> --%>
<!-- 			<tr> -->
<%-- 				<s:set var="key" value="%{rcanneeregeco+'~~'+rcnumregeco}" /> --%>
<%-- 				<td class="FORM3"><s:radio id="pk" name="pk" list="#{key:''}" /></td> --%>
<%-- 				<td class="FORM3"><s:property value="rcanneeregeco" /></td> --%>
<%-- 				<td class="FORM3"><s:property value="rcnumregeco" /></td> --%>
<%-- 				<td class="FORM3"><s:property value="rcrefjuridiqueregeco" /></td> --%>
<%-- 				<td class="FORM3"><s:property value="rcppmbeneficiaire" /></td> --%>
<%-- 				<td class="FORM3"><s:property value="rcraisonsociale" /></td> --%>
<!-- 			</tr> -->
<%-- 		</s:iterator> --%>
<!-- 	</table> -->
</s:form>