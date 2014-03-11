<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcBasestaxablesFB.RechercheBasestaxables" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBasestaxablesFB.TNUM_LIST_RCCODETAXERech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaxeRech" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXERech" maxlength="2" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcBasestaxablesFB.TNUM_LIST_RCCODETAXEBASERech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaxeBaseRech" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXEBASERech" maxlength="2" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcBasestaxablesFB.NUM_RCORDRECALCULRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcOrdreCalculRech"
				id="NUM_RCORDRECALCULRech" maxlength="4" cssClass="input100" /></div></td>
	</tr>
</table>
