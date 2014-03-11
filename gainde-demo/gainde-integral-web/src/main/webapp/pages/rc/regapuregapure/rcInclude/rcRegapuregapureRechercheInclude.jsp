<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegapuregapureFB.RechercheRegapuregapure" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegapuregapureFB.TNUM_LIST_RCREGDOUAPURANTRech" /></th>
		<td><s:textfield name="numListRcRegDouApurantRech"
				id="TNUM_LIST_RCREGDOUAPURANTRech" maxlength="2" onkeyup="f9_RegimeDouanier(this, event)"
				cssClass="input200" /></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegapuregapureFB.TNUM_LIST_RCREGDOUAPURERech" /></th>
		<td><s:textfield name="numListRcRegDouApureRech"
				id="TNUM_LIST_RCREGDOUAPURERech" maxlength="2" onkeyup="f9_RegimeDouanier(this, event)"
				cssClass="input200" /></td>
		<td style="width: 60%"></td>
	</tr>
</table>


