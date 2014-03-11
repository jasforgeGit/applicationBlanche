<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcTyperegimedouaneFB.RechercheTyperegimedouane" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTyperegimedouaneFB.TNUM_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numRcTypeRegimeRech"
				id="TNUM_RCTYPEREGIMERech" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcTyperegimedouaneFB.TNUM_RCLIBELLEREGIMERech" /></th>
		<td><s:textfield name="numRcLibelleRegimeRech" 
				id="TNUM_RCLIBELLEREGIMERech" maxlength="100"
				cssClass="input500" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
</table>


