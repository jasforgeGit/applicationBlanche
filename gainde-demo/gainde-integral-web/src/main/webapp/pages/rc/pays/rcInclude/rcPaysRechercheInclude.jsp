<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcPaysFB.RecherchePays" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_RCCODEPAYSRech" /></th>
		<td><s:textfield name="numRcCodePaysRech" 
				id="TNUM_RCCODEPAYSRech" maxlength="3"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:label key="RcPaysFB.TNUM_LIST_RCCIRCUITVISITERech"></s:label></th>
		<td><s:select id="TNUM_LIST_RCCIRCUITVISITERech"
					name="numListRcCircuitVisiteRech" 
					list="listCircuitVisite" listKey="value"
					listValue="label" cssStyle="width:200px;"/></td>
	</tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_LIST_RCCODEDEVISERech" /></th>
		<td><s:textfield name="numListRcCodeDeviseRech" onkeyup="f9_devise(this, event)"
				id="TNUM_LIST_RCCODEDEVISERech" maxlength="3"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcPaysFB.TNUM_LIST_RCCODELANGUERech" /></th>
		<td><s:textfield name="numListRcCodeLangueRech" onkeyup="f9_Langue(this, event)"
				id="TNUM_LIST_RCCODELANGUERech" maxlength="3"
				cssClass="input200" /></td>
    </tr>
	<tr>
	    <th><s:label key="RcPaysFB.TNUM_LIST_RCNATUREFISCALITERech"></s:label></th>
		<td><s:select id="TNUM_LIST_RCNATUREFISCALITERech"
					name="numListRcNatureFiscaliteRech" 
					list="listNatureFiscalite" listKey="value"
					listValue="label" cssStyle="width:200px;"/></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcPaysFB.TNUM_RCLIBELLEPAYSRech" /></th>
		<td><s:textfield name="numRcLibellePaysRech" 
				id="TNUM_RCLIBELLEPAYSRech" maxlength="100"
				cssClass="input200" /></td>
	</tr>
</table>
