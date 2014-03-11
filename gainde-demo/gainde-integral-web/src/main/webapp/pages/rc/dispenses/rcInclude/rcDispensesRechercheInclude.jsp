<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcDispensesFB.RechercheDispenses" /></th>
	</tr>
	<tr>
		<th><s:text name="RcDispensesFB.TNUM_RCCODEDISPENSERech" /></th>
		<td><s:textfield name="numRcCodeDispenseRech"
				id="TNUM_RCCODEDISPENSERech" maxlength="5"
				cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcDispensesFB.TNUM_LIST_RCCODETAXERech" /></th>
		<td><s:textfield name="numListRcCodeTaxeRech" onkeyup="f9_Taxes(this, event)"
				id="TNUM_LIST_RCCODETAXERech" maxlength="2"
				cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcDispensesFB.TNUM_RCDESDISPENSERech" /></th>
		<td><s:textfield name="numRcDesDispenseRech" onkeyup="f9_Taxes(this, event)"
				id="TNUM_RCDESDISPENSERech" maxlength="100"
				cssClass="input400" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
</table>

