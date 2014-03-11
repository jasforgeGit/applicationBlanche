<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegroupementFB.RechercheRegroupement" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegroupementFB.TNUM_RCCODEREGROUPRech" /></th>
		<td><s:textfield name="numRcCodeRegRoupRech"
				id="TNUM_RCCODEREGROUPRech" maxlength="10"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegroupementFB.TNUM_RCLIBELLEREGROUPRech" /></th>
		<td><s:textfield name="numRcLibelleRegRoupRech" 
				id="TNUM_RCLIBELLEREGROUPRech" maxlength="100"
				cssClass="input500" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
</table>


