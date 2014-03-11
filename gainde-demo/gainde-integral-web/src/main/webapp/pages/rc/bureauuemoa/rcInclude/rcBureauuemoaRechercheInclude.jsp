<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBureauuemoaFB.RechercheBureauuemoa" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBureauuemoaFB.TNUM_RCCODEBURUEMOARech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeBurUemoaRech"
				id="TNUM_RCCODEBURUEMOARech" maxlength="4" cssClass="input100" /></div></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcBureauuemoaFB.TNUM_RCLIBELLEBURUEMOARech" /></th>
		<td><div style="float: left;"><s:textfield 
			 maxlength="100" id="TNUM_RCLIBELLEBURUEMOARech" 
			name="numRcLibelleBurUemoaRech" cssClass="input400"/></div></td>
		<td style="width: 60%;"></td>

	</tr>
</table>
