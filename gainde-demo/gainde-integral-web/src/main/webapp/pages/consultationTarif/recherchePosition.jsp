<%@ taglib prefix="s" uri="/struts-tags"%>


<s:form  method="post" width="100%" theme="simple">

	<table class="SECTION">

		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationTarif.RecherchePosition" />
			</th>
		</tr>
		<tr>
			<td>
		
		<table class="PANEL" >
			<tr>
			<th><s:label id="rccodechapitreL"
								key="ConsultationTarif.rccodechapitre">
							</s:label></th>
			<td>			
			<s:textfield name="rcCodeChapitre" styleClass="input200"
				readonly="true" maxlength="2" />			
			</td>
			</tr>
			<tr>
			<th><s:label id="TNUM_RCCODEPOSITIONRechL"
								key="ConsultationTarif.TNUM_RCCODEPOSITIONRech">
							</s:label></th>
			<td>
			<s:textfield name="numRcCodePositionRech" styleClass="input200"
				 maxlength="4" />
			</td>
			</tr>
			<tr>
			<th><s:label id="TNUM_RCLIBELLEPOSITIONRechL"
								key="ConsultationTarif.TNUM_RCLIBELLEPOSITIONRech">
							</s:label></th>
			<td>	
				 
			<s:textfield name="numRcLibellePositionRech"
				styleClass="input500"
				 maxlength="255" />
			</td>
			</tr>
		</table>
		</td>
		</tr>
	</table>

	<div style="float:left; margin-top:5px;">
		<table>
			<tr>
				<td><s:submit key="button.search" cssClass="buttonBar"
			onclick="doSubmit('rechercherPositionAction','recherchePosition')">
			</s:submit>
			</td>
			
		<td><s:submit key="button.retour" cssClass="buttonBar"
			onclick="doReturnUrl('returnPrecedentConsultationTarif','rechercheChapitre')">
			</s:submit>
			</td>
			</tr>
	</table>
	</div>	
	

<table class="FORM2" style="width:100%; margin-top: 5px;">
		<tr>
			<th class="FORM2"></th>
			<th class="FORM2" align="center"><s:text
					name="listePosition.rccodeposition" /></th>
			<th class="FORM2" align="center"><s:text
					name="listePosition.rclibelleposition" /></th>
			
		</tr>

		<s:iterator value="listePosition" id="pk">
			<tr>
				<td class="FORM3">
				<s:set var="key" value ="%{rcCodePosition}"/>
				<s:url  var="urlConsult" action="afficherProduitAction?page=rechercheProduit" >
						    <s:param name="pk" value="%{#key}" />					   				   
						</s:url>
						<s:a href="%{urlConsult}" >
							<img src="config/edit1.jpg" border="0" />
						</s:a>
				</td>
				<td class="FORM3"><s:property value="rcCodePosition" /></td>
				<td class="FORM3"><s:property value="rcLibellePosition" /></td>
								
			</tr>
		</s:iterator>
		</table>
	
	
</s:form>
