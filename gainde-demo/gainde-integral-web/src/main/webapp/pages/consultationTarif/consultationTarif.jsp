<%@ taglib prefix="s" uri="/struts-tags"%>

<%   	 
    String ctxmenu = (String) request.getSession().getAttribute("ctxmenu"); 
    System.out.println("ctxmenu in jsp consultationTarif.jsp : "+ctxmenu);       
%>

<s:form method="post" width="100%" theme="simple">

	<table class="SECTION">

		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationTarif.RechercheSection" /></th>
		</tr>
		<tr>
			<td>
				<table class="PANEL">
					<tr>
						<th><s:label id="TNUM_RCCODESECTIONRechL"
								key="ConsultationTarif.TNUM_RCCODESECTIONRech">
							</s:label>
						</th>
						<td><s:textfield name="numRcCodeSectionRech"
								styleClass="input200" maxlength="2" /></td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCLIBELLESECTIONRechL"
								key="ConsultationTarif.TNUM_RCLIBELLESECTIONRech">
							</s:label>
						</th>
						<td><s:textfield name="numRcLibelleSectionRech"
								styleClass="input500" maxlength="255" />
						</td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCCODEPRODRechL"
								key="ConsultationTarif.TNUM_RCCODEPRODRech">
							</s:label>
						</th>
						<td><s:textfield name="numRcCodeProdRech"
								styleClass="input200" maxlength="6" />
						</td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCPRECUEMOARechL"
								key="ConsultationTarif.TNUM_RCPRECUEMOARech">
							</s:label>
						</th>
						<td><s:textfield name="numRcPrecUemoaRech"
								styleClass="input200" maxlength="2" />
						</td>
					</tr>
					<tr>
						<th><s:label id="TNUM_RCPRECSENEGALRechL"
								key="ConsultationTarif.TNUM_RCPRECSENEGALRech">
							</s:label>
						</th>
						<td><s:textfield name="numRcPrecSenegalRech"
								styleClass="input200" maxlength="2" />
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
						onclick="doSubmit('rechercherSection','rechercheSection')">
					</s:submit></td>				
					<td>

					<s:submit key="button.retour" cssClass="buttonBar"
						onclick="doReturn()"/>
						
				</td>
		</table>
	</div>

	
	<table class="FORM2" style="width:100%; margin-top: 5px;">
		<tr>
			<th class="FORM2"></th>
			<th class="FORM2" align="center"><s:text
					name="listeSection.rccodesection" /></th>
			<th class="FORM2" align="center"><s:text
					name="listeSection.rclibellesection" /></th>
		</tr>

		<s:iterator value="listeSection" id="pk">
			<tr>
				<td class="FORM3">
				<s:set var="key" value ="%{rcCodeSection +'~~'+ rcCodeRomainSection}"/>
				<s:url  var="urlConsult" action="afficherChapitreAction?page=rechercheChapitre" >
						    <s:param name="pk" value="%{#key}" />					   				   
						</s:url>
						<s:a href="%{urlConsult}" >
							<img src="config/edit1.jpg" border="0" />
						</s:a>
				</td>
				<td class="FORM3"><s:property value="rcCodeSection" /></td>
				<td class="FORM3"><s:property value="rcLibelleSection" /></td>
				

			</tr>
		</s:iterator>
		</table>

</s:form>

<script type="text/javascript">

function returnToArticle(){	
	document.forms[0].action = 'editArticleDeclarationDetailAction.action?ctxmenu=edit';
	document.forms[0].submit();
}

		
</script>
