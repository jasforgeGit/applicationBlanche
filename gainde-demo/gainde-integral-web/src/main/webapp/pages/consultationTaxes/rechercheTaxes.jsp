<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" width="100%" theme="simple">
		
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="8"><s:text
					name="ConsultationTaxes.RechercheTaxes" /></th>
		</tr>
		<tr>
			<th><s:text name="ConsultationTaxes.TNUM_RCCODETAXERech" /></th>
			<td><div style="float: left;"><s:textfield name="numRcCodeTaxeRech"
					id="TNUM_RCCODETAXERech" maxlength="2" cssClass="input200" /></div></td>
		</tr>
		<tr>
			<th><s:text name="ConsultationTaxes.TNUM_RCLIBELLETAXERech" /></th>
			<td><div style="float: left;"><s:textfield name="numRcLibelleTaxeRech"
					id="TNUM_RCLIBELLETAXERech" maxlength="255" cssClass="input500" /></div></td>
		</tr>
	</table>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit('rechercherTaxes','rechercheTaxes')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
			<td />
			<td />
			<td />
		</tr>
	</table>
</div>
	<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
			<th class="FORM2"></th>
			<th class="FORM2"><s:label key="listeTaxes.rccodetaxe" /></th>
			<th class="FORM2"><s:label key="listeTaxes.rclibelletaxe" /></th>
		</tr>
		<s:iterator value="listeTaxes">
			<tr>
				<td class="FORM3"><s:set var="key" value="rcCodeTaxe" /> <s:url
						var="link" action="rechercherTaux.action?page=rechercheTaux">
						<s:param name="pk" value="%{key}" />
					</s:url> <s:a href="%{link}">
						<img src="config/edit1.jpg" border="0" />
					</s:a></td>
				<td class="FORM3"><s:property value="rcCodeTaxe" /></td>
				<td class="FORM3"><s:property value="rcLibelleTaxe" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>