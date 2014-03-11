<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcAgreeFB.RechercheAgree" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCCODEAGREERech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeAgreeRech"
				id="TNUM_RCCODEAGREERech" maxlength="3" cssClass="input100" /></div></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_LIST_RCCODEPPMRech" /></th>
		<td><div style="float: left;"><s:textfield 
			 maxlength="5" id="TNUM_LIST_RCCODEPPMRech" 
			name="numListRcCodePPMRech" cssClass="input100" onkeyup="f9_PPM1(this,event)"/></div></td>
		<td style="width: 60%;"></td>

	</tr>
	<tr>
		<th><s:text name="RcAgreeFB.TNUM_RCETATAGREERech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcEtatAgreeRech"
				id="TNUM_RCETATAGREERech" maxlength="1" cssClass="input100" /></div></td>
        <td style="width: 60%;"></td>
	</tr>
</table>