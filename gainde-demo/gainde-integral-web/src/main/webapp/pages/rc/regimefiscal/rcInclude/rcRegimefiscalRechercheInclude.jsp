<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimefiscalFB.RechercheRegimefiscal" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimefiscalFB.TNUM_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numRcCodeRegimeFiscalRech"
				id="TNUM_RCCODEREGIMEFISCALRech" maxlength="2"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimefiscalFB.TNUM_RCLIBELLEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numRcLibelleRegimeFiscalRech" 
				id="TNUM_RCLIBELLEREGIMEFISCALRech" maxlength="250"
				cssClass="input500" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
</table>


