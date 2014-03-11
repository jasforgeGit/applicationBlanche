<%@ taglib prefix="s" uri="/struts-tags"%>


<s:form method="post" width="100%" theme="simple">

	<%
		String action_url = "consultationTarifACT.do?reqCode=afficherPosition&page=recherchePosition";
	%>

	<table class="SECTION">

		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationTarif.RechercheChapitre" />
			</th>
		</tr>
		<tr>
			<td>

				<table class="PANEL">

					<tr>
						<th><s:label id="rccodesectionL"
								key="ConsultationTarif.rccodesection">
							</s:label></th>
						<td><s:textfield id="rccodesection" name="rcCodeSection"
								readonly="true" styleClass="input200" maxlength="2" />
						</td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCCODECHAPITRERechL"
								key="ConsultationTarif.TNUM_RCCODECHAPITRERech">
							</s:label></th>
						<td><s:textfield id="TNUM_RCCODECHAPITRERech"
								name="numRcCodeChapitreRech" styleClass="input200"
								maxlength="2" />
						</td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCLIBELLECHAPITRERechL"
								key="ConsultationTarif.TNUM_RCLIBELLECHAPITRERech">
							</s:label></th>
						<td><s:textfield id="TNUM_RCLIBELLECHAPITRERech"
								name="numRcLibelleChapitreRech" styleClass="input500"
								maxlength="255" />
						</td>
					</tr>

				</table>
	</table>

	<div style="float:left; margin-top:5px;">
		<table>
			<tr>
				<td><s:submit key="button.search" cssClass="buttonBar"
			onclick="doSubmit('rechercherChapitreAction','rechercheChapitre')">
			</s:submit>
			</td>
			<td>
			<s:submit key="button.retour"  cssClass="buttonBar"
			onclick="doReturnUrl('returnPrecedentConsultationTarif','rechercheSection')">
			</s:submit>
			</td>
			</tr>
			</table>
	</div>
	
	<table class="FORM2" style="width:100%; margin-top: 5px;">
		<tr>
			<th class="FORM2"></th>
			<th class="FORM2" align="center"><s:text
					name="listeChapitre.rccodechapitre" /></th>
			<th class="FORM2" align="center"><s:text
					name="listeChapitre.rclibellechapitre" /></th>
		</tr>	
		

		<s:iterator value="listeChapitre" id="pk">
		
		<tr>
				<td class="FORM3">
				<s:set var="key" value ="%{rccodechapitre}"/>
				<s:url  var="urlConsult" action="afficherPositionAction?page=recherchePosition" >
						    <s:param name="pk" value="%{#key}" />					   				   
						</s:url>
						<s:a href="%{urlConsult}" >
							<img src="config/edit1.jpg" border="0" />
						</s:a>
				</td>
				<td class="FORM3"><s:property value="rccodechapitre" /></td>
				<td class="FORM3"><s:property value="rclibellechapitre" /></td>
				

			</tr>
		</s:iterator>
		</table>

</s:form>
