<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcTaxesFB.RechercheTaxes" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCCODETAXERech" /></th>
		<td><s:textfield name="numRcCodeTaxeRech"
				id="TNUM_RCCODETAXERech" maxlength="2"
				cssClass="input200" /></td>
		<td width="60%""></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCNATURETAXERech" /></th>
		<td><s:textfield name="numRcNatureTaxeRech"
				id="TNUM_RCNATURETAXERech" maxlength="3"
				cssClass="input200" /></td>
		<td width="60%""></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesFB.TNUM_RCLIBELLETAXERech" /></th>
		<td><s:textfield name="numRcLibelleTaxeRech"
				id="TNUM_RCLIBELLETAXERech" maxlength="255"
				cssClass="input200" /></td>
		<td width="60%""></td>
	</tr>
</table>