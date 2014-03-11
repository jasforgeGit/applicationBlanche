<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimeFB.RechercheRegime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierRech" onkeyup="f9_RegimeDouanier(this,event)"
				id="TNUM_LIST_RCCODEREGIMEDOUANIERRech" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td width="60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_LIST_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalRech" onkeyup="f9_RegimeFiscal(this,event)"
				id="TNUM_LIST_RCCODEREGIMEFISCALRech" maxlength="2"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td width="60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" onkeyup="f9_TypeRegimeDouane(this,event)"
				id="TNUM_LIST_RCTYPEREGIMERech" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td width="60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_RCLIBELLEREGIMERech" /></th>
		<td><s:textfield name="numRcLibelleRegimeRech" 
				id="TNUM_RCLIBELLEREGIMERech" maxlength="250"
				cssClass="input500" /></td>
		<td width="60%"></td>
	</tr>
</table>


