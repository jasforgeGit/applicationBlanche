<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcTauxFB.RechercheTaux" /></th>
	</tr>
	<tr>

		<th><s:text name="RcTauxFB.TNUM_RCCODETAUXRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeTauxRech"
				id="TNUM_RCCODETAUXRech" maxlength="3" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.TNUM_LIST_RCCODETAXERech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaxeRech" onkeyup="f9_Taxes(this,event)"
				id="TNUM_LIST_RCCODETAXERech" maxlength="2" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.DAT_RCDATEVALEURRech" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEVALEURRech"
				name="datRcDateValeurRech" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.TNUM_LIBELLETAUXRech" /></th>
		<s:url id="remote" action="tauxAutocomplete"/>
		<td><div style="float: left;"><s:textfield 
			id="TNUM_LIBELLETAUXRech"
			name="numLibelleTauxRech" cssClass="input200"/></div></td>
	</tr>
</table>
