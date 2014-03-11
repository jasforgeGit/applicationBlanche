<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" width="100%" theme="simple">

	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="2"><s:text
					name="ConsultationTaxes.RechercheTaux" /></th>
		</tr>
		<tr>
			<th><s:text name="ConsultationTaxes.rccodetaxe" /></th>
			<td><div style="float: left;"><s:textfield name="rccodetaxe" readonly="true"
					id="rccodetaxe" maxlength="3" cssClass="input200" /></div></td>
		</tr>
		<tr>
			<th><s:text name="ConsultationTaxes.TNUM_RCCODETAUXRech" /></th>
			<td><div style="float: left;"><s:textfield name="numRcCodeTauxRech"
					id="TNUM_RCCODETAUXRech" maxlength="3" cssClass="input200" /></div></td>
		</tr>
		<tr>
			<th><s:text name="ConsultationTaxes.TNUM_RCLIBELLETAUXRech" /></th>
			<td><div style="float: left;"><s:textfield name="numRcLibelleTauxRech"
					id="TNUM_RCLIBELLETAUXRech" maxlength="250" cssClass="input700" /></div></td>
		</tr>
	</table>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit('rechercherTaux','rechercheTaux')"></s:submit> <s:submit
					key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRechercheTaxes','rechercheTaxes')"></s:submit></td>
			<td />
			<td />
			<td />
		</tr>
	</table>
    </div>
	<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
			<th class="FORM2"><s:label key="listeTaux.rccodetaux" /></th>
			<th class="FORM2"><s:label key="listeTaux.libelletaux" /></th>
			<th class="FORM2"><s:label key="listeTaux.rcdatevaleur" /></th>
			<th class="FORM2"><s:label key="listeTaux.rcdatecloture" /></th>
			<th class="FORM2"><s:label key="listeTaux.rcvaleurtaux" /></th>
		</tr>
		<s:iterator value="listeTaux">
			<tr>
				<td class="FORM3"><s:property value="rcCodeTaux" /></td>
				<td class="FORM3"><s:property value="libelleTaux" /></td>
				<td class="FORM3"><s:property value="rcDateValeur" /></td>
				<td class="FORM3"><s:property value="rcDateCloture" /></td>
				<td class="FORM3"><s:property value="rcValeurTaux" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>