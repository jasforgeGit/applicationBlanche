<%@ taglib prefix="s" uri="/struts-tags"%>

<%
		String urlRetour = (String) request.getSession().getAttribute("pageRetour");
System.out.println("retour produit : "+urlRetour); 
	%>

<s:form method="post" width="100%" theme="simple">


	

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
						<th><s:label id="rccodepositionL"
								key="ConsultationTarif.rccodeposition">
							</s:label></th>
						<td><s:textfield name="rcCodePosition" style="width=100px;"
								readonly="true" maxlength="4">

							</s:textfield></td>
					</tr>

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
					<tr>
						<th><s:label id="TNUM_RCLIBELLETARIFRechL"
								key="ConsultationTarif.TNUM_RCLIBELLETARIFRech">
							</s:label></th>
						<td><s:textfield name="numRcLibelleTarifRech"
								styleClass="input500" maxlength="255" /></td>
					</tr>

				</table></td>
		</tr>
	</table>

	
	<div style="float:left; margin-top:5px;">
		<table>
			<tr>
				<td><s:submit key="button.search" cssClass="buttonBar"
						onclick="doSubmit('rechercherProduitAction','rechercheProduit')">
					</s:submit></td>
				<td>
				<%if (urlRetour.equals("recherchePosition")) {%>
				<s:submit key="button.retour" cssClass="buttonBar"	onclick="doReturnUrl('returnPrecedentConsultationTarif','recherchePosition')"/>
				<% }else if (urlRetour.equals("rechercheSection"))  { %>
				
				<s:submit key="button.retour" cssClass="buttonBar"	onclick="doReturnUrl('returnPrecedentConsultationTarif','rechercheSection')"/>
				<%} %>
				</td>

			</tr>
			</table>
			</div>
		


<table class="FORM2" style="width:100%; margin-top: 5px;">
		<tr>
			<th class="FORM2"></th>
			<th class="FORM2" align="center"><s:text
					name="listeProduit.rccodeprod" /></th>
			<th class="FORM2" align="center"><s:text
					name="listeProduit.rcprecuemoa" /></th>
			<th class="FORM2" align="center"><s:text
					name="listeProduit.rcprecsenegal" /></th>
			<th class="FORM2" align="center"><s:text
					name="listeProduit.rclibelletarif" /></th>
		</tr>

		<s:iterator value="listeProduit" id="pk">
			<tr>
				<td class="FORM3">
				<s:set var="key" value ="%{rccodeprod + '~~' + rcprecuemoa + '~~' + rcprecsenegal}"/>
				<s:url  var="urlConsult" action="consulterFiscaliteAction?page=consulterFiscalite" >
						    <s:param name="pk" value="%{#key}" />					   				   
						</s:url>
						<s:a href="%{urlConsult}" >
							<img src="config/edit1.jpg" border="0" />
						</s:a>
				</td>
				<td class="FORM3"><s:property value="rccodeprod" /></td>
				<td class="FORM3"><s:property value="rcprecuemoa" /></td>
				<td class="FORM3"><s:property value="rcprecsenegal" /></td>
				<td class="FORM3"><s:property value="rclibelletarif" /></td>				
			</tr>
		</s:iterator>
		</table>
	
		

</s:form>
